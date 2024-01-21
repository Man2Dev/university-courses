library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

architecture Behavioral of ControlUnit is
	
	COMPONENT ALUdecoder
	PORT(
		ALUop : IN std_logic_vector(1 downto 0);
		funct : IN std_logic_vector(5 downto 0);          
		ALUctrl : OUT std_logic_vector(2 downto 0)
		);
	END COMPONENT;

	signal opalu:std_logic_vector(1 downto 0);

begin

Inst_MainDecoder: MainDecoder PORT MAP(
		opcode => opcode,
		RegWrite => regwrite,
		RegDst => regdst,
		ALUSrc => alusrc ,
		Branch => branch,
		MemWrite => memwrite,
		MemtoReg => memtoreg,
		ALUOp => opalu,
		Jump => jump
	);

Inst_ALUdecoder: ALUdecoder PORT MAP(
		ALUop => opalu,
		funct => funct,
		ALUctrl => aluctrl
	);
	
end Behavioral;

