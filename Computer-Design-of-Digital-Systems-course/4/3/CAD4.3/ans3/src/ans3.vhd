-------------------------------------------------------------------------------
--
-- Title       : ans3
-- Design      : ans3
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_unsigned.all;
use ieee.numeric_std.all;

entity ans3 is
	Port ( clk : in  STD_LOGIC;
		a : in  STD_LOGIC;
		b : in  STD_LOGIC;
		enter_out : out  STD_LOGIC;
		exit_out : out  STD_LOGIC;
		in_counter : out  STD_LOGIC_VECTOR (9 downto 0);
		out_counter : out  STD_LOGIC_VECTOR (9 downto 0));
end ans3;

architecture ans3 of ans3 is  
	signal state : STD_LOGIC_VECTOR(3 downto 0) := "0000";
	signal t : STD_LOGIC_VECTOR(1 downto 0);
	signal in_counter_t : STD_LOGIC_VECTOR(9 downto 0) := (others => '0');
	signal out_counter_t : STD_LOGIC_VECTOR(9 downto 0) := (others => '0');
	
begin
	
	t <= (a&b);
	
	process(clk)
	begin
		if(rising_edge(clk))then
			if(state = "0000")then
				if(t = "00")then
					state <= state;
				elsif(t = "01")then
					state <= "0001";
				elsif(t = "10")then
					state <= "0101";
				else
					state <= "0000";
				end if;
			elsif(state = "0001")then
				if(t = "01")then
					state <= state;
				elsif(t = "11")then
					state <= "0010";
				else
					state <= "0000";
				end if;
			elsif(state = "0010")then
				if(t = "11")then
					state <= state;
				elsif(t = "10")then
					state <= "0011";
				else
					state <= "0000";
				end if;
			elsif(state = "0011")then
				if(t = "10")then
					state <= state;
				elsif(t = "00")then
					state <= "0100";
					out_counter_t <= out_counter_t + 1;
				else
					state <= "0000";
				end if;
			elsif(state = "0100")then
				if(t = "01")then
					state <= "0001";
				elsif(t = "10")then
					state <= "0101";
				else
					state <= "0000";
				end if;
			elsif(state = "0101")then
				if(t = "10")then
					state <= state;
				elsif(t = "11")then
					state <= "0110";
				else
					state <= "0000";
				end if;
			elsif(state = "0110")then
				if(t = "11")then
					state <= state;
				elsif(t = "01")then
					state <= "0111";
				else
					state <= "0000";
				end if;
			elsif(state = "0111")then
				if(t = "01")then
					state <= state;
				elsif(t = "00")then
					state <= "1000";
					in_counter_t <= in_counter_t + 1;
				else
					state <= "0000";
				end if;
			elsif(state = "1000")then
				if(t = "01")then
					state <= "0001";
				elsif(t = "10")then
					state <= "0101";
				else
					state <= "0000";
				end if;			
			else
				state <= "0000";
			end if;
		end if;
	end process;
	
	
	enter_out <= '1' when state = "1000" else '0';
	exit_out <= '1' when state = "0100" else '0';
	
	in_counter <= in_counter_t;
	out_counter <= out_counter_t;
	
end ans3;
