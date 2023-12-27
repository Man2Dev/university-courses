LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
----------------------------------------------------------------------------------
ENTITY REG IS
    PORT (
        CLK : IN STD_LOGIC;
        LD : IN STD_LOGIC;
        RIN : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        ROUT : OUT STD_LOGIC_VECTOR (5 DOWNTO 0);
        ZR : OUT STD_LOGIC);
END REG;
----------------------------------------------------------------------------------
ARCHITECTURE Behavioral OF REG IS
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
        IF tmp = "000000" THEN
            ZR <= '1';
        ELSE
            ZR <= '0';
        END IF;
    END PROCESS; -- pr
    ----------------------------------------------------------------------------------
    ROUT <= tmp;
END Behavioral;
----------------------------------------------------------------------------------