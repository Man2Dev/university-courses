--------------------------------------------------------------------------------
-- Copyright (c) 1995-2013 Xilinx, Inc.  All rights reserved.
--------------------------------------------------------------------------------
--   ____  ____ 
--  /   /\/   / 
-- /___/  \  /    Vendor: Xilinx 
-- \   \   \/     Version : 14.7
--  \   \         Application : sch2hdl
--  /   /         Filename : CPU_drc.vhf
-- /___/   /\     Timestamp : 07/01/2022 20:06:31
-- \   \  /  \ 
--  \___\/\___\ 
--
--Command: D:\Xilinx\ISE\14.7\ISE_DS\ISE\bin\nt64\unwrapped\sch2hdl.exe -intstyle ise -family spartan3 -flat -suppress -vhdl CPU_drc.vhf -w "D:/Downloads/Uni Term 10/CoDes/Tamrin/CoDes_Project_Ghadimi_Hendiyani/CPU.sch"
--Design Name: CPU
--Device: spartan3
--Purpose:
--    This vhdl netlist is translated from an ECS schematic. It can be 
--    synthesized and simulated, but it should not be modified. 
--

library ieee;
use ieee.std_logic_1164.ALL;
use ieee.numeric_std.ALL;
library UNISIM;
use UNISIM.Vcomponents.ALL;

entity CPU is
   port ( clock : in    std_logic; 
          Reset : in    std_logic);
end CPU;

architecture BEHAVIORAL of CPU is
   signal XLXN_7  : std_logic_vector (5 downto 0);
   signal XLXN_12 : std_logic_vector (5 downto 0);
   signal XLXN_15 : std_logic_vector (5 downto 0);
   signal XLXN_16 : std_logic;
   signal XLXN_39 : std_logic;
   signal XLXN_40 : std_logic;
   signal XLXN_41 : std_logic;
   signal XLXN_42 : std_logic;
   signal XLXN_43 : std_logic;
   signal XLXN_44 : std_logic;
   signal XLXN_45 : std_logic;
   signal XLXN_46 : std_logic;
   signal XLXN_47 : std_logic;
   signal XLXN_48 : std_logic;
   signal XLXN_49 : std_logic;
   signal XLXN_50 : std_logic;
   signal XLXN_51 : std_logic;
   signal XLXN_52 : std_logic;
   signal XLXN_53 : std_logic;
   signal XLXN_54 : std_logic;
   signal XLXN_55 : std_logic;
   signal XLXN_56 : std_logic_vector (5 downto 0);
   signal XLXN_57 : std_logic_vector (5 downto 0);
   signal XLXN_58 : std_logic_vector (5 downto 0);
   signal XLXN_59 : std_logic_vector (5 downto 0);
   signal XLXN_60 : std_logic_vector (5 downto 0);
   signal XLXN_62 : std_logic_vector (5 downto 0);
   signal XLXN_63 : std_logic_vector (5 downto 0);
   signal XLXN_72 : std_logic_vector (5 downto 0);
   component ALU
      port ( CMD    : in    std_logic; 
             IN1    : in    std_logic_vector (5 downto 0); 
             IN2    : in    std_logic_vector (5 downto 0); 
             RESULT : out   std_logic_vector (5 downto 0));
   end component;
   
   component BUSC
      port ( SEL    : in    std_logic; 
             MDATA  : in    std_logic_vector (5 downto 0); 
             ALURES : in    std_logic_vector (5 downto 0); 
             DBUS   : out   std_logic_vector (5 downto 0));
   end component;
   
   component ControlUnit
      port ( clock   : in    std_logic; 
             Reset   : in    std_logic; 
             ZR0     : in    std_logic; 
             ZR1     : in    std_logic; 
             ZR2     : in    std_logic; 
             ZR3     : in    std_logic; 
             ROUTIR  : in    std_logic_vector (5 downto 0); 
             LD0     : out   std_logic; 
             LD1     : out   std_logic; 
             LD2     : out   std_logic; 
             LD3     : out   std_logic; 
             LDPC    : out   std_logic; 
             LDIR    : out   std_logic; 
             S00     : out   std_logic; 
             S01     : out   std_logic; 
             S10     : out   std_logic; 
             S11     : out   std_logic; 
             Bus_Sel : out   std_logic; 
             CMD     : out   std_logic; 
             INC     : out   std_logic; 
             RST     : out   std_logic);
   end component;
   
   component IR
      port ( CLK  : in    std_logic; 
             LD   : in    std_logic; 
             RIN  : in    std_logic_vector (5 downto 0); 
             ROUT : out   std_logic_vector (5 downto 0));
   end component;
   
   component MEM
      port ( ADDRESS : in    std_logic_vector (5 downto 0); 
             DATA    : out   std_logic_vector (5 downto 0));
   end component;
   
   component MUX4
      port ( S0 : in    std_logic; 
             S1 : in    std_logic; 
             I0 : in    std_logic_vector (5 downto 0); 
             I1 : in    std_logic_vector (5 downto 0); 
             I2 : in    std_logic_vector (5 downto 0); 
             I3 : in    std_logic_vector (5 downto 0); 
             O  : out   std_logic_vector (5 downto 0));
   end component;
   
   component PC
      port ( CLK  : in    std_logic; 
             LD   : in    std_logic; 
             CLR  : in    std_logic; 
             INC  : in    std_logic; 
             RIN  : in    std_logic_vector (5 downto 0); 
             ROUT : out   std_logic_vector (5 downto 0));
   end component;
   
   component REG
      port ( CLK  : in    std_logic; 
             LD   : in    std_logic; 
             RIN  : in    std_logic_vector (5 downto 0); 
             ZR   : out   std_logic; 
             ROUT : out   std_logic_vector (5 downto 0));
   end component;
   
