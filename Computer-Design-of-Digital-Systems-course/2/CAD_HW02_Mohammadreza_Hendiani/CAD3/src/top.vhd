-------------------------------------------------------------------------------
--
-- Title       : top
-- Design      : CAD3
-- Author      : Mohammadreza_Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.numeric_std.all;

entity top is
	port(
		A,B: in  std_logic_vector(3 downto 0);
		Z : inout std_logic_vector(4 downto 0);
		X : out std_logic_vector(3 downto 0)
		);
end top;


architecture top of top is
	COMPONENT subModule is
		port(
			A,B,Z: in  std_logic;
			X,Y : out std_logic
			);
	end component subModule;
begin	 
	uut1: subModule PORT MAP (
		A => A(0),
		B => B(0),
		Z => Z(0),
		X => X(0),
		Y => Z(1)
		);
	uut2: subModule PORT MAP (
		A => A(1),
		B => B(1),
		Z => Z(1),
		X => X(1),
		Y => Z(2)
		);
	uut3: subModule PORT MAP (
		A => A(2),
		B => B(2),
		Z => Z(2),
		X => X(2),
		Y => Z(3)
		);
	uut4: subModule PORT MAP (
		A => A(3),
		B => B(3),
		Z => Z(3),
		X => X(3),
		Y => Z(4)
		);
end top;
