LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
----------------------------------------------------------------------------------
ENTITY MUX4 IS
    PORT (
        I0 : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        I1 : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        I2 : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        I3 : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        S0 : IN STD_LOGIC;
        S1 : IN STD_LOGIC;
        O : OUT STD_LOGIC_VECTOR (5 DOWNTO 0));
END MUX4;
----------------------------------------------------------------------------------
ARCHITECTURE Behavioral OF MUX4 IS
    ----------------------------------------------------------------------------------
    SIGNAL temp : STD_LOGIC_VECTOR (5 DOWNTO 0);
    ----------------------------------------------------------------------------------
BEGIN
    pr : PROCESS (I0, I1, I2, I3, S0, S1)
    BEGIN
        IF S0 = '0' THEN
            IF S1 = '0' THEN
                temp <= I0;
            ELSIF S1 = '1' THEN
                temp <= I1;
            END IF;
        ELSIF S0 = '1' THEN
            IF S1 = '0' THEN
                temp <= I2;
            ELSIF S1 = '1' THEN
                temp <= I3;
            END IF;
        END IF;
    END PROCESS; -- pr
    ----------------------------------------------------------------------------------
    O <= temp;
    ----------------------------------------------------------------------------------
END Behavioral;