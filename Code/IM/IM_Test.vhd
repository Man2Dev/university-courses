--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   20:20:00 01/13/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/IM/IM_Test.vhd
-- Project Name:  IM
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: IM
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
 
ENTITY IM_Test IS
END IM_Test;
 
ARCHITECTURE behavior OF IM_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT IM
    PORT(
         I_ROM_T : IN  std_logic;
         I_ROM_ADDRESS : IN  std_logic_vector(31 downto 0);
         O_ROM_DATA : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal I_ROM_T : std_logic := '0';
   signal I_ROM_ADDRESS : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal O_ROM_DATA : std_logic_vector(31 downto 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: IM PORT MAP (
          I_ROM_T => I_ROM_T,
          I_ROM_ADDRESS => I_ROM_ADDRESS,
          O_ROM_DATA => O_ROM_DATA
        );

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		I_ROM_T<='1';
		I_ROM_ADDRESS<=x"00000000";
      wait for 100 ns;
		
      -- insert stimulus here 
		
		I_ROM_ADDRESS<=x"00000001";
		wait for 100 ns;
		
		I_ROM_ADDRESS<=x"00000002";
		wait for 100 ns;
		
		I_ROM_ADDRESS<=x"00000003";
		wait for 100 ns;
		
		I_ROM_ADDRESS<=x"00000004";
		wait for 100 ns;
		
		I_ROM_ADDRESS<=x"00000005";
		wait for 100 ns;
		
		I_ROM_T<='0';
		wait for 100 ns;
      wait;
   end process;

END;
