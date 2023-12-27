-------------------------------------------------------------------------------
--
-- Title       : subModule
-- Design      : CAD3
-- Author      : Mohammadreza_Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.numeric_std.all;

entity subModule is
	port(
		A,B,Z: in  std_logic;
		X,Y : out std_logic
		);
end subModule;


architecture subModule of subModule is 
	signal xor_temp : std_logic:='0'; 	
begin
	xor_temp <= B xor Z;
	x <= B when xor_temp = '0' else
	(A or Z) when xor_temp = '1' else
	'X';
	Y <= A and Z;
end subModule;