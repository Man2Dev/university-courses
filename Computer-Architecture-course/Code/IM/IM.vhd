----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    19:14:15 01/13/2021 
-- Design Name: 
-- Module Name:    IM - Behavioral 
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
use IEEE.numeric_std.all;
use STD.textio.all;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity IM is
	Port ( I_ROM_T : in STD_LOGIC;
			 I_ROM_ADDRESS : in STD_LOGIC_VECTOR (31 downto 0);
			 O_ROM_DATA : out STD_LOGIC_VECTOR (31 downto 0) := (others=>'0'));
end IM;

architecture Behavioral of IM is

	type mem_array is array(0 to 31) of STD_LOGIC_VECTOR (31 downto 0);
	constant ROM : mem_array := (
		"00000000000000010001100000100000", -- r3 = r0 +  r1 
      "00000000000000110010000000100101", --	r4 = r0 or r3
      "10101100110001000000000000000000",	-- store r4 to m0 with offset of r6(which is 0)
      "10001100110001010000000000000000",	-- load m0 to r5 with offset of r6(which is 0)
      "00010000100001010000000000000001",	-- beq r4,r5 -> pc++
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000", 
      "00000000000000000000000000000000", -- mem 10 
      "00000000000000000000000000000000", 
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",  
      "00000000000000000000000000000000", -- mem 20
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000", 
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000",
      "00000000000000000000000000000000", 
      "00000000000000000000000000000000", -- mem 30
      "00000000000000000000000000000000"
    );
	
begin
	process (I_ROM_T, I_ROM_ADDRESS)
		begin
		if I_ROM_T = '1' then
			O_ROM_DATA <= ROM(to_integer(unsigned(I_ROM_ADDRESS(31 downto 0))));
		end if;
	end process;
end Behavioral;

