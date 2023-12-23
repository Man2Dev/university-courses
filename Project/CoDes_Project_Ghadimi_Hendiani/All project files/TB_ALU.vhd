LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY TB_ALU IS
END TB_ALU;

ARCHITECTURE behavior OF TB_ALU IS

   -- Component Declaration for the Unit Under Test (UUT)

   COMPONENT ALU
      PORT (
         CMD : IN STD_LOGIC;
         IN1 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         IN2 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
         RESULT : OUT STD_LOGIC_VECTOR(5 DOWNTO 0)
      );
   END COMPONENT;
   --Inputs
   SIGNAL CMD : STD_LOGIC := '0';
   SIGNAL IN1 : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');
   SIGNAL IN2 : STD_LOGIC_VECTOR(5 DOWNTO 0) := (OTHERS => '0');

   --Outputs
   SIGNAL RESULT : STD_LOGIC_VECTOR(5 DOWNTO 0);
   -- No clocks detected in port list. Replace <clock> below with 
   -- appropriate port name 

BEGIN

   -- Instantiate the Unit Under Test (UUT)
   uut : ALU PORT MAP(
      CMD => CMD,
      IN1 => IN1,
      IN2 => IN2,
      RESULT => RESULT
   );

   -- Stimulus process
   stim_proc : PROCESS
   BEGIN
      -- hold reset state for 100 ns.
      WAIT FOR 100 ns;

      -- insert stimulus here 
      IN1 <= "000101"; --5
      IN2 <= "000011"; --3
      WAIT FOR 100 ns;
      CMD <= '0'; -- RES: "001000" --8
      WAIT FOR 100 ns;
      CMD <= '1'; -- RES: "000010" --2
      WAIT FOR 100 ns;

      WAIT;
   END PROCESS;

END;