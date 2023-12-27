LIBRARY ieee;
USE ieee.std_logic_1164.ALL;
 
ENTITY top_test IS
END top_test;
 
ARCHITECTURE behavior OF top_test IS 
 
    COMPONENT top
    PORT(
         clk : IN  std_logic;
         reset : IN  std_logic;
         start : IN  std_logic;
         data_in : IN  std_logic_vector(23 downto 0);
         stop : IN  std_logic;
         direction : IN  std_logic;
         speed : IN  std_logic_vector(2 downto 0);
         location : OUT  std_logic_vector(3 downto 0);
         y1 : OUT  std_logic_vector(3 downto 0);
         y2 : OUT  std_logic_vector(3 downto 0);
         y3 : OUT  std_logic_vector(3 downto 0);
         flag : OUT  std_logic;
         finish : OUT  std_logic;
         wait_out : OUT  std_logic;
         total_fruit : OUT  std_logic_vector(3 downto 0);
         total_time : OUT  std_logic_vector(7 downto 0)
        );
    END COMPONENT;
    

   signal clk : std_logic := '0';
   signal reset : std_logic := '1';
   signal start : std_logic := '1';
   signal data_in : std_logic_vector(23 downto 0) := X"223344";
   signal stop : std_logic := '0';
   signal direction : std_logic := '0';
   signal speed : std_logic_vector(2 downto 0) := "101";

   signal location : std_logic_vector(3 downto 0);
   signal y1 : std_logic_vector(3 downto 0);
   signal y2 : std_logic_vector(3 downto 0);
   signal y3 : std_logic_vector(3 downto 0);
   signal flag : std_logic;
   signal finish : std_logic;
   signal wait_out : std_logic;
   signal total_fruit : std_logic_vector(3 downto 0);
   signal total_time : std_logic_vector(7 downto 0);

   constant clk_period : time := 10 ns;
 
BEGIN
 
   uut: top PORT MAP (
          clk => clk,
          reset => reset,
          start => start,
          data_in => data_in,
          stop => stop,
          direction => direction,
          speed => speed,
          location => location,
          y1 => y1,
          y2 => y2,
          y3 => y3,
          flag => flag,
          finish => finish,
          wait_out => wait_out,
          total_fruit => total_fruit,
          total_time => total_time
        );

   clk_process :process
   begin
		clk <= '0';
		wait for clk_period/2;
		clk <= '1';
		wait for clk_period/2;
   end process;
 

   stim_proc: process
   begin		
      wait for 100 ns;	
		reset <= '0';
      wait for clk_period*10;
		start <= '0';
      wait;
   end process;

END;
