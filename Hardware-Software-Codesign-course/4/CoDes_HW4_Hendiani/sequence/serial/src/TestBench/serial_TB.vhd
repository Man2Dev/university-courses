library ieee;
use ieee.std_logic_1164.all;

entity serial_tb is
end serial_tb;

architecture TB_ARCHITECTURE of serial_tb is				 
	component serial
		port(
			D : in STD_LOGIC;
			reset : in STD_LOGIC;
			clock : in STD_LOGIC;
			Q : out STD_LOGIC );
	end component;
	
	signal D : STD_LOGIC := '0';
	signal reset : STD_LOGIC := '1';
	signal clock : STD_LOGIC := '0';										   								 
	
	signal Q : STD_LOGIC;
	
	constant t : time := 10 ns;	 
	
begin								 						
	UUT : serial
	port map (
		D => D,
		reset => reset,
		clock => clock,
		Q => Q
		);
		
	clk : process
	begin				   
		wait for t/2;
		clock <= not clock;
	end process;
	
	test : process
	begin
		reset <= '0';
		D <= '0';
		wait for t;
		D <= '1';
		wait for t;
		D <= '0';
		wait for t;
		D <= '1';
		wait for t;
		D <= '0';
		wait for t;
		D <= '1';
		wait for t;
		D <= '1';
		wait for t;
		D <= '0';
		wait for t;
		D <= '0';
		wait for t;
		D <= '1';
		wait for t;
		D <= '1';
		wait for t;
		D <= '1';
		wait for t;
		D <= '1';
		wait for t;
		D <= '1';
		wait for t;
		D <= '0';
		wait for t;
		D <= '0';
		wait for t;
		D <= '0';
		wait for t;
		D <= '0';
		wait for t;
		D <= '0';
		wait for t;
		D <= '0';
		reset <= '1';
		wait for t;		  
	end process;
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_serial of serial_tb is
	for TB_ARCHITECTURE
		for UUT : serial
			use entity work.serial(serial);
		end for;
	end for;
end TESTBENCH_FOR_serial;