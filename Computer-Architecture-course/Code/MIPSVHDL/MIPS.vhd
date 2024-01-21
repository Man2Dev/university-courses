--------------------------------------------------------------------------------
-- Copyright (c) 1995-2013 Xilinx, Inc.  All rights reserved.
--------------------------------------------------------------------------------
--   ____  ____ 
--  /   /\/   / 
-- /___/  \  /    Vendor: Xilinx 
-- \   \   \/     Version : 14.7
--  \   \         Application : sch2hdl
--  /   /         Filename : MIPS.vhf
-- /___/   /\     Timestamp : 01/14/2021 23:06:59
-- \   \  /  \ 
--  \___\/\___\ 
--
--Command: sch2hdl -intstyle ise -family spartan3e -flat -suppress -vhdl "E:/Xilinx/Computer Architecture Lab/Project/MIPS/MIPS.vhf" -w "E:/Xilinx/Computer Architecture Lab/Project/MIPS/MIPS.sch"
--Design Name: MIPS
--Device: spartan3e
--Purpose:
--    This vhdl netlist is translated from an ECS schematic. It can be 
--    synthesized and simulated, but it should not be modified. 
--

library ieee;
use ieee.std_logic_1164.ALL;
use ieee.numeric_std.ALL;
library UNISIM;
use UNISIM.Vcomponents.ALL;

entity MIPS is
   port ( Clk    : in    std_logic; 
          Toggle : in    std_logic);
end MIPS;

