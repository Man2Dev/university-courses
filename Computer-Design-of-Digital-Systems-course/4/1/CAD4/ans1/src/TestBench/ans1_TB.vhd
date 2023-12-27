library ieee;
use ieee.std_logic_1164.all;


entity ans1_tb is
end ans1_tb;

architecture TB_ARCHITECTURE of ans1_tb is
	
	component ans1
		port(
			qin : in STD_LOGIC;
			y1 : out STD_LOGIC;
			y2 : out STD_LOGIC;
			y3 : out STD_LOGIC;
			y4 : out STD_LOGIC;
			y5 : out STD_LOGIC );
	end component;
	
	signal qin : STD_LOGIC:= '0';
	
	signal y1 : STD_LOGIC;
	signal y2 : STD_LOGIC;
	signal y3 : STD_LOGIC;
	signal y4 : STD_LOGIC;
	signal y5 : STD_LOGIC;
	
	
begin
	
	UUT : ans1
	port map (
		qin => qin,
		y1 => y1,
		y2 => y2,
		y3 => y3,
		y4 => y4,
		y5 => y5
		);
	qin <= '0','1' after 10ns,'0' after 13ns,'1' after 15ns,'0' after 15.8ns,
	'1' after 17ns,'0' after 17.4ns,'1' after 21ns,'0' after 25ns,'1' after 25.6ns;	   
	
end TB_ARCHITECTURE;

configuration TESTBENCH_FOR_ans1 of ans1_tb is
	for TB_ARCHITECTURE
		for UUT : ans1
			use entity work.ans1(ans1);
		end for;
	end for;
end TESTBENCH_FOR_ans1;

