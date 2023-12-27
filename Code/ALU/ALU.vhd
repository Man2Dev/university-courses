----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    01:35:12 01/14/2021 
-- Design Name: 
-- Module Name:    ALU - Behavioral 
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
use IEEE.STD_LOGIC_UNSIGNED.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity ALU is
	Port (I_ALU_T : in  STD_LOGIC;
			I_ALU_CTR : in  STD_LOGIC_VECTOR (3 downto 0);
			I_ALU_1 : in  STD_LOGIC_VECTOR (31 downto 0);
			I_ALU_2 : in  STD_LOGIC_VECTOR (31 downto 0);
			O_ALU : out STD_LOGIC_VECTOR (31 downto 0);
			O_ALU_ZERO : out STD_LOGIC);
end ALU;

architecture Behavioral of ALU is
signal temp : STD_LOGIC_VECTOR (31 downto 0);

begin
	process (I_ALU_T, I_ALU_CTR, I_ALU_1, I_ALU_2)
		begin
		if I_ALU_T = '1' then
			if I_ALU_CTR = "0001" then -- or
				temp <= I_ALU_1 or I_ALU_2;
				O_ALU_ZERO <= '0';
			elsif I_ALU_CTR = "0010" then -- add
				temp <= I_ALU_1 + I_ALU_2;
				O_ALU_Zero <= '0';
			elsif I_ALU_CTR = "0110" then --breq
				temp <= I_ALU_1 - I_ALU_2;
				if I_ALU_1 = I_ALU_2 then
					O_ALU_ZERO <= '1';
				else
					O_ALU_ZERO <= '0';
				end if;
			end if;
		end if;
	end process;
O_ALU <= temp;
end Behavioral;

