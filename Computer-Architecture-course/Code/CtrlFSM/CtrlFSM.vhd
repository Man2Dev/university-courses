----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    17:18:41 01/14/2021 
-- Design Name: 
-- Module Name:    CtrlFSM - Behavioral 
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

entity CtrlFSM is
	Port (I_FSM_T : in STD_LOGIC;
			I_FSM_CLK : in STD_LOGIC;
			I_FSM_INSTR : in STD_LOGIC_VECTOR (31 downto 0);
			O_FSM_IM : out STD_LOGIC;
			O_FSM_CTL : out STD_LOGIC;
			O_FSM_ALU : out STD_LOGIC;
			O_FSM_RAM : out STD_LOGIC;
			O_FSM_PCREG : out STD_LOGIC);
end CtrlFSM;

architecture Behavioral of CtrlFSM is
	
	TYPE states is (S_IF, S_ID, S_EX, S_ME, S_WR, S_END);
	Signal state : states;
begin
	process (I_FSM_T, I_FSM_CLK, I_FSM_INSTR)
		begin
		if I_FSM_T = '1' then
			if rising_edge(I_FSM_CLK) then
				case state is
					when S_IF =>
						O_FSM_IM <= '1';
						O_FSM_CTL <= '0';
						O_FSM_ALU <= '0';
						O_FSM_RAM <= '0';
						O_FSM_PCREG <= '0';
						state <= S_ID;
					when S_ID =>
						O_FSM_IM <= '0';
						O_FSM_CTL <= '1';
						O_FSM_ALU <= '0';
						O_FSM_RAM <= '0';
						O_FSM_PCREG <= '0';
						if I_FSM_INSTR = x"00000000" then
							state <= S_END;
							O_FSM_ALU <= '0';
						else
							state <= S_EX;
						end if;
					when S_EX =>
						O_FSM_IM <= '0';
						O_FSM_CTL <= '0';
						O_FSM_ALU <= '1';
						O_FSM_RAM <= '0';
						O_FSM_PCREG <= '0';
						state <= S_ME;
					when S_ME =>
						O_FSM_IM <= '0';
						O_FSM_CTL <= '0';
						O_FSM_ALU <= '0';
						O_FSM_RAM <= '1';
						O_FSM_PCREG <= '0';
						state <= S_WR;
					when S_WR =>
						O_FSM_IM <= '0';
						O_FSM_CTL <= '0';
						O_FSM_ALU <= '0';
						O_FSM_RAM <= '0';
						O_FSM_PCREG <= '1';
						state <= S_IF;
					when others =>
						O_FSM_IM <= '0';
						O_FSM_CTL <= '0';
						O_FSM_ALU <= '0';
						O_FSM_RAM <= '0';
						O_FSM_PCREG <= '0';
						state <= S_END;
				end case;
			end if;
		else
			State <= S_IF;
		end if;
	end process;	
end Behavioral;

