library ieee;
use ieee.NUMERIC_STD.all;
use ieee.STD_LOGIC_UNSIGNED.all;
use ieee.std_logic_1164.all;									

entity ans3_tb is
end ans3_tb;

architecture TB_ARCHITECTURE of ans3_tb is		  
	component ans3
		port(
			clk : in STD_LOGIC;
			a : in STD_LOGIC;
			b : in STD_LOGIC;
			enter_out : out STD_LOGIC;
			exit_out : out STD_LOGIC;
			in_counter : out STD_LOGIC_VECTOR(9 downto 0);
			out_counter : out STD_LOGIC_VECTOR(9 downto 0) );
	end component;
	
	signal clk : STD_LOGIC := '0';
	signal a : STD_LOGIC := '0';
	signal b : STD_LOGIC := '0';												 									 
	
	signal enter_out : STD_LOGIC;
	signal exit_out : STD_LOGIC;
	signal in_counter : STD_LOGIC_VECTOR(9 downto 0);
	signal out_counter : STD_LOGIC_VECTOR(9 downto 0);
	
	constant clk_period : time := 10 ns;
	
begin
	
	UUT : ans3
	port map (
		clk => clk,
		a => a,
		b => b,
		enter_out => enter_out,
		exit_out => exit_out,
		in_counter => in_counter,
		out_counter => out_counter
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
		wait for 100 ns;a <= '0';b <= '0';
		wait for 100 ns;a <= '1';b <= '0';
		wait for 100 ns;a <= '1';b <= '1';
		wait for 100 ns;a <= '0';b <= '1';
		
		wait for 100 ns;a <= '0';b <= '0';
		wait for 100 ns;a <= '1';b <= '0';
		wait for 100 ns;a <= '1';b <= '1';
		wait for 100 ns;a <= '0';b <= '1';
		
		wait for 100 ns;a <= '0';b <= '0';
		wait for 100 ns;a <= '1';b <= '0';
		wait for 100 ns;a <= '1';b <= '1';
		wait for 100 ns;a <= '0';b <= '1';
		
		wait for 100 ns;a <= '0';b <= '0';
		
		wait for 100 ns;a <= '0';b <= '1';
		wait for 100 ns;a <= '1';b <= '1';
		wait for 100 ns;a <= '1';b <= '0';
		wait for 100 ns;a <= '0';b <= '0';		
		
		
		wait;
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_ans3 of ans3_tb is
	for TB_ARCHITECTURE
		for UUT : ans3
			use entity work.ans3(ans3);
		end for;
	end for;
end TESTBENCH_FOR_ans3;

