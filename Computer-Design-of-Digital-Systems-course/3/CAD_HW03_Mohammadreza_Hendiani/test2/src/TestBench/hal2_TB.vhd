library ieee;
use ieee.NUMERIC_STD.all;
use ieee.STD_LOGIC_UNSIGNED.all;
use ieee.std_logic_1164.all;

entity hal2_tb is
end hal2_tb;

architecture TB_ARCHITECTURE of hal2_tb is		 	 
	
	component hal2
		port(
			clk : in STD_LOGIC;
			reset : in STD_LOGIC;
			control_signal : in STD_LOGIC_VECTOR(1 downto 0);
			r2_in : in STD_LOGIC_VECTOR(3 downto 0);
			r1_out : out STD_LOGIC_VECTOR(3 downto 0);
			r2_out : out STD_LOGIC_VECTOR(3 downto 0) );
	end component;
	
	
	signal clk : STD_LOGIC := '0';
	signal reset : STD_LOGIC := '1';
	signal control_signal : STD_LOGIC_VECTOR(1 downto 0) := (others => '0');
	signal r2_in : STD_LOGIC_VECTOR(3 downto 0) := (others => '0');
	
	signal r1_out : STD_LOGIC_VECTOR(3 downto 0);
	signal r2_out : STD_LOGIC_VECTOR(3 downto 0);
	
	constant clk_period : time := 10 ns;
	
begin
	
	UUT : hal2
	port map (
		clk => clk,
		reset => reset,
		control_signal => control_signal,
		r2_in => r2_in,
		r1_out => r1_out,
		r2_out => r2_out
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
		r2_in <= "1010";
		control_signal <= "00";
		wait for 100 ns;
		control_signal <= "01";
		wait for 100 ns;
		control_signal <= "10";
		wait for 100 ns;
		control_signal <= "11";
		wait;
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_hal2 of hal2_tb is
	for TB_ARCHITECTURE
		for UUT : hal2
			use entity work.hal2(hal2);
		end for;
	end for;
end TESTBENCH_FOR_hal2;

