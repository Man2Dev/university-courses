-------------------------------------------------------------------------------
--
-- Title       : test
-- Design      : CAD
-- Author      : Mohammadreza_Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity test is
	port(
		r : in STD_LOGIC_VECTOR(3 downto 0);
		code : out STD_LOGIC_VECTOR(1 downto 0);
		act : out STD_LOGIC
		);
end test;


architecture test of test is
begin	
	code <= "11" when r(3)='1' else
	"10" when r(3 downto 2)="01" else
	"01" when r(3 downto 1)="001" else
	"00" when r(3 downto 0)="0001" else
	"00" when r(3 downto 0)="0000" else
	(others => 'X');
	act <=  '1' when r(3)='1' else
	'1' when r(3 downto 2)="01" else
	'1' when r(3 downto 1)="001" else
	'1' when r(3 downto 0)="0001" else
	'0' when r(3 downto 0)="0000" else
	'X';
end test;