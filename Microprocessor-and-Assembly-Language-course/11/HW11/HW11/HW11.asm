
	.INCLUDE "M32DEF.INC"
	.ORG $00
	RJMP main
	.ORG $200
	.DB $3F,$06,$5B,$4F,$66,$6D,$7D,$07,$7F,$6F
	.ORG $300
		
main:	CLR R16
		OUT DDRA,R16	
		OUT SFIOR,R16	
		SER R16			
		OUT PORTA,R16	
		OUT DDRB,R16	
		OUT DDRC,R16
		IN R16,PINA		
		CLR R17
		CLR R15
l1:		CPI R16,100
		BRLO l3
		SUBI R16,100
		INC R15
		RJMP l1
l3:		CPI R16,10 ;division
		BRLO exit
		SUBI R16,10
		INC R17
		RJMP l3
exit:	LDI R31,$04
		MOV R30,R16
		LPM R18,Z
		MOV R30,R17 
		LPM R19,Z
		MOV R30,R15
		LPM R20,Z
l2:		SBI PORTC,0
		SBI PORTC,1
		SBI PORTC,2 
		OUT PORTB,R18
		CBI PORTC,0
		SBI PORTC,0
		OUT PORTB,R19
		CBI PORTC,1
		SBI PORTC,1
		OUT PORTB,R20
		CBI PORTC,2
		RJMP l2

