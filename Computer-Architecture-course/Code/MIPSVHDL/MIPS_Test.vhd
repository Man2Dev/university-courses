-- Vhdl test bench created from schematic E:\Xilinx\Computer Architecture Lab\Project\MIPS\MIPS.sch - Thu Jan 14 19:46:36 2021
--
-- Notes: 
-- 1) This testbench template has been automatically generated using types
-- std_logic and std_logic_vector for the ports of the unit under test.
-- Xilinx recommends that these types always be used for the top-level
-- I/O of a design in order to guarantee that the testbench will bind
-- correctly to the timing (post-route) simulation model.
-- 2) To use this template as your testbench, change the filename to any
-- name of your choice with the extension .vhd, and use the "Source->Add"
-- menu in Project Navigator to import the testbench. Then
-- edit the user defined section below, adding code to generate the 
-- stimulus for your design.
--
LIBRARY ieee;
USE ieee.std_logic_1164.ALL;
USE ieee.numeric_std.ALL;
LIBRARY UNISIM;
USE UNISIM.Vcomponents.ALL;
ENTITY MIPS_MIPS_sch_tb IS
END MIPS_MIPS_sch_tb;
ARCHITECTURE behavioral OF MIPS_MIPS_sch_tb IS 

   COMPONENT MIPS
   PORT( Toggle	:	IN	STD_LOGIC; 
          Clk	:	IN	STD_LOGIC);
   END COMPONENT;

   SIGNAL Toggle	:	STD_LOGIC;
   SIGNAL Clk	:	STD_LOGIC;

	constant MIPS_CLK_period : time := 5ps;

BEGIN

   UUT: MIPS PORT MAP(
		Toggle => Toggle, 
		Clk => Clk
   );
	
	MIPS_CLK_process : process
		begin
		CLK <= '0';
		wait for MIPS_CLK_period/2;
		CLK <= '1';
		wait for MIPS_CLK_period/2;
	end process;

-- *** Test Bench - User Defined Section ***
   tb : PROCESS
   BEGIN
			Toggle<='0';      			wait for MIPS_CLK_period*1;
			Toggle<='1';					wait for MIPS_CLK_period*1;
			wait for 1.6 ns;
			assert false report "Sim stops." severity failure;
      -- WAIT; -- will wait forever
   END PROCESS;
-- *** End Test Bench - User Defined Section ***

END;
