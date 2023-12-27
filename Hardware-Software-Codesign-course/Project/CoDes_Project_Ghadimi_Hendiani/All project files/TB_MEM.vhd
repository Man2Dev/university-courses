LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY TB_MEM IS
END TB_MEM;

ARCHITECTURE behavior OF TB_MEM IS

   -- Component Declaration for the Unit Under Test (UUT)

   COMPONENT MEM
      PORT (
         ADDRESS : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         DATA : OUT STD_LOGIC_VECTOR(5 DOWNTO 0)
      );
   END COMPONENT;
   --Inputs
   SIGNAL ADDRESS : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');

   --Outputs
   SIGNAL DATA : STD_LOGIC_VECTOR(5 DOWNTO 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 

BEGIN

   -- Instantiate the Unit Under Test (UUT)
   uut : MEM PORT MAP(
      ADDRESS => ADDRESS,
      DATA => DATA
   );

   -- Stimulus process
   stim_proc : PROCESS
   BEGIN
      -- hold reset state for 100 ns.
      WAIT FOR 100 ns;

      -- insert stimulus here 
      ADDRESS <= "000000";
      WAIT FOR 100 ns;
      ADDRESS <= "000001";
      WAIT FOR 100 ns;
      ADDRESS <= "000010";
      WAIT FOR 100 ns;
      ADDRESS <= "000011";
      WAIT FOR 100 ns;
      ADDRESS <= "000100";
      WAIT FOR 100 ns;
      ADDRESS <= "000101";
      WAIT FOR 100 ns;
      ADDRESS <= "000110";
      WAIT FOR 100 ns;
      ADDRESS <= "000111";
      WAIT FOR 100 ns;
      ADDRESS <= "001000";
      WAIT FOR 100 ns;

      WAIT;
   END PROCESS;

END;