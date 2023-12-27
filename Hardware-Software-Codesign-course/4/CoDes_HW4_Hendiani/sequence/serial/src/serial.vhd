LIBRARY ieee;
USE ieee.std_logic_1164.all;
--------------------------------------------------------------------
entity serial is
	port(D, reset, clock : in STD_LOGIC;
		Q : out STD_LOGIC);
end serial;
--------------------------------------------------------------------
architecture serial of serial is
	type state is (s0, s1, s2, s3);
	signal pr_state, nx_state : state;
	signal temp : std_logic;
begin
	--------------------------Lower section-------------------------
	process (reset, clock)
	begin
		if (reset='1') then
			pr_state <= s0;
		elsif (clock'event and clock='1') then
			Q <= temp;
			pr_state <= nx_state;
		end if;
	end process;
	--------------------------Upper section--------------------------
	process (D, pr_state)
	begin
		case pr_state is
			when s0 =>
				temp <= '0';
				if (D='0') then nx_state <= s0;
				else nx_state <= s1;
				end if;
			when s1 =>
				temp <= '0';
				if (D='0') then nx_state <= s0;
				else nx_state <= s2;
				end if;
			when s2 =>
				temp <= '0';
				if (D='0') then nx_state <= s0;
				else nx_state <= s3;
				end if;
			when s3 =>
				temp <= '1';
				if (D='0') then nx_state <= s0;
				else nx_state <= s3;
				end if;
		end case;
	end process;
end architecture;