LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
----------------------------------------------------------------------------------
ENTITY BUSC IS
    PORT (
        MDATA : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        ALURES : IN STD_LOGIC_VECTOR (5 DOWNTO 0);
        SEL : IN STD_LOGIC;
        DBUS : OUT STD_LOGIC_VECTOR (5 DOWNTO 0));
END BUSC;
----------------------------------------------------------------------------------
ARCHITECTURE Behavioral OF BUSC IS
    ----------------------------------------------------------------------------------
    ----------------------------------------------------------------------------------
BEGIN
    ----------------------------------------------------------------------------------
    pr : PROCESS (MDATA, ALURES, SEL)
    BEGIN
        IF SEL = '0' THEN
            DBUS <= MDATA;
        ELSE
            DBUS <= ALURES;
        END IF;
    END PROCESS; -- pr
    ----------------------------------------------------------------------------------
END Behavioral;