begin
   ALU_component : ALU
      port map (CMD=>XLXN_45,
                IN1(5 downto 0)=>XLXN_62(5 downto 0),
                IN2(5 downto 0)=>XLXN_63(5 downto 0),
                RESULT(5 downto 0)=>XLXN_15(5 downto 0));
   
   BUSC_component : BUSC
      port map (ALURES(5 downto 0)=>XLXN_15(5 downto 0),
                MDATA(5 downto 0)=>XLXN_12(5 downto 0),
                SEL=>XLXN_16,
                DBUS(5 downto 0)=>XLXN_72(5 downto 0));
   
   ControlUnit_component : ControlUnit
      port map (clock=>clock,
                Reset=>Reset,
                ROUTIR(5 downto 0)=>XLXN_56(5 downto 0),
                ZR0=>XLXN_52,
                ZR1=>XLXN_53,
                ZR2=>XLXN_54,
                ZR3=>XLXN_55,
                Bus_Sel=>XLXN_16,
                CMD=>XLXN_45,
                INC=>XLXN_46,
                LDIR=>XLXN_44,
                LDPC=>XLXN_43,
                LD0=>XLXN_39,
                LD1=>XLXN_40,
                LD2=>XLXN_41,
                LD3=>XLXN_42,
                RST=>XLXN_47,
                S00=>XLXN_48,
                S01=>XLXN_49,
                S10=>XLXN_50,
                S11=>XLXN_51);
   
   IR_component : IR
      port map (CLK=>clock,
                LD=>XLXN_44,
                RIN(5 downto 0)=>XLXN_72(5 downto 0),
                ROUT(5 downto 0)=>XLXN_56(5 downto 0));
   
   MEM_component : MEM
      port map (ADDRESS(5 downto 0)=>XLXN_7(5 downto 0),
                DATA(5 downto 0)=>XLXN_12(5 downto 0));
   
   MUX0_component : MUX4
      port map (I0(5 downto 0)=>XLXN_57(5 downto 0),
                I1(5 downto 0)=>XLXN_58(5 downto 0),
                I2(5 downto 0)=>XLXN_59(5 downto 0),
                I3(5 downto 0)=>XLXN_60(5 downto 0),
                S0=>XLXN_48,
                S1=>XLXN_49,
                O(5 downto 0)=>XLXN_62(5 downto 0));
   
   MUX1_component : MUX4
      port map (I0(5 downto 0)=>XLXN_57(5 downto 0),
                I1(5 downto 0)=>XLXN_58(5 downto 0),
                I2(5 downto 0)=>XLXN_59(5 downto 0),
                I3(5 downto 0)=>XLXN_60(5 downto 0),
                S0=>XLXN_50,
                S1=>XLXN_51,
                O(5 downto 0)=>XLXN_63(5 downto 0));
   
   PC_component : PC
      port map (CLK=>clock,
                CLR=>XLXN_47,
                INC=>XLXN_46,
                LD=>XLXN_43,
                RIN(5 downto 0)=>XLXN_72(5 downto 0),
                ROUT(5 downto 0)=>XLXN_7(5 downto 0));
   
   R0_component : REG
      port map (CLK=>clock,
                LD=>XLXN_39,
                RIN(5 downto 0)=>XLXN_72(5 downto 0),
                ROUT(5 downto 0)=>XLXN_57(5 downto 0),
                ZR=>XLXN_52);
   
   R1_component : REG
      port map (CLK=>clock,
                LD=>XLXN_40,
                RIN(5 downto 0)=>XLXN_72(5 downto 0),
                ROUT(5 downto 0)=>XLXN_58(5 downto 0),
                ZR=>XLXN_53);
   
   R2_component : REG
      port map (CLK=>clock,
                LD=>XLXN_41,
                RIN(5 downto 0)=>XLXN_72(5 downto 0),
                ROUT(5 downto 0)=>XLXN_59(5 downto 0),
                ZR=>XLXN_54);
   
   R3_component : REG
      port map (CLK=>clock,
                LD=>XLXN_42,
                RIN(5 downto 0)=>XLXN_72(5 downto 0),
                ROUT(5 downto 0)=>XLXN_60(5 downto 0),
                ZR=>XLXN_55);
   
end BEHAVIORAL;


