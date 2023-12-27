library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_arith.all;
use ieee.std_logic_unsigned.all;

entity Instruction_Memory is
    Port ( dir : in  STD_LOGIC_VECTOR (31 downto 0);
           instr : out  STD_LOGIC_VECTOR (31 downto 0));
end Instruction_Memory;

architecture Behavioral of Instruction_Memory is
	type mem is array(0 to 511) of std_logic_vector(7 downto 0);
	constant code : mem:=(

		x"20",x"11",x"00",x"06",
		x"20",x"12",x"00",x"04",
		x"20",x"10",x"00",x"00",
		x"20",x"13",x"00",x"00",
		x"12",x"11",x"00",x"03",
		x"02",x"72",x"98",x"20",
		x"22",x"10",x"00",x"01",
		x"08",x"00",x"00",x"04",

	others=> x"00");

begin

	process(dir)
	begin
		instr(31 downto 24)<=code(conv_integer(dir));
		instr(23 downto 16)<=code(conv_integer(dir)+1);
		instr(15 downto 8)<= code(conv_integer(dir)+2);
		instr(7 downto 0)<=code(conv_integer(dir)+3);
	end process;
	
end Behavioral;
