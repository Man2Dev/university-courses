----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    15:55:14 01/13/2021 
-- Design Name: 
-- Module Name:    PC - Behavioral 
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

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity PC is

	Port ( I_PC_TOGGLE : in STD_LOGIC;
			 I_PC : in STD_LOGIC_VECTOR (31 downto 0);
			 O_PC : out STD_LOGIC_VECTOR (31 downto 0) := (others=>'0'));
end PC;

architecture Behavioral of PC is

	signal temp : STD_LOGIC_VECTOR (31 downto 0):= (others=>'0');
begin

	process (I_PC_TOGGLE, I_PC, temp)
	begin
		if rising_edge (I_PC_TOGGLE) then
			temp <= I_PC;
		end if;
		if falling_edge (I_PC_TOGGLE) then
			O_PC <= temp;
		end if;
	end process;
end Behavioral;

