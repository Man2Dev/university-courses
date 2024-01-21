--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   20:50:28 01/13/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/ADD1/ADD1_Test.vhd
-- Project Name:  ADD1
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: ADD1
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
 
ENTITY ADD1_Test IS
END ADD1_Test;
 
ARCHITECTURE behavior OF ADD1_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT ADD1
    PORT(
         I_ADD1 : IN  std_logic_vector(31 downto 0);
         O_ADD1 : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal I_ADD1 : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal O_ADD1 : std_logic_vector(31 downto 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 
 
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: ADD1 PORT MAP (
          I_ADD1 => I_ADD1,
          O_ADD1 => O_ADD1
        );

   -- Stimulus process
   stim_proc: process
   begin		
	
      -- insert stimulus here 
		I_ADD1<=x"00000001";
      wait for 100 ns;	

		I_ADD1<=x"00000011";
      wait for 100 ns;	

		I_ADD1<=x"00000022";
      wait for 100 ns;	

		I_ADD1<=x"000000bb";
      wait for 100 ns;	

		I_ADD1<=x"00001010";
      wait for 100 ns;	

		I_ADD1<=x"aaaaaaaa";
      wait for 100 ns;	
      wait;
   end process;

END;
