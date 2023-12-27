-------------------------------------------------------------------------------
--
-- Title       : test
-- Design      : CAD2
-- Author      : Mohammadreza_Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.numeric_std.all;

entity test is 
	generic(
		N : positive := 7
		);
	port(
		input: in  std_logic_vector(N-1 downto 0); 
		parity_even : out std_logic;
		parity_odd : out std_logic
		);
end test;


architecture test of test is
	signal temp:std_logic_vector(N-3 downto 0);
begin
	temp(0) <= input(0) xor input(1);
	STAGES: for i in 1 to N-3 generate
		temp(i) <= (temp(i-1) xor input(i+1));
	end generate stages;
	parity_even <= temp(n-3) xor input(n-1);
	parity_odd <= not (temp(n-3) xor input(n-1));
end test;
