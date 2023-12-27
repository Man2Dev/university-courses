library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity SignExtend is
    Port ( din : in  STD_LOGIC_VECTOR (15 downto 0);
           dout : out  STD_LOGIC_VECTOR (31 downto 0));
end SignExtend;

architecture Behavioral of SignExtend is

begin
dout<= x"0000"&din when (din(15)='0') else  x"ffff"&din;
		
		
		
	
end Behavioral;