architecture BEHAVIORAL of MIPS is
   attribute BOX_TYPE   : string ;
   signal Instruction : std_logic_vector (31 downto 0);
   signal XLXN_1      : std_logic_vector (31 downto 0);
   signal XLXN_14     : std_logic_vector (4 downto 0);
   signal XLXN_26     : std_logic;
   signal XLXN_27     : std_logic;
   signal XLXN_32     : std_logic_vector (31 downto 0);
   signal XLXN_34     : std_logic_vector (31 downto 0);
   signal XLXN_35     : std_logic_vector (31 downto 0);
   signal XLXN_36     : std_logic;
   signal XLXN_37     : std_logic;
   signal XLXN_41     : std_logic_vector (31 downto 0);
   signal XLXN_42     : std_logic_vector (31 downto 0);
   signal XLXN_44     : std_logic_vector (31 downto 0);
   signal XLXN_45     : std_logic_vector (3 downto 0);
   signal XLXN_46     : std_logic;
   signal XLXN_48     : std_logic;
   signal XLXN_51     : std_logic;
   signal XLXN_53     : std_logic;
   signal XLXN_54     : std_logic;
   signal XLXN_55     : std_logic;
   signal XLXN_58     : std_logic;
   signal XLXN_60     : std_logic;
   signal XLXN_61     : std_logic_vector (1 downto 0);
   signal XLXN_67     : std_logic;
   signal XLXN_68     : std_logic_vector (31 downto 0);
   signal XLXN_84     : std_logic;
   signal XLXN_93     : std_logic_vector (31 downto 0);
   signal XLXN_94     : std_logic_vector (31 downto 0);
   signal XLXN_95     : std_logic_vector (31 downto 0);
   component CtrlFSM
      port ( I_FSM_T     : in    std_logic; 
             I_FSM_CLK   : in    std_logic; 
             I_FSM_INSTR : in    std_logic_vector (31 downto 0); 
             O_FSM_IM    : out   std_logic; 
             O_FSM_CTL   : out   std_logic; 
             O_FSM_ALU   : out   std_logic; 
             O_FSM_RAM   : out   std_logic; 
             O_FSM_PCREG : out   std_logic);
   end component;
   
   component PC
      port ( I_PC_TOGGLE : in    std_logic; 
             I_PC        : in    std_logic_vector (31 downto 0); 
             O_PC        : out   std_logic_vector (31 downto 0));
   end component;
   
   component IM
      port ( I_ROM_T       : in    std_logic; 
             I_ROM_ADDRESS : in    std_logic_vector (31 downto 0); 
             O_ROM_DATA    : out   std_logic_vector (31 downto 0));
   end component;
   
   component ADD1
      port ( I_ADD1 : in    std_logic_vector (31 downto 0); 
             O_ADD1 : out   std_logic_vector (31 downto 0));
   end component;
   
   component ADD2
      port ( I_ADD2_1 : in    std_logic_vector (31 downto 0); 
             I_ADD2_2 : in    std_logic_vector (31 downto 0); 
             O_ADD2   : out   std_logic_vector (31 downto 0));
   end component;
   
   component MUX32
      port ( I_MUX_SELECT : in    std_logic; 
             I_MUX_0      : in    std_logic_vector (31 downto 0); 
             I_MUX_1      : in    std_logic_vector (31 downto 0); 
             O_MUX        : out   std_logic_vector (31 downto 0));
   end component;
   
   component CTL
      port ( I_CTL_T        : in    std_logic; 
             I_CTL_INS      : in    std_logic_vector (5 downto 0); 
             O_CTL_RegDst   : out   std_logic; 
             O_CTL_Branch   : out   std_logic; 
             O_CTL_MemRead  : out   std_logic; 
             O_CTL_MemtoReg : out   std_logic; 
             O_CTL_MemWrite : out   std_logic; 
             O_CTL_ALUSrc   : out   std_logic; 
             O_CTL_RegWrite : out   std_logic; 
             O_CTL_ALUOp    : out   std_logic_vector (1 downto 0));
   end component;
   
   component MUX5
      port ( I_MUX_SELECT : in    std_logic; 
             I_MUX_0      : in    std_logic_vector (4 downto 0); 
             I_MUX_1      : in    std_logic_vector (4 downto 0); 
             O_MUX        : out   std_logic_vector (4 downto 0));
   end component;
   
   component REG
      port ( I_REG_T       : in    std_logic; 
             I_REG_Write   : in    std_logic; 
             I_REG_SEL_RS  : in    std_logic_vector (4 downto 0); 
             I_REG_SEL_RT  : in    std_logic_vector (4 downto 0); 
             I_REG_SEL_RD  : in    std_logic_vector (4 downto 0); 
             I_REG_DATA_RD : in    std_logic_vector (31 downto 0); 
             O_REG_DATA_A  : out   std_logic_vector (31 downto 0); 
             O_REG_DATA_B  : out   std_logic_vector (31 downto 0));
   end component;
   
   component ALU
      port ( I_ALU_T    : in    std_logic; 
             I_ALU_CTR  : in    std_logic_vector (3 downto 0); 
             I_ALU_1    : in    std_logic_vector (31 downto 0); 
             I_ALU_2    : in    std_logic_vector (31 downto 0); 
             O_ALU_ZERO : out   std_logic; 
             O_ALU      : out   std_logic_vector (31 downto 0));
   end component;
   
   component ALUCTR
      port ( I_ALU_OP    : in    std_logic_vector (1 downto 0); 
             I_ALU_FUNCT : in    std_logic_vector (5 downto 0); 
             O_ALU_CTR   : out   std_logic_vector (3 downto 0));
   end component;
   
   component EXT
      port ( I_EXT : in    std_logic_vector (15 downto 0); 
             O_EXT : out   std_logic_vector (31 downto 0));
   end component;
   
   component RAM
      port ( I_RAM_T    : in    std_logic; 
             I_RAM_RE   : in    std_logic; 
             I_RAM_WR   : in    std_logic; 
             I_RAM_ADDR : in    std_logic_vector (31 downto 0); 
             I_RAM_DATA : in    std_logic_vector (31 downto 0); 
             O_RAM_DATA : out   std_logic_vector (31 downto 0));
   end component;
   
   component AND2
      port ( I0 : in    std_logic; 
             I1 : in    std_logic; 
             O  : out   std_logic);
   end component;
   attribute BOX_TYPE of AND2 : component is "BLACK_BOX";
   
