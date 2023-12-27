----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    22:54:16 01/13/2021 
-- Design Name: 
-- Module Name:    REG - Behavioral 
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
use IEEE.STD_LOGIC_ARITH.all;
use IEEE.STD_LOGIC_UNSIGNED.all;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity REG is
	Port (I_REG_T : in STD_LOGIC;
			I_REG_Write : in STD_LOGIC;
			I_REG_SEL_RS : in  STD_LOGIC_VECTOR (4 downto 0);
         I_REG_SEL_RT : in  STD_LOGIC_VECTOR (4 downto 0);
         I_REG_SEL_RD : in  STD_LOGIC_VECTOR (4 downto 0);
			I_REG_DATA_RD : in  STD_LOGIC_VECTOR (31 downto 0);
			O_REG_DATA_A : out  STD_LOGIC_VECTOR (31 downto 0);
         O_REG_DATA_B : out  STD_LOGIC_VECTOR (31 downto 0));
end REG;

architecture Behavioral of REG is

type reg_type is array(0 to 32) of STD_LOGIC_VECTOR(31 downto 0);
signal temp : reg_type := (x"00000001",
									x"00000002",
									x"00000003",
									others => x"00000000");
begin

process (I_REG_T, I_REG_Write,I_REG_SEL_RS,I_REG_SEL_RT,I_REG_SEL_RD,I_REG_DATA_RD)
variable s, t, w : integer := 0;

	begin
		s := conv_integer(I_REG_SEL_RS);
		t := conv_integer(I_REG_SEL_RT);
		w := conv_integer(I_REG_SEL_RD);
		
		if I_REG_T = '1' then
			if I_REG_Write = '1' then
				temp(w) <= I_REG_DATA_RD;
			end if;
		end if;
		
		O_REG_DATA_A <= temp(s);
		O_REG_DATA_B <= temp(t);
	end process;
end Behavioral;

