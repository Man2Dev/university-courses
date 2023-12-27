----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    07:01:45 01/06/2021 
-- Design Name: 
-- Module Name:    Top - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Top is
		Port(A:in STD_LOGIC;
			B:in STD_LOGIC;
			C:in STD_LOGIC;
			Sum:out STD_LOGIC;
			Carry:out STD_LOGIC);
end Top;

architecture Behavioral of Top is
	
	component HA is
		Port(a:in STD_LOGIC;
			b:in STD_LOGIC;
			s:out STD_LOGIC;
			c:out STD_LOGIC);
	end component;
	
	Signal s1,c1,c2:STD_LOGIC;

	begin
			component0:HA port map( a=>A,b=>B,s=>s1,c=>c1);
			component1:HA port map( a=>s1,b=>C,s=>Sum,c=>c2);
			Carry<=c1 or c2;
end Behavioral;