begin
   XLXI_1 : CtrlFSM
      port map (I_FSM_CLK=>Clk,
                I_FSM_INSTR(31 downto 0)=>Instruction(31 downto 0),
                I_FSM_T=>Toggle,
                O_FSM_ALU=>XLXN_46,
                O_FSM_CTL=>XLXN_27,
                O_FSM_IM=>XLXN_26,
                O_FSM_PCREG=>XLXN_84,
                O_FSM_RAM=>XLXN_67);
   
   XLXI_2 : PC
      port map (I_PC(31 downto 0)=>XLXN_35(31 downto 0),
                I_PC_TOGGLE=>XLXN_84,
                O_PC(31 downto 0)=>XLXN_1(31 downto 0));
   
   XLXI_3 : IM
      port map (I_ROM_ADDRESS(31 downto 0)=>XLXN_1(31 downto 0),
                I_ROM_T=>XLXN_26,
                O_ROM_DATA(31 downto 0)=>Instruction(31 downto 0));
   
   XLXI_4 : ADD1
      port map (I_ADD1(31 downto 0)=>XLXN_1(31 downto 0),
                O_ADD1(31 downto 0)=>XLXN_34(31 downto 0));
   
   XLXI_5 : ADD2
      port map (I_ADD2_1(31 downto 0)=>XLXN_34(31 downto 0),
                I_ADD2_2(31 downto 0)=>XLXN_68(31 downto 0),
                O_ADD2(31 downto 0)=>XLXN_32(31 downto 0));
   
   XLXI_6 : MUX32
      port map (I_MUX_SELECT=>XLXN_36,
                I_MUX_0(31 downto 0)=>XLXN_34(31 downto 0),
                I_MUX_1(31 downto 0)=>XLXN_32(31 downto 0),
                O_MUX(31 downto 0)=>XLXN_35(31 downto 0));
   
   XLXI_7 : CTL
      port map (I_CTL_INS(5 downto 0)=>Instruction(31 downto 26),
                I_CTL_T=>XLXN_27,
                O_CTL_ALUOp(1 downto 0)=>XLXN_61(1 downto 0),
                O_CTL_ALUSrc=>XLXN_55,
                O_CTL_Branch=>XLXN_37,
                O_CTL_MemRead=>XLXN_53,
                O_CTL_MemtoReg=>XLXN_54,
                O_CTL_MemWrite=>XLXN_58,
                O_CTL_RegDst=>XLXN_51,
                O_CTL_RegWrite=>XLXN_60);
   
   XLXI_8 : MUX5
      port map (I_MUX_SELECT=>XLXN_51,
                I_MUX_0(4 downto 0)=>Instruction(20 downto 16),
                I_MUX_1(4 downto 0)=>Instruction(15 downto 11),
                O_MUX(4 downto 0)=>XLXN_14(4 downto 0));
   
   XLXI_9 : REG
      port map (I_REG_DATA_RD(31 downto 0)=>XLXN_93(31 downto 0),
                I_REG_SEL_RD(4 downto 0)=>XLXN_14(4 downto 0),
                I_REG_SEL_RS(4 downto 0)=>Instruction(25 downto 21),
                I_REG_SEL_RT(4 downto 0)=>Instruction(20 downto 16),
                I_REG_T=>XLXN_84,
                I_REG_Write=>XLXN_60,
                O_REG_DATA_A(31 downto 0)=>XLXN_44(31 downto 0),
                O_REG_DATA_B(31 downto 0)=>XLXN_41(31 downto 0));
   
   XLXI_13 : MUX32
      port map (I_MUX_SELECT=>XLXN_55,
                I_MUX_0(31 downto 0)=>XLXN_41(31 downto 0),
                I_MUX_1(31 downto 0)=>XLXN_68(31 downto 0),
                O_MUX(31 downto 0)=>XLXN_42(31 downto 0));
   
   XLXI_14 : ALU
      port map (I_ALU_CTR(3 downto 0)=>XLXN_45(3 downto 0),
                I_ALU_T=>XLXN_46,
                I_ALU_1(31 downto 0)=>XLXN_44(31 downto 0),
                I_ALU_2(31 downto 0)=>XLXN_42(31 downto 0),
                O_ALU(31 downto 0)=>XLXN_95(31 downto 0),
                O_ALU_ZERO=>XLXN_48);
   
   XLXI_15 : ALUCTR
      port map (I_ALU_FUNCT(5 downto 0)=>Instruction(5 downto 0),
                I_ALU_OP(1 downto 0)=>XLXN_61(1 downto 0),
                O_ALU_CTR(3 downto 0)=>XLXN_45(3 downto 0));
   
   XLXI_16 : EXT
      port map (I_EXT(15 downto 0)=>Instruction(15 downto 0),
                O_EXT(31 downto 0)=>XLXN_68(31 downto 0));
   
   XLXI_17 : RAM
      port map (I_RAM_ADDR(31 downto 0)=>XLXN_95(31 downto 0),
                I_RAM_DATA(31 downto 0)=>XLXN_41(31 downto 0),
                I_RAM_RE=>XLXN_53,
                I_RAM_T=>XLXN_67,
                I_RAM_WR=>XLXN_58,
                O_RAM_DATA(31 downto 0)=>XLXN_94(31 downto 0));
   
   XLXI_18 : MUX32
      port map (I_MUX_SELECT=>XLXN_54,
                I_MUX_0(31 downto 0)=>XLXN_95(31 downto 0),
                I_MUX_1(31 downto 0)=>XLXN_94(31 downto 0),
                O_MUX(31 downto 0)=>XLXN_93(31 downto 0));
   
   XLXI_19 : AND2
      port map (I0=>XLXN_48,
                I1=>XLXN_37,
                O=>XLXN_36);
   
end BEHAVIORAL;


