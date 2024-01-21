-------------------------------------------------------------------------------
--
-- Title       : top
-- Design      : final
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_unsigned.all;
use ieee.numeric_std.all;

entity top is
	Port ( clk : in  STD_LOGIC;
		reset : in  STD_LOGIC;
		start : in  STD_LOGIC;
		data_in : in  STD_LOGIC_VECTOR (23 downto 0);
		stop : in  STD_LOGIC;
		direction : in  STD_LOGIC;
		speed : in  STD_LOGIC_VECTOR (2 downto 0);
		location : out  STD_LOGIC_VECTOR (3 downto 0);
		y1 : out  STD_LOGIC_VECTOR (3 downto 0);
		y2 : out  STD_LOGIC_VECTOR (3 downto 0);
		y3 : out  STD_LOGIC_VECTOR (3 downto 0);
		flag : out  STD_LOGIC;
		finish : out  STD_LOGIC;
		wait_out : out  STD_LOGIC;
		total_fruit : out  STD_LOGIC_VECTOR (3 downto 0);
		total_time : out  STD_LOGIC_VECTOR (7 downto 0));
end top;										 

architecture top of top is
	
	COMPONENT counter
		PORT(
			clk : IN std_logic;
			reset : IN std_logic;
			enable_in : IN std_logic;          
			enable_out : OUT std_logic
			);
	END COMPONENT;
	
	signal en0 : std_logic;
	signal en1 : std_logic;
	signal state : STD_LOGIC;
	
	signal x1:STD_LOGIC_VECTOR(3 downto 0);
	signal x2:STD_LOGIC_VECTOR(3 downto 0);
	signal x3:STD_LOGIC_VECTOR(3 downto 0);
	
	signal v1:STD_LOGIC_VECTOR(3 downto 0);
	signal v2:STD_LOGIC_VECTOR(3 downto 0);
	signal v3:STD_LOGIC_VECTOR(3 downto 0);
	
	signal y1_t :STD_LOGIC_VECTOR(3 downto 0);
	signal y2_t :STD_LOGIC_VECTOR(3 downto 0);
	signal y3_t :STD_LOGIC_VECTOR(3 downto 0);
	
	signal y1_flag :std_logic := '0';
	signal y2_flag :std_logic := '0';
	signal y3_flag :std_logic := '0';
	
	signal location_t :STD_LOGIC_VECTOR(3 downto 0);
	signal total_fruit_t :STD_LOGIC_VECTOR(3 downto 0);
	signal total_time_t :STD_LOGIC_VECTOR(7 downto 0);
	
	
	signal finish_t : std_logic;
	signal counter0_reset : std_logic;
	signal counter1_reset : std_logic;
	
begin
	
	counter0_reset <= reset or stop;
	counter1_reset <= reset or stop;
	
	Inst_counter0: counter PORT MAP(
		clk => clk,
		reset => counter0_reset,
		enable_in => '1',
		enable_out => en0
		);
	Inst_counter1: counter PORT MAP(
		clk => clk,
		reset => counter1_reset,
		enable_in => en0,
		enable_out => en1
		);
	
	process(clk)
	begin
		if(rising_edge(clk))then
			if(reset = '1')then
				state <= '0';
				location_t <= "0000";
				total_fruit_t <= "0000";
				total_time_t <= "00000000";
				finish_t <= '0';
			elsif(stop = '0')then
				if(total_fruit_t = "1010")then
					finish_t <= '1';
				else
					if(en0 = '1')then
						if(state = '0')then
							if(start = '1')then
								total_fruit_t <= "0000";
								total_time_t <= "00000000";				
								state <= '1';
								finish_t <= '0';
								x1 <= data_in(23 downto 20);
								v1 <= data_in(19 downto 16);
								x2 <= data_in(15 downto 12);
								v2 <= data_in(11 downto 8);
								x3 <= data_in(7 downto 4);
								v3 <= data_in(3 downto 0);
								y1_t <= "1111";
								y2_t <= "1111";
								y3_t <= "1111";
							end if;
						elsif(state = '1')then
							if(en1 = '0')then
								total_time_t <= total_time_t + 1;
								---------------------------------------------------- BP			
								if(direction = '0')then
									if(speed > 15-location_t)then
										location_t <= "1111";
									else
										location_t <= location_t + speed;
									end if;
								else
									if(location_t < speed)then
										location_t <= "0000";
									else
										location_t <= location_t - speed;				
									end if;		
								end if;
								---------------------------------------------------- Y1
								if(y1_t > v1)then
									y1_t <= y1_t - v1;
								else
									y1_t <= "0000";
								end if;
								---------------------------------------------------- Y2
								if(y2_t > v2)then
									y2_t <= y2_t - v2;
								else
									y2_t <= "0000";
								end if;
								---------------------------------------------------- Y3
								if(y3_t > v3)then
									y3_t <= y3_t - v3;
								else
									y3_t <= "0000";
								end if;
								----------------------------------------------------			
								if(y1_t = "0000" and x1 = location_t)then
									total_fruit_t <= total_fruit_t + 1;
									y1_flag <= '1';
								else
									y1_flag <= '0';
								end if;
								if(y2_t = "0000" and x2 = location_t)then
									total_fruit_t <= total_fruit_t + 1;
									y2_flag <= '1';
								else
									y2_flag <= '0';
								end if;
								if(y3_t = "0000" and x3 = location_t)then
									total_fruit_t <= total_fruit_t + 1;
									y3_flag <= '1';
								else
									y3_flag <= '0';
								end if;
							else
								x1 <= data_in(23 downto 20);
								v1 <= data_in(19 downto 16);
								x2 <= data_in(15 downto 12);
								v2 <= data_in(11 downto 8);
								x3 <= data_in(7 downto 4);
								v3 <= data_in(3 downto 0);
								y1_t <= "1111";
								y2_t <= "1111";
								y3_t <= "1111";
							end if;
						end if;
					end if;
				end if;
			end if;
		end if;
	end process;
	
	
	wait_out <= '1' when ((direction = '0' and location_t = "1111") or (direction = '1' and location_t = "0000")) else '0';
	flag <= y1_flag or y2_flag or y3_flag;
	location <= location_t;
	total_fruit <= total_fruit_t;
	total_time <= total_time_t;
	finish <= finish_t;
	y1 <= y1_t;
	y2 <= y2_t;
	y3 <= y3_t;
	
end top;
