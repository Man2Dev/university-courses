//Define Constants

#include "DHT.h"
#include <SPI.h>         // Remember this line!
#include <DAC_MCP49x1.h>
#define SS_PIN 10
#define LDAC_HEATER 5
#define LDAC_COOLER 6
#define LDAC_HUMIDITY 7

//Define Pins

#define DHT1PIN 2     
#define DHT2PIN 3     
#define DHT3PIN 4

//Define Motors Actions
 
#define motor_off 0
#define motor_low 2048
#define motor_high 4095

//Define Cooler And Heater And Hummedity Control
#define co_on 1
#define co_low 0
#define co_high 1
#define co_he_off 0

#define he_on 2
#define he_low 0
#define he_high 1

#define humm_off 0
#define humm_low 1
#define humm_high 2

#define turn_all_off 3



#define DHTTYPE DHT22   // DHT 22  (AM2302)

DHT dht1(DHT1PIN, DHTTYPE, 4);
DHT dht2(DHT2PIN, DHTTYPE, 4);
DHT dht3(DHT3PIN, DHTTYPE, 4);

DAC_MCP49x1 dac_heater(DAC_MCP49x1::MCP4921, SS_PIN, LDAC_HEATER);
DAC_MCP49x1 dac_cooler(DAC_MCP49x1::MCP4921, SS_PIN, LDAC_COOLER);
DAC_MCP49x1 dac_humidity(DAC_MCP49x1::MCP4921, SS_PIN, LDAC_HUMIDITY);



void setup() {
	Serial.begin(9600);
	Serial.println("Final-Project");

	dac_heater.setSPIDivider(SPI_CLOCK_DIV16);
	dac_cooler.setSPIDivider(SPI_CLOCK_DIV16);
	dac_humidity.setSPIDivider(SPI_CLOCK_DIV16);

        dac_heater.setPortWrite(false);
	dac_cooler.setPortWrite(false);
	dac_humidity.setPortWrite(false);

	dht1.begin();
	dht2.begin();
	dht3.begin();
}

int presentState = co_he_off;
int nextState;
 int heaterPresentState;
 int heaterNextState;
 int coolerPresentState;
 int coolerNextState;
 int huPresentState = humm_off;
 int huNextState;


void loop() {

	delay(1000);


	float h1 = dht1.readHumidity();
	float h2 = dht2.readHumidity();
	float h3 = dht3.readHumidity();

	float t1 = dht1.readTemperature();
	float t2 = dht2.readTemperature();
	float t3 = dht3.readTemperature();

	
	if (isnan(h1) || isnan(t1) || isnan(h2) || isnan(t2) || isnan(h3) || isnan(t3)) {
		Serial.println("Failed to read from DHT sensor!");
		return;
	}

	float h = (h1 + h2 + h3) / 3;
	float t = (t1 + t2 + t3) / 3;

	Serial.print("Humm: ");
	Serial.print(h);
	Serial.print("%       ");
	Serial.print("Temperature: ");
	Serial.print(t);
	Serial.println(" *C ");

	
	switch (presentState) {
	case co_he_off:
		dac_cooler.output(motor_off);
		dac_cooler.latch();
		dac_heater.output(motor_off);
		dac_heater.latch();
		Serial.print("Co-----> off        He----->off ");
		if (t < 20) {
			nextState = he_on;
			heaterPresentState = he_low;
		}
		else if (t > 32) {
			nextState = co_on;
			coolerPresentState = co_low;
		}
		break;

	case co_on:
		switch (coolerPresentState) {
		case co_low:
			Serial.print("Co-----> Low	         He-----> off	");
			dac_cooler.output(motor_low);
			dac_cooler.latch();
			if (t < 28)
				coolerNextState = turn_all_off;
			else if (t > 38)
				coolerNextState = co_high;
			break;
		case co_high:
			Serial.print("Co-----> high	        He----->off	");
			dac_cooler.output(motor_high);
			dac_cooler.latch();
			if (t < 35)
				coolerNextState = co_low;
			break;
		}
		coolerPresentState = coolerNextState;
		if (t < 28)
			nextState = co_he_off;
		break;
				case he_on:
		switch (heaterPresentState) {
		case he_low:
			Serial.print("Co-----> off	    He----->Low	");
			dac_heater.output(motor_low);
			dac_heater.latch();
			if (t > 23)
				heaterNextState = turn_all_off;
			else if (t < 15)
				heaterNextState = he_high;
			break;
		case he_high:
			Serial.print("Co-----> off	   He----->high");
			dac_heater.output(motor_high);
			dac_heater.latch();
			if (t > 17)
				heaterNextState = he_low;
			break;
		}
	
		heaterPresentState = heaterNextState;
		if (t > 23)
			nextState = co_he_off;
		break;
	}
	presentState = nextState;

	switch (huPresentState) {
	case humm_off:
		dac_humidity.output(motor_off);
		dac_humidity.latch();
		Serial.println("   Humm----->off");
		if (h < 80)
			huNextState = humm_low;
		break;
	case humm_low:
		dac_humidity.output(motor_low);
		dac_humidity.latch();
		Serial.println(" Humm----->low");
		if (h < 70)
			huNextState = humm_high;
		else if (h > 85)
			huNextState = humm_off;
		break;
	case humm_high:
		dac_humidity.output(motor_high);
		dac_humidity.latch();
		Serial.println(" Humm----->high");
		if (h > 75)
			huNextState = humm_low;
		break;
	}
	huPresentState = huNextState;
	
	Serial.println();
}