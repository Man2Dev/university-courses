----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date:    11:51:03 12/07/2020 
-- Design Name: 
-- Module Name:    m - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity TriBuffer is
    Port ( 	Din : in  STD_LOGIC;
				Enable : in STD_LOGIC;
				Dout : out  STD_LOGIC);
end TriBuffer;

architecture Behavioral of TriBuffer is

begin
	process(Din, Enable)
		begin
			if Enable = '1' then
				Dout <= Din;
			else
				Dout <= 'Z';
			end if;
		end Process;
end Behavioral;

