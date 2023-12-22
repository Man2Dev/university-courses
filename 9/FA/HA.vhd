----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    06:33:16 01/06/2021 
-- Design Name: 
-- Module Name:    HA - Behavioral 
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

entity HA is
	Port(A:in STD_LOGIC;
		B:in STD_LOGIC;
		S:out STD_LOGIC;
		C:out STD_LOGIC);
end HA;

architecture Behavioral of HA is
begin
			process(A,B)
			begin
						S<=A xor B;
						C<=A and B;
			end process;
end Behavioral;
