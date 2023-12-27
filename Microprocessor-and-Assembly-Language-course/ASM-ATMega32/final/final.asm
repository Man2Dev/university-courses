.INCLUDE "M32DEF.INC"
.ORG $00
RJMP main
.ORG $100

main:   LDI R16,$0F		;0000 1111
	    OUT DDRA,R16	;portA 3-0 (output) & 7-4 (input)
	    CLR R16
	    OUT SFIOR,R16	;PUD= 0
		SER R16
		ANDI R16,$0F
		OUT PORTA,R16
		SER R16
		OUT DDRB,R16
		OUT DDRC,R16
		CLR R18			;clearing counter
wait1:	IN R16,PINA
		ORI R16,$0F
		CPI R16,$0F
		BRNE wait1
loop1:	LDI R17,$01		;R17= 0000 0001 (o1h) (Row0=1)
wait2:	OUT PORTA,R17
		IN R16,PINA
		ORI R16,$0F
		CPI R16,$0F
		BRNE check
		INC R18
		LSL R17			;shifting to next Row
		CPI R18,4
		BRNE wait2		;loop for next Row
		CLR R18
		RJMP loop1		;resetting Row and counter
check:	ORI R17,$F0
		AND R16,R17		;R16= cccc rrrr
		CLR R18			;clearing counter
		BREQ keys
check0:	SBI PORTC,0
		LDI R20,$0F		;flag that 0 is chousen
		RJMP end
check9:	CBI PORTC,0
		CLR R20			;flag that 9 is chousen
		RJMP end
key8:	LDI R17,$7F		;value we want to out put (8)
		OUT PORTB,R17
delay8:	LDI R21,$F0		;loop for delay (each loop roughly 0.25s)
l81:	LDI R19,$FF
l82:	DEC R19
		CPI R19,0
		BRNE l82
		DEC R21
		CPI R21,0
		BRNE l81
		INC R18			;inc counter
		CPI R18,16		;total delay to roughly (16 x 0.25 => 4s)
		BRNE delay8
		LDI R17,$00		;ressting
		RJMP end
key10:	LDI R17,$01		;value we want to satrt shifting (01h)
loop10:	OUT PORTB,R17	;outer loop for outputing results
		CLR R22			;counter for delay loop
delay:	LDI R21,$F0		;loop for delay (each loop roughly 0.25s)
l1:		LDI R19,$FF
l2:		DEC R19
		CPI R19,0
		BRNE l2
		DEC R21
		CPI R21,0
		BRNE l1
		INC R22	
		CPI R22,2		;total delay to roughly (2 x 0.25 => 0.5s)
		BRNE delay
		INC R18			;inc outer loop counter
		LSL R17			;shift
		CPI R18,6		;repeating for 6 seg (a to f)
		BRNE loop10
		LDI R17,$00		;ressting
		RJMP end
keys:	LDI R17,$00		;reseting r17 for 9 and 0s
		CPI R16,$42		;Check if user choose 9
		BREQ check9
		CPI R20,$0F		;Check if 0 hase bean chousen before
		BREQ end
		CPI R16,$21		;Check if user choose 0	
		BREQ check0
		CPI R16,$18		;Check if user choose 1
		LDI R17,$01
		BREQ end
		CPI R16,$28		;Check if user choose 2
		LDI R17,$02
		BREQ end
		CPI R16,$48		;Check if user choose 3
		LDI R17,$04
		BREQ end
		CPI R16,$14		;Check if user choose 4
		LDI R17,$08
		BREQ end
		CPI R16,$24		;Check if user choose 5
		LDI R17,$10
		BREQ end
		CPI R16,$44		;Check if user choose 6
		LDI R17,$20
		BREQ end
		LDI R17,$00		;resetting value for other keys
		CPI R16,$22		;Check if user choose 8
		BREQ key8
		CPI R16,$82		;Check if user choose 10
		BREQ key10
end:	OUT PORTB,R17
exit: