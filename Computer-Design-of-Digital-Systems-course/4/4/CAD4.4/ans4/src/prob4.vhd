-------------------------------------------------------------------------------
--
-- Title       : prob4
-- Design      : ans4
-- Author      : Mohammadreza Hendiani
-- Company     : Mh.inc
--
-------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.std_logic_unsigned.all;
use ieee.numeric_std.all;

entity prob4 is
	Port ( clk : in  STD_LOGIC;
		reset : in  STD_LOGIC;
		push : in  STD_LOGIC;
		pop : in  STD_LOGIC;
		data_in : in  STD_LOGIC_VECTOR (7 downto 0);
		stack_full : out  STD_LOGIC;
		stack_empty : out  STD_LOGIC;
		data_out : out  STD_LOGIC_VECTOR (7 downto 0));
end prob4;										

architecture prob4 of prob4 is
	
	COMPONENT RAM
		PORT(
			clk : IN std_logic;
			WE : IN std_logic;
			addr : IN std_logic_vector(7 downto 0);       
			data_in : IN std_logic_vector(7 downto 0);
			data_out : OUT std_logic_vector(7 downto 0)
			);
	END COMPONENT;
	
	signal pointer : std_logic_vector(7 downto 0);
	
	signal empty_flag : STD_LOGIC;
	signal full_flag : STD_LOGIC;
	
	signal RAM_data_in :std_logic_vector(7 downto 0);
	signal RAM_data_out :std_logic_vector(7 downto 0);
	
begin
	
	Inst_RAM: RAM PORT MAP(
		clk => clk,
		WE => push,
		addr => pointer,
		data_in => RAM_data_in,
		data_out => RAM_data_out
		);
	
	process(clk)
	begin
		if(rising_edge(clk))then
			if(reset = '1')then
				pointer <= "00000000";
			else
				if(pop = '1')then
					if(empty_flag = '1')then
						
					else
						pointer <= pointer - 1;
					end if;
				end if;
				if(push = '1')then
					if(full_flag = '1')then
						
					else
						pointer <= pointer + 1;
					end if;
				end if;
			end if;
		end if;
	end process;
	
	empty_flag <= '1' when (pointer = "00000000") else '0';
	full_flag <= '1' when (pointer = "11111111") else '0';
	
	data_out <= RAM_data_out;
	
	RAM_data_in <= data_in;
	
	stack_empty <= empty_flag;
	stack_full <= full_flag;
	
end prob4;
