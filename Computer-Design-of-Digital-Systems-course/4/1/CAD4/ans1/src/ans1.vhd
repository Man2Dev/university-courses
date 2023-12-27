-------------------------------------------------------------------------------
--
-- Title       : ans1
-- Design      : ans1
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity ans1 is
	Port ( qin : in STD_LOGIC;
		y1 : out  STD_LOGIC;
		y2 : out  STD_LOGIC;
		y3 : out  STD_LOGIC;
		y4 : out  STD_LOGIC;
		y5 : out  STD_LOGIC);
end ans1;

--}} End of automatically maintained section

architecture ans1 of ans1 is
begin
	
	y1 <= qin;
	y2 <= qin after 1ns;
	y3 <= inertial qin after 1ns;
	y4 <= transport qin after 1ns;
	y5 <= reject 500ps inertial qin after 1ns;	
	
end ans1;
