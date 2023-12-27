LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
USE IEEE.STD_LOGIC_UNSIGNED.ALL;

----------------------------------------------------------------------------------
ENTITY ControlUnit IS
    PORT (
        clock, Reset : IN STD_LOGIC;
        ZR0, ZR1, ZR2, ZR3 : IN STD_LOGIC;
        ROUTIR : IN STD_LOGIC_VECTOR(5 DOWNTO 0);
        LD0, LD1, LD2, LD3 : OUT STD_LOGIC;
        LDPC, LDIR : OUT STD_LOGIC;
        S00, S01, S10, S11 : OUT STD_LOGIC;
        Bus_Sel, CMD : OUT STD_LOGIC;
        INC, RST : OUT STD_LOGIC
    );
END ControlUnit;

----------------------------------------------------------------------------------
ARCHITECTURE ControlUnit OF ControlUnit IS
    TYPE FSM IS (S0, S1, HLTSTATE, S2, S3, S4, S5, S6, S7);
    SIGNAL HLT : STD_LOGIC;
    SIGNAL temp : INTEGER;
    SIGNAL R : STD_LOGIC_VECTOR(0 TO 3);
    SIGNAL PSTATE, NSTATE : FSM;
BEGIN

    ----------------------------------------------------------------------------------
    temp <= conv_integer(ROUTIR(3 DOWNTO 2));
    R(0) <= ZR0;
    R(1) <= ZR1;
    R(2) <= ZR2;
    R(3) <= ZR3;

    S11 <= ROUTIR(0);
    S10 <= ROUTIR(1);
    S01 <= ROUTIR(2);
    S00 <= ROUTIR(3);

    PROCESS (ROUTIR)
    BEGIN
        IF (ROUTIR = "000000") THEN
            HLT <= '1';
        ELSE
            HLT <= '0';

        END IF;
    END PROCESS;

    --FSM
    ----------------------------------------------------------------------------------
    PROCESS (clock, Reset)
    BEGIN
        IF (Reset = '1') THEN
            PSTATE <= S0;

        ELSIF (rising_edge(clock)) THEN
            PSTATE <= NSTATE;

        END IF;
    END PROCESS;

    --S0
    ----------------------------------------------------------------------------------
    PROCESS (PSTATE, ROUTIR, ZR0, ZR1, ZR2, ZR3)
    BEGIN
        CASE PSTATE IS
            WHEN S0 =>

                RST <= '1';
                LDIR <= '0';
                INC <= '0';
                LDPC <= '0';
                Bus_Sel <= '0';
                LD0 <= '0';
                LD1 <= '0';
                LD2 <= '0';
                LD3 <= '0';
                LDPC <= '0';
                Bus_Sel <= '0';
                CMD <= '0';
                NSTATE <= S1;

                --s1	
                ----------------------------------------------------------------------------------   
            WHEN S1 =>

                LDIR <= '1';
                INC <= '1';
                LDPC <= '0';
                Bus_Sel <= '0';
                RST <= '0';
                LD0 <= '0';
                LD1 <= '0';
                LD2 <= '0';
                LD3 <= '0';
                CMD <= '0';
                NSTATE <= HLTSTATE;

                --HLTSTATE
                ----------------------------------------------------------------------------------
            WHEN HLTSTATE =>

                IF (ROUTIR = "000000") THEN
                    NSTATE <= S2;
                ELSE
                    IF (ROUTIR(5 DOWNTO 4) = "00") THEN
                        NSTATE <= S3;
                    ELSIF (ROUTIR(5 DOWNTO 4) = "01") THEN
                        NSTATE <= S4;
                    ELSIF (ROUTIR(5 DOWNTO 4) = "10") THEN
                        NSTATE <= S5;
                    ELSIF (ROUTIR(5 DOWNTO 4) = "11") THEN

                        IF (R(temp) = '1') THEN
                            NSTATE <= S7;
                        ELSE
                            NSTATE <= S6;
                        END IF;
                    END IF;
                END IF;

                RST <= '0';
                Bus_Sel <= '0';
                LD0 <= '0';
                LD1 <= '0';
                LD2 <= '0';
                LD3 <= '0';
                CMD <= '0';
                LDPC <= '0';
                LDIR <= '0';
                INC <= '0';

                --s2
                ----------------------------------------------------------------------------------
            WHEN S2 =>

                RST <= '0';
                Bus_Sel <= '0';
                LD0 <= '0';
                LD1 <= '0';
                LD2 <= '0';
                LD3 <= '0';

                CMD <= '0';
                LDPC <= '0';
                LDIR <= '0';
                NSTATE <= S2;

                --s3
                ----------------------------------------------------------------------------------
            WHEN S3 =>

                IF (ROUTIR(3 DOWNTO 2) = "00") THEN
                    LD0 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "01") THEN
                    LD1 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "10") THEN
                    LD2 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "11") THEN
                    LD3 <= '1';
                END IF;

                INC <= '1';
                LDPC <= '0';
                Bus_Sel <= '0';
                RST <= '0';
                LDIR <= '0';
                CMD <= '0';
                NSTATE <= S1;

                --s4
                ----------------------------------------------------------------------------------
            WHEN S4 =>

                IF (ROUTIR(3 DOWNTO 2) = "00") THEN
                    LD0 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "01") THEN
                    LD1 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "10") THEN
                    LD2 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "11") THEN
                    LD3 <= '1';
                END IF;

                CMD <= '0';
                Bus_Sel <= '1';
                RST <= '0';
                LDIR <= '0';
                INC <= '0';
                LDPC <= '0';
                NSTATE <= S1;
                --s5
                ----------------------------------------------------------------------------------
            WHEN S5 =>

                IF (ROUTIR(3 DOWNTO 2) = "00") THEN
                    LD0 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "01") THEN
                    LD1 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "10") THEN
                    LD2 <= '1';
                ELSIF (ROUTIR(3 DOWNTO 2) = "11") THEN
                    LD3 <= '1';
                END IF;

                CMD <= '1';
                Bus_Sel <= '1';
                RST <= '0';
                LDIR <= '0';
                INC <= '0';
                LDPC <= '0';
                NSTATE <= S1;

                --s6
                ----------------------------------------------------------------------------------
            WHEN S6 =>

                LDPC <= '1';
                INC <= '0';
                Bus_Sel <= '0';
                RST <= '0';
                LD0 <= '0';
                LD1 <= '0';
                LD2 <= '0';
                LD3 <= '0';
                LDIR <= '0';
                CMD <= '0';
                NSTATE <= S1;

                --s7
                ----------------------------------------------------------------------------------
            WHEN S7 =>

                INC <= '1';
                LDPC <= '0';
                RST <= '0';
                LD0 <= '0';
                LD1 <= '0';
                LD2 <= '0';
                LD3 <= '0';
                LDIR <= '0';
                CMD <= '0';
                Bus_Sel <= '0';
                NSTATE <= S1;

        END CASE;

    END PROCESS;

END ControlUnit;