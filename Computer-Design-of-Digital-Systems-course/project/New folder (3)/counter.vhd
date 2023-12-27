library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_unsigned.all;
use ieee.numeric_std.all;
entity counter is
    Port ( clk : in  STD_LOGIC;
           reset : in  STD_LOGIC;
           enable_in : in  STD_LOGIC;
           enable_out : out  STD_LOGIC);
end counter;

architecture Behavioral of counter is

signal temp : STD_LOGIC_VECTOR(3 downto 0);

begin
process(clk)
begin
	if(rising_edge(clk))then
		if(reset = '1')then
			temp <= "0000";
		else
			if(enable_in = '1')then
				if(temp = "1001")then
					temp <= "0000";
					enable_out <= '1';
				else
					temp <= temp + 1;
					enable_out <= '0';
				end if;
			end if;
		end if;
	end if;
end process;

end Behavioral;

