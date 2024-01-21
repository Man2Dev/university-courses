-------------------------------------------------------------------------------
--
-- Title       : top
-- Design      : CAD3.2
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
	signal xor_temp : std_logic_vector(3 downto 0); 
begin
	STAGES: for i in 0 to 3 generate
		xor_temp(i) <= B(i) xor Z(i);
		x(i) <= B(i) when xor_temp(i) = '0' else
		(A(i) or Z(i)) when xor_temp(i) = '1' else
		'X';
		Z(i+1) <= A(i) and Z(i);
	end generate stages;
end top;