--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   01:31:06 01/14/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/ADD2/ADD2_Test.vhd
-- Project Name:  ADD2
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: ADD2
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
 
ENTITY ADD2_Test IS
END ADD2_Test;
 
ARCHITECTURE behavior OF ADD2_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT ADD2
    PORT(
         I_ADD2_1 : IN  std_logic_vector(31 downto 0);
         I_ADD2_2 : IN  std_logic_vector(31 downto 0);
         O_ADD2 : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal I_ADD2_1 : std_logic_vector(31 downto 0) := (others => '0');
   signal I_ADD2_2 : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal O_ADD2 : std_logic_vector(31 downto 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 
	
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: ADD2 PORT MAP (
          I_ADD2_1 => I_ADD2_1,
          I_ADD2_2 => I_ADD2_2,
          O_ADD2 => O_ADD2
        );

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		
		I_ADD2_1 <= x"00000001";
		I_ADD2_2 <= x"00000001";
      wait for 100 ns;	

		I_ADD2_1 <= x"aaaaaaaa";
		I_ADD2_2 <= x"11111111";
      wait for 100 ns;
		
		I_ADD2_1 <= x"12121212";
		I_ADD2_2 <= x"12121212";
      wait for 100 ns;
		
		I_ADD2_1 <= x"10101010";
		I_ADD2_2 <= x"01010101";
      wait for 100 ns;	

      -- insert stimulus here 

      wait;
   end process;

END;
