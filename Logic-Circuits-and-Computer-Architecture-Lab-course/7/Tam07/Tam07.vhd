----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    11:54:06 12/19/2020 
-- Design Name: 
-- Module Name:    Tam07 - Behavioral 
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

entity Tam07 is
    Port ( D : in  STD_LOGIC;
           CP : in  STD_LOGIC;
           Q : out  STD_LOGIC;
           NQ : out  STD_LOGIC;
           R : in  STD_LOGIC);
end Tam07;

architecture Behavioral of Tam07 is

begin
process(D,CP,R)
	begin
			if R = '1' then
				Q <= '0';
				NQ <= '1';
			else if CP'event and CP='1' then
			--CLK rising edge
				Q <= D;
				NQ <= Not(D);
			end if;
		end if;
	end process;
end Behavioral;

