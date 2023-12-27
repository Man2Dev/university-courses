LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--USE ieee.numeric_std.ALL;

ENTITY TB_PC IS
END TB_PC;

ARCHITECTURE behavior OF TB_PC IS

   -- Component Declaration for the Unit Under Test (UUT)

   COMPONENT PC
      PORT (
         CLK : IN STD_LOGIC;
         LD : IN STD_LOGIC;
         RIN : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         ROUT : OUT STD_LOGIC_VECTOR(5 DOWNTO 0);
         CLR : IN STD_LOGIC;
         INC : IN STD_LOGIC
      );
   END COMPONENT;
   --Inputs
   SIGNAL CLK : STD_LOGIC := '0';
   SIGNAL LD : STD_LOGIC := '0';
   SIGNAL RIN : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL CLR : STD_LOGIC := '0';
   SIGNAL INC : STD_LOGIC := '0';

   --Outputs
   SIGNAL ROUT : STD_LOGIC_VECTOR(5 DOWNTO 0);

   -- Clock period definitions
   CONSTANT CLK_period : TIME := 10 ns;

BEGIN

   -- Instantiate the Unit Under Test (UUT)
   uut : PC PORT MAP(
      CLK => CLK,
      LD => LD,
      RIN => RIN,
      ROUT => ROUT,
      CLR => CLR,
      INC => INC
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

      -- increase to 4 (000100)
      INC <= '1';
      WAIT FOR Clk_period;
      WAIT FOR Clk_period;
      WAIT FOR Clk_period;
      WAIT FOR Clk_period;
      INC <= '0';
      WAIT FOR Clk_period * 5;

      -- load 8 (001000)
      RIN <= "001000";
      WAIT FOR Clk_period * 5;
      LD <= '1';
      WAIT FOR Clk_period;
      LD <= '0';
      WAIT FOR Clk_period * 5;

      -- increase to 10 (001010)
      INC <= '1';
      WAIT FOR Clk_period;
      WAIT FOR Clk_period;
      INC <= '0';
      WAIT FOR Clk_period * 5;

      -- clear
      CLR <= '1';
      WAIT FOR Clk_period * 5;

      WAIT;
   END PROCESS;

END;