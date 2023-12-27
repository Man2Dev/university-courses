--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   07:22:32 01/06/2021
-- Design Name:   
-- Module Name:   C:/Users/home/FA/t.vhd
-- Project Name:  FA
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: Top
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
 
ENTITY test IS
END test;
 
ARCHITECTURE behavior OF test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT Top
    PORT(
         A : IN  std_logic;
         B : IN  std_logic;
         C : IN  std_logic;
         Sum : OUT  std_logic;
         Carry : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal A : std_logic := '0';
   signal B : std_logic := '0';
   signal C : std_logic := '0';

 	--Outputs
   signal Sum : std_logic;
   signal Carry : std_logic;
 
   constant A_period : time := 10 ns;
   constant B_period : time := 20 ns;
   constant C_period : time := 30 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: Top PORT MAP (
          A => A,
          B => B,
          C => C,
          Sum => Sum,
          Carry => Carry
        );

   -- Clock process definitions
   A_process :process
   begin
		A <= '0';
		wait for A_period/2;
		A <= '1';
		wait for A_period/2;
   end process;
 
   B_process :process
   begin
		B <= '0';
		wait for B_period/2;
		B <= '1';
		wait for B_period/2;
   end process; 

   C_process :process
   begin
		C <= '0';
		wait for C_period/2;
		C <= '1';
		wait for C_period/2;
   end process;
	
   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
      wait for 100 ns;	

      wait for A_period*10;
      wait for B_period*10;
      wait for C_period*10;

      -- insert stimulus here 

      wait;
   end process;

END;
