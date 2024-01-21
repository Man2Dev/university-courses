--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   22:33:35 01/13/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/CTL/CTL_Test.vhd
-- Project Name:  CTL
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: CTL
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
 
ENTITY CTL_Test IS
END CTL_Test;
 
ARCHITECTURE behavior OF CTL_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT CTL
    PORT(
         I_CTL_T : IN  std_logic;
         I_CTL_INS : IN  std_logic_vector(5 downto 0);
         O_CTL_RegDst : OUT  std_logic;
         O_CTL_Branch : OUT  std_logic;
         O_CTL_MemRead : OUT  std_logic;
         O_CTL_MemtoReg : OUT  std_logic;
         O_CTL_ALUOp : OUT  std_logic_vector(1 downto 0);
         O_CTL_MemWrite : OUT  std_logic;
         O_CTL_ALUSrc : OUT  std_logic;
         O_CTL_RegWrite : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal I_CTL_T : std_logic := '0';
   signal I_CTL_INS : std_logic_vector(5 downto 0) := (others => '0');

 	--Outputs
   signal O_CTL_RegDst : std_logic;
   signal O_CTL_Branch : std_logic;
   signal O_CTL_MemRead : std_logic;
   signal O_CTL_MemtoReg : std_logic;
   signal O_CTL_ALUOp : std_logic_vector(1 downto 0);
   signal O_CTL_MemWrite : std_logic;
   signal O_CTL_ALUSrc : std_logic;
   signal O_CTL_RegWrite : std_logic;
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name.
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: CTL PORT MAP (
          I_CTL_T => I_CTL_T,
          I_CTL_INS => I_CTL_INS,
          O_CTL_RegDst => O_CTL_RegDst,
          O_CTL_Branch => O_CTL_Branch,
          O_CTL_MemRead => O_CTL_MemRead,
          O_CTL_MemtoReg => O_CTL_MemtoReg,
          O_CTL_ALUOp => O_CTL_ALUOp,
          O_CTL_MemWrite => O_CTL_MemWrite,
          O_CTL_ALUSrc => O_CTL_ALUSrc,
          O_CTL_RegWrite => O_CTL_RegWrite
        );

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		I_CTL_T<='1';
		I_CTL_INS<="000000";
      wait for 100 ns;
		
		I_CTL_INS<="101011";
		wait for 100 ns;
		
		I_CTL_INS<="100011";
		wait for 100 ns;
		
		I_CTL_INS<="000100";
		wait for 100 ns;
      -- insert stimulus here 

      wait;
   end process;

END;
