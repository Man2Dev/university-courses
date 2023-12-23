library ieee;
use ieee.std_logic_1164.all;							  					   

entity hal3_tb is
end hal3_tb;

architecture TB_ARCHITECTURE of hal3_tb is		 	 
	
	component hal3
		port(
			clk : in STD_LOGIC;
			reset : in STD_LOGIC;
			cmd : in STD_LOGIC_VECTOR(2 downto 0);
			data_in : in STD_LOGIC_VECTOR(7 downto 0);
			data_out : out STD_LOGIC_VECTOR(7 downto 0) );
	end component;
	
	
	signal clk : STD_LOGIC := '0';
	signal reset : STD_LOGIC := '1';
	signal cmd : STD_LOGIC_VECTOR(2 downto 0) := (others => '0');
	signal data_in : STD_LOGIC_VECTOR(7 downto 0) := (others => '0');		   		
	
	signal data_out : STD_LOGIC_VECTOR(7 downto 0);			  
	
	constant clk_period : time := 10 ns;
	
begin							   					   
	
	UUT : hal3
	port map (
		clk => clk,
		reset => reset,
		cmd => cmd,
		data_in => data_in,
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
		cmd <= "111";
		data_in <= "01010101";
		wait for 100 ns;
		cmd <= "110";
		wait for 100 ns;
		cmd <= "101";
		wait for 100 ns;
		cmd <= "100";
		wait for 100 ns;
		cmd <= "011";
		wait for 100 ns;
		cmd <= "010";
		wait for 100 ns;
		cmd <= "001";
		wait for 100 ns;
		cmd <= "000";
		wait;
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_hal3 of hal3_tb is
	for TB_ARCHITECTURE
		for UUT : hal3
			use entity work.hal3(hal3);
		end for;
	end for;
end TESTBENCH_FOR_hal3;

