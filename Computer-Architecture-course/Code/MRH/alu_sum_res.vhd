library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity alu_sum_res is
    Port ( ctrl : in  STD_LOGIC;
           a : in  STD_LOGIC_VECTOR (31 downto 0);
           b : in  STD_LOGIC_VECTOR (31 downto 0);
           sol : out  STD_LOGIC_VECTOR (31 downto 0);
           cout : out  STD_LOGIC);
end alu_sum_res;

architecture Behavioral of alu_sum_res is

signal result : std_logic_vector(32 downto 0);
begin
	
	result<=("0" & a) + ("0" & b) + ctrl;
	sol<=result(31 downto 0);
	cout<=result(32);

end Behavioral;

