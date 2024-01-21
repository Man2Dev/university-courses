----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    02:14:06 01/14/2021 
-- Design Name: 
-- Module Name:    RAM - Behavioral 
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
use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity RAM is
	Port (I_RAM_T : in STD_LOGIC;
			I_RAM_RE : STD_LOGIC;
			I_RAM_WR : STD_LOGIC;
			I_RAM_ADDR : in  STD_LOGIC_VECTOR (31 downto 0);
			I_RAM_DATA : in  STD_LOGIC_VECTOR (31 downto 0);
			O_RAM_DATA : out STD_LOGIC_VECTOR (31 downto 0));
end RAM;

architecture Behavioral of RAM is

type mem_array is array(0 to 31) of STD_LOGIC_VECTOR (31 downto 0);
signal ram : mem_array := (others => x"00000000");
	
begin

	process (I_RAM_T, I_RAM_RE, I_RAM_WR, I_RAM_ADDR, I_RAM_DATA, ram)
	variable addr : integer;
	begin
		addr := conv_integer(I_RAM_ADDR);
		if I_RAM_T = '1' then
			if I_RAM_RE = '1' then
				O_RAM_DATA <= ram(addr);
			end if;
			if I_RAM_WR = '1' then
				ram(addr) <= I_RAM_DATA;
			end if;
		end if;
	end process;
end Behavioral;

