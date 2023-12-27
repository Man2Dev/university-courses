-------------------------------------------------------------------------------
--
-- Title       : ans2
-- Design      : ans2
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity ans2 is
	Port ( clk : in  STD_LOGIC;
		reset : in  STD_LOGIC;
		x : in  STD_LOGIC;
		o : out  STD_LOGIC);
end ans2;											   

architecture ans2 of ans2 is
	
	signal state : STD_LOGIC_VECTOR(2 downto 0);
	
begin
	
	process(clk)
	begin
		if(rising_edge(clk))then
			if(reset = '1')then
				state <= "000";
			else
				case(state) is
					when "000" => if(x = '1')then state <= "001"; else state <= "000";end if;
					when "001" => if(x = '1')then state <= "001"; else state <= "010";end if;
					when "010" => if(x = '1')then state <= "011"; else state <= "000";end if;
					when "011" => if(x = '1')then state <= "001"; else state <= "100";end if;
					when "100" => if(x = '1')then state <= "011"; else state <= "101";end if;
					when "101" => if(x = '1')then state <= "110"; else state <= "000";end if;
					when "110" => if(x = '1')then state <= "001"; else state <= "010";end if;
					when others => state <= "000";
				end case;
			end if;
		end if;
	end process;
	
	o <= '1' when state = "110" else '0';
	
end ans2;
