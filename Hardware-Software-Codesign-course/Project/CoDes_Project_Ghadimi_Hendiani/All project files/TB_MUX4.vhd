LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY TB_MUX4 IS
END TB_MUX4;

ARCHITECTURE behavior OF TB_MUX4 IS

   -- Component Declaration for the Unit Under Test (UUT)

   COMPONENT MUX4
      PORT (
         I0 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         I1 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         I2 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         I3 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         S0 : IN STD_LOGIC;
         S1 : IN STD_LOGIC;
         O : OUT STD_LOGIC_VECTOR(5 DOWNTO 0)
      );
   END COMPONENT;
   --Inputs
   SIGNAL I0 : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL I1 : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL I2 : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL I3 : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL S0 : STD_LOGIC := '0';
   SIGNAL S1 : STD_LOGIC := '0';

   --Outputs
   SIGNAL O : STD_LOGIC_VECTOR(5 DOWNTO 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 

BEGIN

   -- Instantiate the Unit Under Test (UUT)
   uut : MUX4 PORT MAP(
      I0 => I0,
      I1 => I1,
      I2 => I2,
      I3 => I3,
      S0 => S0,
      S1 => S1,
      O => O
   );
   -- Stimulus process
   stim_proc : PROCESS
   BEGIN
      -- hold reset state for 100 ns.
      WAIT FOR 100 ns;

      -- insert stimulus here 
      I0 <= "000001";
      I1 <= "000011";
      I2 <= "000111";
      I3 <= "001111";
      WAIT FOR 100 ns;
      S0 <= '0';
      S1 <= '0';
      WAIT FOR 100 ns;
      S0 <= '0';
      S1 <= '1';
      WAIT FOR 100 ns;
      S0 <= '1';
      S1 <= '0';
      WAIT FOR 100 ns;
      S0 <= '1';
      S1 <= '1';

      WAIT;
   END PROCESS;

END;