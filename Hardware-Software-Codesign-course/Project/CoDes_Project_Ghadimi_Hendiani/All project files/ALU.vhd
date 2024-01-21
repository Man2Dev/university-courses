LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
USE IEEE.STD_LOGIC_UNSIGNED.ALL;
----------------------------------------------------------------------------------
ENTITY ALU IS
    PORT (
        CMD : IN STD_LOGIC;
        IN1 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
        IN2 : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
        RESULT : OUT STD_LOGIC_VECTOR(5 DOWNTO 0)
    );
END ALU;
----------------------------------------------------------------------------------
ARCHITECTURE Behavioral OF ALU IS
    ----------------------------------------------------------------------------------
    SIGNAL temp : STD_LOGIC_VECTOR(5 DOWNTO 0);
    ----------------------------------------------------------------------------------
BEGIN
    PROCESS (IN1, IN2, CMD)
    BEGIN
        IF CMD = '0' THEN
            temp <= IN1 + IN2;
        ELSE
            temp <= IN1 - IN2;
        END IF;
    END PROCESS;
    RESULT <= temp;
    ----------------------------------------------------------------------------------
END Behavioral;
----------------------------------------------------------------------------------