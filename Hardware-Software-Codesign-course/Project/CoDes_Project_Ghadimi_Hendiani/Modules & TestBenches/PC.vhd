LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.all;
----------------------------------------------------------------------------------
ENTITY PC IS
    PORT (
        CLK : IN STD_LOGIC;
        LD : IN STD_LOGIC;
        RIN : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        ROUT : OUT STD_LOGIC_VECTOR (5 DOWNTO 0);
        CLR : IN STD_LOGIC;
        INC : IN STD_LOGIC);
END PC;
----------------------------------------------------------------------------------
ARCHITECTURE Behavioral OF PC IS
    SIGNAL tmp : STD_LOGIC_VECTOR(5 DOWNTO 0) := "000000";
BEGIN
    ----------------------------------------------------------------------------------
    pr : PROCESS (CLK, LD, RIN, INC, CLR)
    BEGIN
        IF CLK'event AND CLK = '1' THEN
            IF LD = '1' THEN
                tmp <= RIN;
            ELSIF INC = '1' THEN
                tmp <= tmp + "000001";
            END IF;
        END IF;

        IF CLR = '1' THEN
            tmp <= "000000";
        END IF;
    END PROCESS; -- pr
    ----------------------------------------------------------------------------------
    ROUT <= tmp;
END Behavioral;
----------------------------------------------------------------------------------