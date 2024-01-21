----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    00:15:16 01/14/2021 
-- Design Name: 
-- Module Name:    ALUCTR - Behavioral 
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

entity ALUCTR is
	Port (I_ALU_OP : in STD_LOGIC_VECTOR (1 downto 0);
			I_ALU_FUNCT : in STD_LOGIC_VECTOR (5 downto 0);
			O_ALU_CTR : out STD_LOGIC_VECTOR (3 downto 0));
end ALUCTR;

architecture Behavioral of ALUCTR is

begin

	process (I_ALU_OP, I_ALU_FUNCT)
		begin
		case I_ALU_OP is
			when "00" =>
				O_ALU_CTR <= "0010"; -- Load & store
			when "01" =>
				O_ALU_CTR <= "0110"; -- breq
			when "10" =>
				if I_ALU_FUNCT = "100000" then
					O_ALU_CTR <= "0010"; -- add
				else if I_ALU_FUNCT = "100101" then 
					O_ALU_CTR <= "0001"; -- or
				end if;
				end if;
			when others =>
				O_ALU_CTR <= "0000";
		end case;
	end process;
end Behavioral;

