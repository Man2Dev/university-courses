----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    06:28:55 12/25/2020 
-- Design Name: 
-- Module Name:    Tam08 - Behavioral 
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
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Tam08 is
    Port ( S : in  STD_LOGIC_VECTOR(2 downto 0);
           Q : OUT  STD_LOGIC_VECTOR(7 downto 0);
           E : in  STD_LOGIC);
end Tam08;

architecture Behavioral of Tam08 is

begin
	process(S,E)
		  begin
			if E = '0' then
				 Q <= "00000000";
			else
				 case S is
					when "000" => Q <= "00000001";
					when "001" => Q <= "00000010";
					when "010" => Q <= "00000100";
					when "011" => Q <= "00001000";
					when "100" => Q <= "00010000";
					when "101" => Q <= "00100000";
					when "110" => Q <= "01000000";
					when "111" => Q <= "10000000";
					when others => NULL;
				 end case;
			end if;
		  end process;
end Behavioral;

