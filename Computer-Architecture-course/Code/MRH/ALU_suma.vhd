library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_unsigned.all;

entity ALU_suma is
    Port ( 
				a : in  STD_LOGIC_VECTOR (31 downto 0);
				b : in  STD_LOGIC_VECTOR (31 downto 0);
				sal : out  STD_LOGIC_VECTOR (31 downto 0));
end ALU_suma;

architecture Behavioral of ALU_suma is

begin
	
	sal<=a+b;
	
end Behavioral;

