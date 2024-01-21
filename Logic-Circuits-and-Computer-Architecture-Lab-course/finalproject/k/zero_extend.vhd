library IEEE;
use IEEE.NUMERIC_STD.ALL;
use IEEE.STD_LOGIC_1164.ALL;

entity zero_extend is
    Port ( inic : in  STD_LOGIC;
           extend : out  STD_LOGIC_VECTOR (31 downto 0));
end zero_extend;

architecture Behavioral of zero_extend is

begin
	extend<=x"0000000"&"000"&inic;

end Behavioral;

