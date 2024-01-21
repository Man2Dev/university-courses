----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    00:03:52 01/14/2021 
-- Design Name: 
-- Module Name:    EXT - Behavioral 
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

entity EXT is
	Port (I_EXT : in	STD_LOGIC_VECTOR (15 downto 0);
			O_EXT : out STD_LOGIC_VECTOR (31 downto 0));
end EXT;

architecture Behavioral of EXT is

begin

	process (I_EXT)
		begin
		if I_EXT(15) = '0' then
			O_EXT <= x"0000" & I_EXT;
		else 
			O_EXT <= x"ffff" & I_EXT;
		end if;
	end process;
end Behavioral;

