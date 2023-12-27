library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity corrimiento is
    Port ( din : in  STD_LOGIC_VECTOR (31 downto 0);
           dout : out  STD_LOGIC_VECTOR (31 downto 0));
end corrimiento;

architecture Behavioral of corrimiento is

begin
	dout<=din(29 downto 0)&"00";
end Behavioral;

