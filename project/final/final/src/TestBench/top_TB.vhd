library ieee;
use ieee.NUMERIC_STD.all;
use ieee.STD_LOGIC_UNSIGNED.all;
use ieee.std_logic_1164.all;						  

entity top_tb is
end top_tb;

architecture TB_ARCHITECTURE of top_tb is
	
	component top
		port(
			clk : in STD_LOGIC;
			reset : in STD_LOGIC;
			start : in STD_LOGIC;
			data_in : in STD_LOGIC_VECTOR(23 downto 0);
			stop : in STD_LOGIC;
			direction : in STD_LOGIC;
			speed : in STD_LOGIC_VECTOR(2 downto 0);
			location : out STD_LOGIC_VECTOR(3 downto 0);
			y1 : out STD_LOGIC_VECTOR(3 downto 0);
			y2 : out STD_LOGIC_VECTOR(3 downto 0);
			y3 : out STD_LOGIC_VECTOR(3 downto 0);
			flag : out STD_LOGIC;
			finish : out STD_LOGIC;
			wait_out : out STD_LOGIC;
			total_fruit : out STD_LOGIC_VECTOR(3 downto 0);
			total_time : out STD_LOGIC_VECTOR(7 downto 0) );
	end component;
	
	signal clk : STD_LOGIC := '0';
	signal reset : STD_LOGIC := '1';
	signal start : STD_LOGIC := '1';
	signal data_in : STD_LOGIC_VECTOR(23 downto 0) := X"222344";
	signal stop : STD_LOGIC := '0';
	signal direction : STD_LOGIC := '0';
	signal speed : STD_LOGIC_VECTOR(2 downto 0) := "101";
	
	signal location : STD_LOGIC_VECTOR(3 downto 0);
	signal y1 : STD_LOGIC_VECTOR(3 downto 0);
	signal y2 : STD_LOGIC_VECTOR(3 downto 0);
	signal y3 : STD_LOGIC_VECTOR(3 downto 0);
	signal flag : STD_LOGIC;
	signal finish : STD_LOGIC;
	signal wait_out : STD_LOGIC;
	signal total_fruit : STD_LOGIC_VECTOR(3 downto 0);
	signal total_time : STD_LOGIC_VECTOR(7 downto 0);
	
	constant clk_period : time := 10 ns;
	
begin
	
	UUT : top
	port map (
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
		wait for clk_period*30;
		start <= '0';
		wait;
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_top of top_tb is
	for TB_ARCHITECTURE
		for UUT : top
			use entity work.top(top);
		end for;
	end for;
end TESTBENCH_FOR_top;

