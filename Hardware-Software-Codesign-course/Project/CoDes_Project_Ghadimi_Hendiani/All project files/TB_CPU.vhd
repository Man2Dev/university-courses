LIBRARY ieee;
USE ieee.std_logic_1164.ALL;
 
ENTITY TB_CPU IS
END TB_CPU;
 
ARCHITECTURE behavior OF TB_CPU IS 
 
    -- Component Declaration for the Unit Under Test (UUT)
 
    COMPONENT CPU
    PORT(
         clock : IN  std_logic;
         Reset : IN  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal clock : std_logic := '0';
   signal Reset : std_logic := '0';

   -- Clock period definitions
   constant clock_period : time := 10 ns;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: CPU PORT MAP (
          clock => clock,
          Reset => Reset
        );

   -- Clock process definitions
   clock_process :process
   begin
		clock <= '0';
		wait for clock_period/2;
		clock <= '1';
		wait for clock_period/2;
   end process;
 

   -- Stimulus process
   stim_proc: process
   begin		
      -- hold reset state for 100 ns.
      wait for 100 ns;	

      wait for clock_period*10;

      -- insert stimulus here 

      wait;
   end process;

END;
