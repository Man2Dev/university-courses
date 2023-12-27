library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Mux_2to1_32b is
    Port ( ctrl : in  STD_LOGIC;
           A : in  STD_LOGIC_VECTOR (31 downto 0);
           B : in  STD_LOGIC_VECTOR (31 downto 0);
           O : out  STD_LOGIC_VECTOR (31 downto 0));
end Mux_2to1_32b;

architecture Behavioral of Mux_2to1_32b is

begin
	o <= 	a 	when ctrl='0' else b;
			
end Behavioral;

