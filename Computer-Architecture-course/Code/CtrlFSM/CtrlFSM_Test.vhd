--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   17:45:55 01/14/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/CtrlFSM/CtrlFSM_Test.vhd
-- Project Name:  CtrlFSM
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: CtrlFSM
-- 
-- Dependencies:
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
--
-- Notes: 
-- This testbench has been automatically generated using types std_logic and
-- std_logic_vector for the ports of the unit under test.  Xilinx recommends
-- that these types always be used for the top-level I/O of a design in order
-- to guarantee that the testbench will bind correctly to the post-implementation 
-- simulation model.
--------------------------------------------------------------------------------
LIBRARY ieee;
USE ieee.std_logic_1164.ALL;
 
-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;
 
ENTITY CtrlFSM_Test IS
END CtrlFSM_Test;
 
ARCHITECTURE behavior OF CtrlFSM_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT CtrlFSM
    PORT(
         I_FSM_T : IN  std_logic;
         I_FSM_CLK : IN  std_logic;
         I_FSM_INSTR : IN  std_logic_vector(31 downto 0);
         O_FSM_IM : OUT  std_logic;
         O_FSM_CTL : OUT  std_logic;
         O_FSM_ALU : OUT  std_logic;
         O_FSM_RAM : OUT  std_logic;
         O_FSM_PCREG : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal I_FSM_T : std_logic := '0';
   signal I_FSM_CLK : std_logic := '0';
   signal I_FSM_INSTR : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal O_FSM_IM : std_logic;
   signal O_FSM_CTL : std_logic;
   signal O_FSM_ALU : std_logic;
   signal O_FSM_RAM : std_logic;
   signal O_FSM_PCREG : std_logic;

   -- Clock period definitions
   constant I_FSM_CLK_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: CtrlFSM PORT MAP (
          I_FSM_T => I_FSM_T,
          I_FSM_CLK => I_FSM_CLK,
          I_FSM_INSTR => I_FSM_INSTR,
          O_FSM_IM => O_FSM_IM,
          O_FSM_CTL => O_FSM_CTL,
          O_FSM_ALU => O_FSM_ALU,
          O_FSM_RAM => O_FSM_RAM,
          O_FSM_PCREG => O_FSM_PCREG
        );

   -- Clock process definitions
   I_FSM_CLK_process :process
   begin
		I_FSM_CLK <= '0';
		wait for I_FSM_CLK_period/2;
		I_FSM_CLK <= '1';
		wait for I_FSM_CLK_period/2;
   end process;
 

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
      wait for 100 ns;	

      wait for I_FSM_CLK_period*10;
		I_FSM_T <= '1';
		I_FSM_INSTR <= x"00000001";

      -- insert stimulus here 

      wait;
   end process;

END;
