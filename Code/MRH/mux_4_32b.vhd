library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity mux_4_32b is
    Port ( ctrl : in  STD_LOGIC_VECTOR (1 downto 0);
           a : in  STD_LOGIC_VECTOR (31 downto 0);
           b : in  STD_LOGIC_VECTOR (31 downto 0);
           c : in  STD_LOGIC_VECTOR (31 downto 0);
           d : in  STD_LOGIC_VECTOR (31 downto 0);
           sal : out  STD_LOGIC_VECTOR (31 downto 0));
end mux_4_32b;

architecture Behavioral of mux_4_32b is

begin
	sal<= a when (ctrl="00") else
			b when (ctrl="01") else
			c when (ctrl="10") else
			d;

end Behavioral;

