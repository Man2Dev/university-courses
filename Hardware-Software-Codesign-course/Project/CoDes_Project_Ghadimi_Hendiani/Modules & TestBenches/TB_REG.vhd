LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY TB_REG IS
END TB_REG;

ARCHITECTURE behavior OF TB_REG IS

   -- Component Declaration for the Unit Under Test (UUT)

   COMPONENT REG
      PORT (
         CLK : IN STD_LOGIC;
         LD : IN STD_LOGIC;
         RIN : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         ROUT : OUT STD_LOGIC_VECTOR(5 DOWNTO 0);
         ZR : OUT STD_LOGIC
      );
   END COMPONENT;
   --Inputs
   SIGNAL CLK : STD_LOGIC := '0';
   SIGNAL LD : STD_LOGIC := '0';
   SIGNAL RIN : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');

   --Outputs
   SIGNAL ROUT : STD_LOGIC_VECTOR(5 DOWNTO 0);
   SIGNAL ZR : STD_LOGIC;

   -- Clock period definitions
   CONSTANT CLK_period : TIME := 10 ns;

BEGIN

   -- Instantiate the Unit Under Test (UUT)
   uut : REG PORT MAP(
      CLK => CLK,
      LD => LD,
      RIN => RIN,
      ROUT => ROUT,
      ZR => ZR
   );

   -- Clock process definitions
   CLK_process : PROCESS
   BEGIN
      CLK <= '0';
      WAIT FOR CLK_period/2;
      CLK <= '1';
      WAIT FOR CLK_period/2;
   END PROCESS;
   -- Stimulus process
   stim_proc : PROCESS
   BEGIN
      -- hold reset state for 100 ns.
      WAIT FOR 100 ns;

      WAIT FOR CLK_period * 10;

      -- insert stimulus here 
      RIN <= "010001";
      WAIT FOR Clk_period * 5;
      LD <= '1';
      WAIT FOR Clk_period;
      LD <= '0';
      WAIT FOR Clk_period * 5;

      RIN <= "000011";
      WAIT FOR Clk_period * 5;
      LD <= '1';
      WAIT FOR Clk_period * 5;
      LD <= '0';
      WAIT FOR Clk_period * 5;

      RIN <= "000000";
      WAIT FOR Clk_period * 5;
      LD <= '1';
      WAIT FOR Clk_period * 5;
      LD <= '0';
      WAIT FOR Clk_period * 5;

      WAIT;
   END PROCESS;

END;