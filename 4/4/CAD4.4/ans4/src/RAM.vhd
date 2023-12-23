-------------------------------------------------------------------------------
--
-- Title       : RAM
-- Design      : ans4
-- Author      : Mohammadreza Hendiani
-- Company     : MH.inc
--
-------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use ieee.numeric_std.all;
use ieee.std_logic_unsigned.all;

entity RAM is
	generic(data_width :integer := 8;
		addr_width :integer := 8);
	Port ( clk : in  STD_LOGIC;
		WE : in  STD_LOGIC;
		addr : in  STD_LOGIC_VECTOR (addr_width-1 downto 0);
		data_in : in  STD_LOGIC_VECTOR (data_width-1 downto 0);
		data_out : out  STD_LOGIC_VECTOR (data_width-1 downto 0));
end RAM;

architecture RAM of RAM is
	
	type mem is array (2**addr_width-1 downto 0) of STD_LOGIC_VECTOR(data_width-1 downto 0);
	signal my_RAM : mem := (others=>(others=>'0'));
	
begin
	process(clk)
	begin
		if(rising_edge(clk))then
			if(WE = '1')then
				my_RAM(to_integer(unsigned(addr))) <= data_in;
			end if;
		end if;
	end process;
	
	data_out <= my_RAM(to_integer(unsigned(addr)));
	
end RAM;
