LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY TB_ControlUnit IS
END TB_ControlUnit;

ARCHITECTURE behavior OF TB_ControlUnit IS

   -- Component Declaration for the Unit Under Test (UUT)

   COMPONENT ControlUnit
      PORT (
         clock : IN STD_LOGIC;
         Reset : IN STD_LOGIC;
         ZR0 : IN STD_LOGIC;
         ZR1 : IN STD_LOGIC;
         ZR2 : IN STD_LOGIC;
         ZR3 : IN STD_LOGIC;
         ROUTIR : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         LD0 : OUT STD_LOGIC;
         LD1 : OUT STD_LOGIC;
         LD2 : OUT STD_LOGIC;
         LD3 : OUT STD_LOGIC;
         LDPC : OUT STD_LOGIC;
         LDIR : OUT STD_LOGIC;
         S00 : OUT STD_LOGIC;
         S01 : OUT STD_LOGIC;
         S10 : OUT STD_LOGIC;
         S11 : OUT STD_LOGIC;
         Bus_Sel : OUT STD_LOGIC;
         CMD : OUT STD_LOGIC;
         INC : OUT STD_LOGIC;
         RST : OUT STD_LOGIC
      );
   END COMPONENT;
   --Inputs
   SIGNAL clock : STD_LOGIC := '0';
   SIGNAL Reset : STD_LOGIC := '0';
   SIGNAL ZR0 : STD_LOGIC := '0';
   SIGNAL ZR1 : STD_LOGIC := '0';
   SIGNAL ZR2 : STD_LOGIC := '0';
   SIGNAL ZR3 : STD_LOGIC := '0';
   SIGNAL ROUTIR : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');

   --Outputs
   SIGNAL LD0 : STD_LOGIC;
   SIGNAL LD1 : STD_LOGIC;
   SIGNAL LD2 : STD_LOGIC;
   SIGNAL LD3 : STD_LOGIC;
   SIGNAL LDPC : STD_LOGIC;
   SIGNAL LDIR : STD_LOGIC;
   SIGNAL S00 : STD_LOGIC;
   SIGNAL S01 : STD_LOGIC;
   SIGNAL S10 : STD_LOGIC;
   SIGNAL S11 : STD_LOGIC;
   SIGNAL Bus_Sel : STD_LOGIC;
   SIGNAL CMD : STD_LOGIC;
   SIGNAL INC : STD_LOGIC;
   SIGNAL RST : STD_LOGIC;

   -- Clock period definitions
   CONSTANT clock_period : TIME := 10 ns;

BEGIN

   -- Instantiate the Unit Under Test (UUT)
   uut : ControlUnit PORT MAP(
      clock => clock,
      Reset => Reset,
      ZR0 => ZR0,
      ZR1 => ZR1,
      ZR2 => ZR2,
      ZR3 => ZR3,
      ROUTIR => ROUTIR,
      LD0 => LD0,
      LD1 => LD1,
      LD2 => LD2,
      LD3 => LD3,
      LDPC => LDPC,
      LDIR => LDIR,
      S00 => S00,
      S01 => S01,
      S10 => S10,
      S11 => S11,
      Bus_Sel => Bus_Sel,
      CMD => CMD,
      INC => INC,
      RST => RST
   );

   -- Clock process definitions
   clock_process : PROCESS
   BEGIN
      clock <= '0';
      WAIT FOR clock_period/2;
      clock <= '1';
      WAIT FOR clock_period/2;
   END PROCESS;
   -- Stimulus process
   stim_proc : PROCESS
   BEGIN
      -- hold reset state for 100 ns.
      WAIT FOR 100 ns;

      -- WAIT FOR clock_period * 5;
      -- ROUTIR <= "011011";
      -- ZR0 <= '1';
      -- ZR1 <= '1';
      -- ZR2 <= '1';
      -- ZR3 <= '0';
      -- WAIT FOR clock_period;
      -- ROUTIR <= "000110";
      -- WAIT FOR clock_period;
      -- ROUTIR <= "110011";
      -- WAIT FOR clock_period;
      -- ROUTIR <= "111101";
      -- WAIT FOR clock_period;
      -- ROUTIR <= "000000";
      -- WAIT FOR clock_period;
      -- WAIT FOR clock_period;.

      WAIT FOR clock_period;
      
      Reset <= '1';
      ROUTIR <= "011011";
      ZR0 <= '1';
      ZR1 <= '1';
      ZR2 <= '1';
      ZR3 <= '0';

      WAIT FOR clock_period;

      Reset <= '0';

      WAIT FOR clock_period * 4;

      ROUTIR <= "000110";

      WAIT FOR clock_period * 2;

      ROUTIR <= "110011";

      WAIT FOR clock_period * 3;

      ROUTIR <= "111101";

      WAIT FOR clock_period * 3;

      ROUTIR <= "000000";

      WAIT FOR clock_period * 4;

      WAIT;
   END PROCESS;

END;