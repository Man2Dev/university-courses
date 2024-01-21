		.INCLUDE "M32DEF.INC"
		.ORG $00
		RJMP main
		.ORG $100
		.DB $11,$21,$41,$81,$12,$22,$42,$82,$14,$24,$44,$84,$18,$28,$48,$88
		.ORG $200

main:   LDI R16,$0F		;megdar midim
	    OUT DDRA,R16	;portA 3-0: out & portA 7-4: in
	    CLR R16			;sefr mikonim
	    OUT SFIOR,R16	;PUD=0 mogavemat dakhely fale beshe
		SER R16			;be khode port bayad yek ersal she pas yekash mikonim
		ANDI R16,$0F	
		OUT PORTA,R16
		SER R16
		OUT DDRB,R16
		CLR R18
wait1:	IN R16,PINA
		ORI R16,$0F
		CPI R16,$0F
		BRNE wait1
loop1:	LDI R17,$01
wait2:	OUT PORTA,R17
		IN R16,PINA
		ORI R16,$0F
		CPI R16,$0F
		BRNE serch
		INC R18 
		LSL R17;
		CPI R18,4
		BRNE wait2
		CLR R18
		RJMP loop1
serch:	ORI R17,$F0
		AND R16,R17
		CLR R18
		CLR R30
		LDI R31,$02
loop2:	LPM R17,Z
		CP R17,R16
		BREQ end
		INC R18
		INC R30
		CPI R18,16
		BRNE loop2
		RJMP wait1
end:	OUT PORTB,R30