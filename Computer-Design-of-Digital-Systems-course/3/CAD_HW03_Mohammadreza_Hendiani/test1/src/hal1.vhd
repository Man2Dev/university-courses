-------------------------------------------------------------------------------
--
-- Title       : hal1
-- Design      : test1
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity hal1 is
	Port ( a : in  STD_LOGIC;
		b : in  STD_LOGIC;
		c : in  STD_LOGIC;
		d : in  STD_LOGIC;
		z : out  STD_LOGIC);
end hal1;


architecture hal1 of hal1 is 
	
	signal t0 :STD_LOGIC;
	signal t1 :STD_LOGIC;
	signal t2 :STD_LOGIC;
	signal t3 :STD_LOGIC;
	signal t4 :STD_LOGIC;
	
begin
	
	t0 <= b      or  c;
	t1 <= not(c) or  d;
	t2 <= not(d) or  b;
	t3 <= t0     and t1;
	t4 <= t2     and t3;
	z  <= t4     and a;
	
end hal1;
