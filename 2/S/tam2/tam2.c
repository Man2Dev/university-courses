#include <mega16.h>     
#include <delay.h>   
  
void main(void) {
 
DDRA=0XFF;
DDRB=0XFF;
PORTA=0X00;
PORTB=0X00;
 
while (1){  
    PORTB= PORTB << 1;
    delay_ms(10);
        
    PORTA= PORTA << 1;
    delay_ms(10);
     
    if (PORTB==0) {
        PORTB=0X01;
        delay_ms(10);   
    };
    
    if (PORTA==0) {
        PORTA=0X01;
        delay_ms(10);
    };
  }
}

