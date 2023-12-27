--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   01:00:08 01/14/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/MUX32/MUX32_Test.vhd
-- Project Name:  MUX32
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: MUX32
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
 
ENTITY MUX32_Test IS
END MUX32_Test;
 
ARCHITECTURE behavior OF MUX32_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT MUX32
    PORT(
         I_MUX_0 : IN  std_logic_vector(31 downto 0);
         I_MUX_1 : IN  std_logic_vector(31 downto 0);
         I_MUX_SELECT : IN  std_logic;
         O_MUX : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal I_MUX_0 : std_logic_vector(31 downto 0) := (others => '0');
   signal I_MUX_1 : std_logic_vector(31 downto 0) := (others => '0');
   signal I_MUX_SELECT : std_logic := '0';

 	--Outputs
   signal O_MUX : std_logic_vector(31 downto 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: MUX32 PORT MAP (
          I_MUX_0 => I_MUX_0,
          I_MUX_1 => I_MUX_1,
          I_MUX_SELECT => I_MUX_SELECT,
          O_MUX => O_MUX
        );

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		I_MUX_0 <= x"aaaaaaaa";
		I_MUX_1 <= x"11111111";
		I_MUX_SELECT <= '0';
      wait for 100 ns;
		
		I_MUX_SELECT <= '1';
      wait for 100 ns;

		I_MUX_0 <= x"ffffffff";
		I_MUX_1 <= x"12121212";
		I_MUX_SELECT <= '0';
      wait for 100 ns;
		
		I_MUX_SELECT <= '1';
      wait for 100 ns;
      -- insert stimulus here 

      wait;
   end process;

END;
