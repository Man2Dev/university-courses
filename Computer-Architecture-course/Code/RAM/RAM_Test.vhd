--------------------------------------------------------------------------------
-- Company: 
-- Engineer:
--
-- Create Date:   03:16:24 01/14/2021
-- Design Name:   
-- Module Name:   E:/Xilinx/Computer Architecture Lab/Project/RAM/RAM_Test.vhd
-- Project Name:  RAM
-- Target Device:  
-- Tool versions:  
-- Description:   
-- 
-- VHDL Test Bench Created by ISE for module: RAM
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
 
ENTITY RAM_Test IS
END RAM_Test;
 
ARCHITECTURE behavior OF RAM_Test IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT RAM
    PORT(
         I_RAM_T : IN  std_logic;
         I_RAM_RE : IN  std_logic;
         I_RAM_WR : IN  std_logic;
         I_RAM_ADDR : IN  std_logic_vector(31 downto 0);
         I_RAM_DATA : IN  std_logic_vector(31 downto 0);
         O_RAM_DATA : OUT  std_logic_vector(31 downto 0)
        );
    END COMPONENT;
    

   --Inputs
   signal I_RAM_T : std_logic := '0';
   signal I_RAM_RE : std_logic := '0';
   signal I_RAM_WR : std_logic := '0';
   signal I_RAM_ADDR : std_logic_vector(31 downto 0) := (others => '0');
   signal I_RAM_DATA : std_logic_vector(31 downto 0) := (others => '0');

 	--Outputs
   signal O_RAM_DATA : std_logic_vector(31 downto 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 

BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: RAM PORT MAP (
          I_RAM_T => I_RAM_T,
          I_RAM_RE => I_RAM_RE,
          I_RAM_WR => I_RAM_WR,
          I_RAM_ADDR => I_RAM_ADDR,
          I_RAM_DATA => I_RAM_DATA,
          O_RAM_DATA => O_RAM_DATA
        );

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
		
		I_RAM_T <= '1';
		I_RAM_ADDR <= x"00000000";
		I_RAM_DATA <= x"a1c1020c";
		I_RAM_WR <= '1';
      wait for 100 ns;
		
		I_RAM_ADDR <= x"00000000";
		I_RAM_DATA <= x"12121212";
		I_RAM_WR <= '0';
		I_RAM_RE <= '1';
      wait for 100 ns;

      -- insert stimulus here 

      wait;
   end process;

END;
