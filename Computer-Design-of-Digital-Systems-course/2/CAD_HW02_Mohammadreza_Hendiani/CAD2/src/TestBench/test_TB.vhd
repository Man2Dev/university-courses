library ieee;
use ieee.NUMERIC_STD.all;
use ieee.std_logic_1164.all;


entity test_tb is							   
	generic(
		N : POSITIVE := 7 );
end test_tb;

architecture TB_ARCHITECTURE of test_tb is
	
	component test
		generic(
			N : POSITIVE := 7 );
		port(
			input : in STD_LOGIC_VECTOR(N-1 downto 0);
			parity_even : out STD_LOGIC;
			parity_odd : out STD_LOGIC );
	end component;
	
	signal input : STD_LOGIC_VECTOR(N-1 downto 0);							   
	signal parity_even : STD_LOGIC;
	signal parity_odd : STD_LOGIC;
	
	constant period : time := 10 ns;
	
begin
	
	UUT : test
	generic map (
		N => N
		)
	
	port map (
		input => input,
		parity_even => parity_even,
		parity_odd => parity_odd
		);
	
	simulation : process
	begin
		input <= "0101010";
		wait for period;
		input <= "1110101";
		wait for period;
		input <= "0000101";
		wait for period;
		input <= "0101101";
		wait for period;
		input <= "1111111";
		wait for period;
		input <= "0000000";
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

