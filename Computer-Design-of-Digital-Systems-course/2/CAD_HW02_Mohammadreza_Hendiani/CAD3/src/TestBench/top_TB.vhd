library ieee;
use ieee.NUMERIC_STD.all;
use ieee.std_logic_1164.all;


entity top_tb is
end top_tb;

architecture TB_ARCHITECTURE of top_tb is
	
	component top
		port(
			A : in STD_LOGIC_VECTOR(3 downto 0);
			B : in STD_LOGIC_VECTOR(3 downto 0);
			Z : inout STD_LOGIC_VECTOR(4 downto 0);
			X : out STD_LOGIC_VECTOR(3 downto 0) );
	end component;
	
	signal A : STD_LOGIC_VECTOR(3 downto 0);
	signal B : STD_LOGIC_VECTOR(3 downto 0);
	signal X : STD_LOGIC_VECTOR(3 downto 0);
	signal Z : STD_LOGIC_VECTOR(4 downto 0);
	
	
	constant period : time := 10 ns;
	
begin
	
	UUT : top
	port map (
		A => A,
		B => B,
		X => X,
		Z => Z
		);
	
	simulation : process
	begin
		A <= "0010";
		B <= "0010";
		Z(0) <= '0';
		wait for period;
		A <= "0011";
		B <= "0111";
		Z(0) <= '1';
		wait for period;
		A <= "1010";
		B <= "0011";
		Z(0) <= '1';
		wait for period;
		A <= "1010";
		B <= "0111";
		Z(0) <= '1';
		wait for period;
		A <= "1110";
		B <= "1111";
		Z(0) <= '1';
		wait for period;
		A <= "0000";
		B <= "1111";
		Z(0) <= '0';
		wait for period;
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

