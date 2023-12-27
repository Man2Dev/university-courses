LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
----------------------------------------------------------------------------------
ENTITY IR IS
    PORT (
        CLK : IN STD_LOGIC;
        LD : IN STD_LOGIC;
        RIN : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        ROUT : OUT STD_LOGIC_VECTOR (5 DOWNTO 0));
END IR;
----------------------------------------------------------------------------------
ARCHITECTURE Behavioral OF IR IS
    SIGNAL tmp : STD_LOGIC_VECTOR(5 DOWNTO 0) := "000000";
BEGIN
    ----------------------------------------------------------------------------------
    pr : PROCESS (CLK, LD, RIN)
    BEGIN
        IF CLK'event AND CLK = '1' THEN
            IF LD = '1' THEN
                tmp <= RIN;
            END IF;
        END IF;
    END PROCESS; -- pr
    ----------------------------------------------------------------------------------
    ROUT <= tmp;
END Behavioral;
----------------------------------------------------------------------------------