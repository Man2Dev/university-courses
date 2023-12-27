library ieee;
use ieee.NUMERIC_STD.all;
use ieee.STD_LOGIC_UNSIGNED.all;
use ieee.std_logic_1164.all;							 					  

entity prob4_tb is
end prob4_tb;

architecture TB_ARCHITECTURE of prob4_tb is	
	
	component prob4
		port(
			clk : in STD_LOGIC;
			reset : in STD_LOGIC;
			push : in STD_LOGIC;
			pop : in STD_LOGIC;
			data_in : in STD_LOGIC_VECTOR(7 downto 0);
			stack_full : out STD_LOGIC;
			stack_empty : out STD_LOGIC;
			data_out : out STD_LOGIC_VECTOR(7 downto 0) );
	end component;
	
	signal clk : STD_LOGIC := '0';
	signal reset : STD_LOGIC := '1';
	signal push : STD_LOGIC := '0';
	signal pop : STD_LOGIC := '0';
	signal data_in : STD_LOGIC_VECTOR(7 downto 0) := (others => '0');		 	  
	
	signal stack_full : STD_LOGIC;
	signal stack_empty : STD_LOGIC;
	signal data_out : STD_LOGIC_VECTOR(7 downto 0);
	
	constant clk_period : time := 10 ns;
	
begin
	
	UUT : prob4
	port map (
		clk => clk,
		reset => reset,
		push => push,
		pop => pop,
		data_in => data_in,
		stack_full => stack_full,
		stack_empty => stack_empty,
		data_out => data_out
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
		wait for clk_period; push <= '1';data_in <= data_in + 1;
		wait for clk_period; push <= '1';data_in <= data_in + 1;
		wait for clk_period; push <= '1';data_in <= data_in + 1;
		wait for clk_period; push <= '1';data_in <= data_in + 1;
		wait for clk_period; push <= '1';data_in <= data_in + 1;
		wait for clk_period; push <= '1';data_in <= data_in + 1;
		wait for clk_period; push <= '0';pop <= '1';
		wait;
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_prob4 of prob4_tb is
	for TB_ARCHITECTURE
		for UUT : prob4
			use entity work.prob4(prob4);
		end for;
	end for;
end TESTBENCH_FOR_prob4;

