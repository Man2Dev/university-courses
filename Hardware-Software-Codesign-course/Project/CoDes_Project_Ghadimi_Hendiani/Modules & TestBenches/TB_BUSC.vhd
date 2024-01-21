LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY TB_BUSC IS
END TB_BUSC;

ARCHITECTURE behavior OF TB_BUSC IS

   -- Component Declaration for the Unit Under Test (UUT)

   COMPONENT BUSC
      PORT (
         MDATA : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         ALURES : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         SEL : IN STD_LOGIC;
         DBUS : OUT STD_LOGIC_VECTOR(5 DOWNTO 0)
      );
   END COMPONENT;
   --Inputs
   SIGNAL MDATA : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL ALURES : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL SEL : STD_LOGIC := '0';

   --Outputs
   SIGNAL DBUS : STD_LOGIC_VECTOR(5 DOWNTO 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 

BEGIN

   -- Instantiate the Unit Under Test (UUT)
   uut : BUSC PORT MAP(
      MDATA => MDATA,
      ALURES => ALURES,
      SEL => SEL,
      DBUS => DBUS
   );

   -- Stimulus process
   stim_proc : PROCESS
   BEGIN
      -- hold reset state for 100 ns.
      WAIT FOR 100 ns;

      -- insert stimulus here 
      MDATA <= "000111";
      ALURES <= "111000";

      SEL <= '0';
      WAIT FOR 100 ns;
      SEL <= '1';
      WAIT FOR 100 ns;

      WAIT;
   END PROCESS;

END;