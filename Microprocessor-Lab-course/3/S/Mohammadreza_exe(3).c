#include <mega16.h>
#include <lcd.h>
#include <delay.h>

#asm
.equ __lcd_port=0x1B;
#endasm

char text1[]={'9','8','7','6','5','4','3','2','1'};

void main(void) {
int i,j;
lcd_init(16);
 while (1) {
    for(i=4;i<=12;i++){
        lcd_gotoxy(i,0);
        lcd_putchar(text1[i-4]); 
        delay_ms(150); 
    }
    lcd_clear();
    delay_ms(200);

    for (j=4;j>=0;j--){
        lcd_gotoxy(j,0);
        lcd_putsf("Mohammadreza");  
        lcd_gotoxy(j+2,1);
        lcd_putsf("Hendiani")   ;
        delay_ms(150);   
        lcd_clear();
    }
    delay_ms(200);
    
    for (j=0;j<=4;j++){
        lcd_gotoxy(j,0);
        lcd_putsf("960122680076");
        delay_ms(150);   
        lcd_clear();
    }
    delay_ms(200);
 }
}
