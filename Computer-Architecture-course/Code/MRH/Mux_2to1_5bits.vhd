library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Mux_2to1_5bits is
    Port ( ctrl : in  STD_LOGIC;
           a : in  STD_LOGIC_VECTOR (4 downto 0);
           b : in  STD_LOGIC_VECTOR (4 downto 0);
           sal : out  STD_LOGIC_VECTOR (4 downto 0));
end Mux_2to1_5bits;

architecture Behavioral of Mux_2to1_5bits is

begin
	sal <= 	a 	when ctrl='0' else b;

end Behavioral;

