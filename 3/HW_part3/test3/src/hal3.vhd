-------------------------------------------------------------------------------
--
-- Title       : hal3
-- Design      : test3
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_unsigned.all;
use ieee.numeric_std.all;


entity hal3 is
	Port ( clk : in  STD_LOGIC;
		reset : in  STD_LOGIC;
		cmd : in  STD_LOGIC_VECTOR (2 downto 0);
		data_in : in  STD_LOGIC_VECTOR (7 downto 0);
		data_out : out  STD_LOGIC_VECTOR (7 downto 0));
end hal3;									  

architecture hal3 of hal3 is
	
	signal data : STD_LOGIC_VECTOR(7 downto 0);	  
	
begin
	
	process(clk,reset)
	begin
		if(reset = '1')then
			data <= "00000000";
		elsif(rising_edge(clk))then
			if(cmd = "000")then
				data <= data;
			elsif(cmd = "001")then
				data <= "11111111";
			elsif(cmd = "010")then
				data <= "00000000";
			elsif(cmd = "011")then
				data <= ('0'&data(7 downto 1));
			elsif(cmd = "100")then
				data <= data(6 downto 0)&'0';
			elsif(cmd = "101")then
				data <= data + 1;
			elsif(cmd = "110")then
				data <= data - 1;
			else
				data <= data_in;
			end if;
		end if;
	end process;
	data_out <= data;
	
end hal3;
