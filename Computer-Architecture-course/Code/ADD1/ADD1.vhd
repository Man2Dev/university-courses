----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    20:46:05 01/13/2021 
-- Design Name: 
-- Module Name:    ADD1 - Behavioral 
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
use IEEE.STD_LOGIC_UNSIGNED.all;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity ADD1 is
	Port ( I_ADD1 : in STD_LOGIC_VECTOR (31 downto 0);
			 O_ADD1 : out STD_LOGIC_VECTOR (31 downto 0));
end ADD1;

architecture Behavioral of ADD1 is

begin

	O_ADD1 <= I_ADD1 + x"00000001";
end Behavioral;

