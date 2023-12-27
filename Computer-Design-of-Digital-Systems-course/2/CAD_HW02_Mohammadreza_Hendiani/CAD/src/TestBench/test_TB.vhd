library ieee;
use ieee.std_logic_1164.all;
entity test_tb is
end test_tb;

architecture TB_ARCHITECTURE of test_tb is
	
	component test
		port(
			r : in STD_LOGIC_VECTOR(3 downto 0);
			code : out STD_LOGIC_VECTOR(1 downto 0);
			act : out STD_LOGIC );
	end component;
	
	signal r : STD_LOGIC_VECTOR(3 downto 0);
	signal code : STD_LOGIC_VECTOR(1 downto 0);
	signal act : STD_LOGIC;
	
	constant period : time := 50 ns;
	
begin
	
	UUT : test
	port map (
		r => r,
		code => code,
		act => act
		);
	
	simulation : process
	begin
		r <= "1000";
		wait for period;
		r <= "0100";
		wait for period;
		r <= "1100";
		wait for period;	
		r <= "1000";
		wait for period;	
		r <= "0011";
		wait for period;	
		r <= "0000";
		wait for period;	
		r <= "0001";
		wait for period;		
		wait;
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_test of test_tb is
	for TB_ARCHITECTURE
		for UUT : test
			use entity work.test(test);
		end for;
	end for;
end TESTBENCH_FOR_test;

