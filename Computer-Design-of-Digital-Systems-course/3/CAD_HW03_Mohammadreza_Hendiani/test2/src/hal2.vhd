-------------------------------------------------------------------------------
--
-- Title       : hal2
-- Design      : test2
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_unsigned.all;
use ieee.numeric_std.all;


entity hal2 is
	Port ( clk : in  STD_LOGIC;
		reset : in  STD_LOGIC;
		control_signal : in  STD_LOGIC_VECTOR(1 downto 0);
		r2_in : in  STD_LOGIC_VECTOR (3 downto 0);
		r1_out : out  STD_LOGIC_VECTOR (3 downto 0);
		r2_out : out  STD_LOGIC_VECTOR (3 downto 0));
end hal2;											   

architecture hal2 of hal2 is
	
	signal r1 : STD_LOGIC_VECTOR(3 downto 0);
	signal r2 : STD_LOGIC_VECTOR(3 downto 0);
	
	signal r1_next : STD_LOGIC_VECTOR(3 downto 0);
	signal add_out : STD_LOGIC_VECTOR(3 downto 0);
	signal inc_out : STD_LOGIC_VECTOR(3 downto 0);
	
begin
	
	add_out <= r1 + r2;
	inc_out <= r1 + "0001";
	
	r1_next <= "0001"  when control_signal = "00" else
	add_out when control_signal = "01" else
	inc_out when control_signal = "10" else
	r1;
	
	process(clk,reset)
	begin
		if(reset = '1')then
			r1 <= "0000";
			r2 <= "0000";
		elsif(rising_edge(clk))then
			r1 <= r1_next;
			r2 <= r2_in;
		end if;
	end process;
	
	r1_out <= r1;
	r2_out <= r2;
	
end hal2;
