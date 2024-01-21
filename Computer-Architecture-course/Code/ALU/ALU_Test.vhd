--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   02:01:44 01/14/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/ALU/ALU_Test.vhd
-- Project Name:  ALU
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: ALU
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
 
ENTITY ALU_Test IS
END ALU_Test;
 
ARCHITECTURE behavior OF ALU_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT ALU
    PORT(
         I_ALU_T : IN  std_logic;
         I_ALU_CTR : IN  std_logic_vector(3 downto 0);
         I_ALU_1 : IN  std_logic_vector(31 downto 0);
         I_ALU_2 : IN  std_logic_vector(31 downto 0);
         O_ALU : OUT  std_logic_vector(31 downto 0);
         O_ALU_ZERO : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal I_ALU_T : std_logic := '0';
   signal I_ALU_CTR : std_logic_vector(3 downto 0) := (others => '0');
   signal I_ALU_1 : std_logic_vector(31 downto 0) := (others => '0');
   signal I_ALU_2 : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal O_ALU : std_logic_vector(31 downto 0);
   signal O_ALU_ZERO : std_logic;
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 

BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: ALU PORT MAP (
          I_ALU_T => I_ALU_T,
          I_ALU_CTR => I_ALU_CTR,
          I_ALU_1 => I_ALU_1,
          I_ALU_2 => I_ALU_2,
          O_ALU => O_ALU,
          O_ALU_ZERO => O_ALU_ZERO
        );

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		
		I_ALU_T <= '1';
		I_ALU_CTR<="0001";
		I_ALU_1 <= x"10101010";
		I_ALU_2 <= x"01010101";
      wait for 100 ns;
		
		I_ALU_CTR<="0010";
		I_ALU_1 <= x"01010101";
		I_ALU_2 <= x"aaaaaaaa";
      wait for 100 ns;
		
		I_ALU_CTR<="0110";
		I_ALU_1 <= x"10101010";
		I_ALU_2 <= x"01010101";
      wait for 100 ns;
		
		I_ALU_1 <= x"aaaaaaaa";
		I_ALU_2 <= x"aaaaaaaa";
      -- insert stimulus here 

      wait;
   end process;

END;
