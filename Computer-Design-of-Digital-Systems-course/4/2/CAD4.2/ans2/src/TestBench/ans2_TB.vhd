library ieee;
use ieee.std_logic_1164.all;

entity ans2_tb is
end ans2_tb;

architecture TB_ARCHITECTURE of ans2_tb is			 		
	
	component ans2
		port(
			clk : in STD_LOGIC;
			reset : in STD_LOGIC;
			x : in STD_LOGIC;
			o : out STD_LOGIC );
	end component;
	
	
	signal clk : STD_LOGIC := '0';
	signal reset : STD_LOGIC;
	signal x : STD_LOGIC;																								 
	signal o : STD_LOGIC;					
	
begin
	
	UUT : ans2
	port map (
		clk => clk,
		reset => reset,
		x => x,
		o => o
		);
	reset <= '0' , '1' after 3ns , '0' after 6ns ;
	
	clk_process :process
	begin
		clk <= '0';
		wait for 5ns;
		clk <= '1';
		wait for 5ns;
	end process;
	
	stim_proc: process
	begin					
		x <= '0';
		wait until reset <= '0';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '1';
		wait until rising_edge(clk); x <= '1';
		wait until rising_edge(clk); x <= '1';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '1';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '1';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '1';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '1';
		wait until rising_edge(clk); x <= '0';
		wait until rising_edge(clk); x <= '0';
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_ans2 of ans2_tb is
	for TB_ARCHITECTURE
		for UUT : ans2
			use entity work.ans2(ans2);
		end for;
	end for;
end TESTBENCH_FOR_ans2;

