----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    20:54:19 01/13/2021 
-- Design Name: 
-- Module Name:    CTL - Behavioral 
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

entity CTL is
	Port (I_CTL_T : in STD_LOGIC;
			I_CTL_INS : in STD_LOGIC_VECTOR (5 downto 0);
			O_CTL_RegDst : out STD_LOGIC;
			O_CTL_Branch : out STD_LOGIC;
			O_CTL_MemRead : out STD_LOGIC;
			O_CTL_MemtoReg : out STD_LOGIC;
			O_CTL_ALUOp : out STD_LOGIC_VECTOR (1 downto 0);
			O_CTL_MemWrite : out STD_LOGIC;
			O_CTL_ALUSrc : out STD_LOGIC;
			O_CTL_RegWrite : out STD_LOGIC);
end CTL;

architecture Behavioral of CTL is

	signal val: STD_LOGIC_VECTOR (6 downto 0):=(others => '0');
	signal op: STD_LOGIC_VECTOR (1 downto 0):="00";
begin

	process (I_CTL_T, I_CTL_INS)
	begin
		if I_CTL_T = '1' then
			case I_CTL_INS is
				when "000000" => -- r-type
					val <= (others => '0');
					val(0) <='1';
					val(6) <='1';
					op <= "10";
				when "101011" => -- store
					val<=(others => '0');
					val(4) <='1';
					val(5) <='1';
					op <= "00";
				when "100011"  => -- load
					val <= (others => '0');
					val(2) <= '1';
					val(3) <= '1';
					val(5) <= '1';
					val(6) <= '1';
					op <= "00";
				when "000100" => -- branch
					val <= (others => '0');
					val(1) <= '1';
					op <= "01";
				when others =>
					val <= (others => '0');
			end case;
		end if;	
end process;

O_CTL_RegDst <= val(0);
O_CTL_Branch <= val(1);
O_CTL_MemRead <= val(2);
O_CTL_MemtoReg	<= val(3);
O_CTL_MemWrite	<= val(4);
O_CTL_ALUSrc <= val(5);
O_CTL_RegWrite <= val(6);
O_CTL_ALUOp <= op;

end Behavioral;

