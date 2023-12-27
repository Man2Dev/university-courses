library ieee;
use ieee.std_logic_1164.all;
													  								   	

entity hal1_tb is
end hal1_tb;

architecture TB_ARCHITECTURE of hal1_tb is		 
	component hal1
		port(
			a : in STD_LOGIC;
			b : in STD_LOGIC;
			c : in STD_LOGIC;
			d : in STD_LOGIC;
			z : out STD_LOGIC );
	end component;
	
	signal a : STD_LOGIC := '0';
	signal b : STD_LOGIC := '0';
	signal c : STD_LOGIC := '0';
	signal d : STD_LOGIC := '0';
	
	signal z : std_logic;
	
begin
								
	UUT : hal1
	port map (
		a => a,
		b => b,
		c => c,
		d => d,
		z => z
		);
	
	stim_proc: process
	begin		
		wait for 100 ns;d <= '0';c <= '0';b <= '0';a <= '0';
		wait for 100 ns;d <= '0';c <= '0';b <= '0';a <= '1';
		wait for 100 ns;d <= '0';c <= '0';b <= '1';a <= '0';
		wait for 100 ns;d <= '0';c <= '0';b <= '1';a <= '1';
		wait for 100 ns;d <= '0';c <= '1';b <= '0';a <= '0';
		wait for 100 ns;d <= '0';c <= '1';b <= '0';a <= '1';
		wait for 100 ns;d <= '0';c <= '1';b <= '1';a <= '0';
		wait for 100 ns;d <= '0';c <= '1';b <= '1';a <= '1';
		wait for 100 ns;d <= '1';c <= '0';b <= '0';a <= '0';
		wait for 100 ns;d <= '1';c <= '0';b <= '0';a <= '1';
		wait for 100 ns;d <= '1';c <= '0';b <= '1';a <= '0';
		wait for 100 ns;d <= '1';c <= '0';b <= '1';a <= '1';
		wait for 100 ns;d <= '1';c <= '1';b <= '0';a <= '0';
		wait for 100 ns;d <= '1';c <= '1';b <= '0';a <= '1';
		wait for 100 ns;d <= '1';c <= '1';b <= '1';a <= '0';
		wait for 100 ns;d <= '1';c <= '1';b <= '1';a <= '1';
		wait;
	end process;  	
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_hal1 of hal1_tb is
	for TB_ARCHITECTURE
		for UUT : hal1
			use entity work.hal1(hal1);
		end for;
	end for;
end TESTBENCH_FOR_hal1;

