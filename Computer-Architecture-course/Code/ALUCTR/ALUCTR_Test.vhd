--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   00:45:59 01/14/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/ALUCTR/ALUCTR_Test.vhd
-- Project Name:  ALUCTR
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: ALUCTR
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
 
ENTITY ALUCTR_Test IS
END ALUCTR_Test;
 
ARCHITECTURE behavior OF ALUCTR_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT ALUCTR
    PORT(
         I_ALU_OP : IN  std_logic_vector(1 downto 0);
         I_ALU_FUNCT : IN  std_logic_vector(5 downto 0);
         O_ALU_CTR : OUT  std_logic_vector(3 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal I_ALU_OP : std_logic_vector(1 downto 0) := (others => '0');
   signal I_ALU_FUNCT : std_logic_vector(5 downto 0) := (others => '0');

 	--Outputs
   signal O_ALU_CTR : std_logic_vector(3 downto 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: ALUCTR PORT MAP (
          I_ALU_OP => I_ALU_OP,
          I_ALU_FUNCT => I_ALU_FUNCT,
          O_ALU_CTR => O_ALU_CTR
        );
		  
   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		I_ALU_OP <= "00";
		I_ALU_FUNCT <= "000000";
      wait for 100 ns;
		
		I_ALU_OP <= "01";
		I_ALU_FUNCT <= "000000";
      wait for 100 ns;
		
		I_ALU_OP <= "10";
		I_ALU_FUNCT <= "100000";
      wait for 100 ns;
		
		I_ALU_OP <= "10";
		I_ALU_FUNCT <= "100101";
      wait for 100 ns;

      -- insert stimulus here 

      wait;
   end process;

END;
