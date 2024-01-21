--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   00:08:29 01/14/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/EXT/EXT_Test.vhd
-- Project Name:  EXT
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: EXT
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
 
ENTITY EXT_Test IS
END EXT_Test;
 
ARCHITECTURE behavior OF EXT_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT EXT
    PORT(
         I_EXT : IN  std_logic_vector(15 downto 0);
         O_EXT : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal I_EXT : std_logic_vector(15 downto 0) := (others => '0');

 	--Outputs
   signal O_EXT : std_logic_vector(31 downto 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: EXT PORT MAP (
          I_EXT => I_EXT,
          O_EXT => O_EXT
        );

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		I_EXT<=x"0111";
      wait for 100 ns;	
		
		I_EXT<=x"9111";
      wait for 100 ns;
		
		I_EXT<=x"7010";
      wait for 100 ns;	
		
		I_EXT<=x"aaaa";
      wait for 100 ns;	
      -- insert stimulus here 

      wait;
   end process;

END;
