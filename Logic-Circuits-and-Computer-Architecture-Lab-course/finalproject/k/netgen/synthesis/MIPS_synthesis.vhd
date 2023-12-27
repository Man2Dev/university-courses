--------------------------------------------------------------------------------
-- Copyright (c) 1995-2013 Xilinx, Inc.  All rights reserved.
--------------------------------------------------------------------------------
--   ____  ____
--  /   /\/   /
-- /___/  \  /    Vendor: Xilinx
-- \   \   \/     Version: P.20131013
--  \   \         Application: netgen
--  /   /         Filename: MIPS_synthesis.vhd
-- /___/   /\     Timestamp: Mon Jan 18 10:14:05 2021
-- \   \  /  \ 
--  \___\/\___\
--             
-- Command	: -intstyle ise -ar Structure -tm MIPS -w -dir netgen/synthesis -ofmt vhdl -sim MIPS.ngc MIPS_synthesis.vhd 
-- Device	: xc3s50-5-pq208
-- Input file	: MIPS.ngc
-- Output file	: C:\Users\home\Desktop\Project\k\netgen\synthesis\MIPS_synthesis.vhd
-- # of Entities	: 1
-- Design Name	: MIPS
-- Xilinx	: C:\Xilinx\14.7\ISE_DS\ISE\
--             
-- Purpose:    
--     This VHDL netlist is a verification model and uses simulation 
--     primitives which may not represent the true implementation of the 
--     device, however the netlist is functionally correct and should not 
--     be modified. This file cannot be synthesized and should only be used 
--     with supported simulation tools.
--             
-- Reference:  
--     Command Line Tools User Guide, Chapter 23
--     Synthesis and Simulation Design Guide, Chapter 6
--             
--------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
library UNISIM;
use UNISIM.VCOMPONENTS.ALL;
use UNISIM.VPKG.ALL;

entity MIPS is
  port (
    clk : in STD_LOGIC := 'X'; 
    reset : in STD_LOGIC := 'X'; 
    memwrite : out STD_LOGIC; 
    address : out STD_LOGIC_VECTOR ( 31 downto 0 ); 
    writedata : out STD_LOGIC_VECTOR ( 31 downto 0 ); 
    readdata : in STD_LOGIC_VECTOR ( 31 downto 0 ) 
  );
end MIPS;

architecture Structure of MIPS is
  signal ALU_suma_4_Madd_sal_cy_3_rt_2 : STD_LOGIC; 
  signal ALU_suma_4_Madd_sal_cy_4_rt_4 : STD_LOGIC; 
  signal ALU_suma_4_Madd_sal_cy_5_rt_6 : STD_LOGIC; 
  signal ALU_suma_4_Madd_sal_cy_6_rt_8 : STD_LOGIC; 
  signal ALU_suma_4_Madd_sal_cy_7_rt_10 : STD_LOGIC; 
  signal ALU_suma_4_Madd_sal_xor_8_rt_12 : STD_LOGIC; 
  signal ALU_suma_desplaz_Madd_sal_cy_5_rt_17 : STD_LOGIC; 
  signal ALU_suma_desplaz_Madd_sal_cy_6_rt_19 : STD_LOGIC; 
  signal ALU_suma_desplaz_Madd_sal_xor_8_rt_28 : STD_LOGIC; 
  signal Inst_ALU_bb_0_Q : STD_LOGIC; 
  signal Inst_ALU_bb_15_Q : STD_LOGIC; 
  signal Inst_ALU_bb_16_Q : STD_LOGIC; 
  signal Inst_ALU_bb_17_Q : STD_LOGIC; 
  signal Inst_ALU_bb_18_Q : STD_LOGIC; 
  signal Inst_ALU_bb_19_Q : STD_LOGIC; 
  signal Inst_ALU_bb_20_Q : STD_LOGIC; 
  signal Inst_ALU_bb_21_Q : STD_LOGIC; 
  signal Inst_ALU_bb_22_Q : STD_LOGIC; 
  signal Inst_ALU_bb_23_Q : STD_LOGIC; 
  signal Inst_ALU_bb_24_Q : STD_LOGIC; 
  signal Inst_ALU_bb_25_Q : STD_LOGIC; 
  signal Inst_ALU_bb_26_Q : STD_LOGIC; 
  signal Inst_ALU_bb_27_Q : STD_LOGIC; 
  signal Inst_ALU_bb_28_Q : STD_LOGIC; 
  signal Inst_ALU_bb_29_Q : STD_LOGIC; 
  signal Inst_ALU_bb_30_Q : STD_LOGIC; 
  signal Inst_ALU_bb_31_Q : STD_LOGIC; 
  signal Inst_ALU_mux_rslt_alu_Mmux_sal_3 : STD_LOGIC; 
  signal Inst_Instruction_Memory_Mrom_mux0000101111_158 : STD_LOGIC; 
  signal Inst_Instruction_Memory_Mrom_mux000016121_159 : STD_LOGIC; 
  signal Inst_Instruction_Memory_Mrom_mux00012121_160 : STD_LOGIC; 
  signal Inst_Instruction_Memory_Mrom_mux00015121_161 : STD_LOGIC; 
  signal Inst_Instruction_Memory_Mrom_mux000151211 : STD_LOGIC; 
  signal Inst_Instruction_Memory_Mrom_mux000213121_163 : STD_LOGIC; 
  signal Inst_PC_dout_3_1_166 : STD_LOGIC; 
  signal Inst_Register_File_N103 : STD_LOGIC; 
  signal Inst_Register_File_N107 : STD_LOGIC; 
  signal Inst_Register_File_N11 : STD_LOGIC; 
  signal Inst_Register_File_N111 : STD_LOGIC; 
  signal Inst_Register_File_N115 : STD_LOGIC; 
  signal Inst_Register_File_N119 : STD_LOGIC; 
  signal Inst_Register_File_N123 : STD_LOGIC; 
  signal Inst_Register_File_N127 : STD_LOGIC; 
  signal Inst_Register_File_N131 : STD_LOGIC; 
  signal Inst_Register_File_N135 : STD_LOGIC; 
  signal Inst_Register_File_N137 : STD_LOGIC; 
  signal Inst_Register_File_N141 : STD_LOGIC; 
  signal Inst_Register_File_N145 : STD_LOGIC; 
  signal Inst_Register_File_N149 : STD_LOGIC; 
  signal Inst_Register_File_N15 : STD_LOGIC; 
  signal Inst_Register_File_N153 : STD_LOGIC; 
  signal Inst_Register_File_N157 : STD_LOGIC; 
  signal Inst_Register_File_N161 : STD_LOGIC; 
  signal Inst_Register_File_N165 : STD_LOGIC; 
  signal Inst_Register_File_N169 : STD_LOGIC; 
  signal Inst_Register_File_N173 : STD_LOGIC; 
  signal Inst_Register_File_N177 : STD_LOGIC; 
  signal Inst_Register_File_N181 : STD_LOGIC; 
  signal Inst_Register_File_N185 : STD_LOGIC; 
  signal Inst_Register_File_N189 : STD_LOGIC; 
  signal Inst_Register_File_N19 : STD_LOGIC; 
  signal Inst_Register_File_N193 : STD_LOGIC; 
  signal Inst_Register_File_N195 : STD_LOGIC; 
  signal Inst_Register_File_N197 : STD_LOGIC; 
  signal Inst_Register_File_N199 : STD_LOGIC; 
  signal Inst_Register_File_N201 : STD_LOGIC; 
  signal Inst_Register_File_N203 : STD_LOGIC; 
  signal Inst_Register_File_N205 : STD_LOGIC; 
  signal Inst_Register_File_N207 : STD_LOGIC; 
  signal Inst_Register_File_N209 : STD_LOGIC; 
  signal Inst_Register_File_N211 : STD_LOGIC; 
  signal Inst_Register_File_N213 : STD_LOGIC; 
  signal Inst_Register_File_N215 : STD_LOGIC; 
  signal Inst_Register_File_N217 : STD_LOGIC; 
  signal Inst_Register_File_N219 : STD_LOGIC; 
  signal Inst_Register_File_N221 : STD_LOGIC; 
  signal Inst_Register_File_N223 : STD_LOGIC; 
  signal Inst_Register_File_N225 : STD_LOGIC; 
  signal Inst_Register_File_N227 : STD_LOGIC; 
  signal Inst_Register_File_N229 : STD_LOGIC; 
  signal Inst_Register_File_N23 : STD_LOGIC; 
  signal Inst_Register_File_N231 : STD_LOGIC; 
  signal Inst_Register_File_N233 : STD_LOGIC; 
  signal Inst_Register_File_N235 : STD_LOGIC; 
  signal Inst_Register_File_N237 : STD_LOGIC; 
  signal Inst_Register_File_N239 : STD_LOGIC; 
  signal Inst_Register_File_N241 : STD_LOGIC; 
  signal Inst_Register_File_N243 : STD_LOGIC; 
  signal Inst_Register_File_N245 : STD_LOGIC; 
  signal Inst_Register_File_N247 : STD_LOGIC; 
  signal Inst_Register_File_N249 : STD_LOGIC; 
  signal Inst_Register_File_N251 : STD_LOGIC; 
  signal Inst_Register_File_N253 : STD_LOGIC; 
  signal Inst_Register_File_N255 : STD_LOGIC; 
  signal Inst_Register_File_N257 : STD_LOGIC; 
  signal Inst_Register_File_N261 : STD_LOGIC; 
  signal Inst_Register_File_N27 : STD_LOGIC; 
  signal Inst_Register_File_N31 : STD_LOGIC; 
  signal Inst_Register_File_N35 : STD_LOGIC; 
  signal Inst_Register_File_N39 : STD_LOGIC; 
  signal Inst_Register_File_N43 : STD_LOGIC; 
  signal Inst_Register_File_N47 : STD_LOGIC; 
  signal Inst_Register_File_N51 : STD_LOGIC; 
  signal Inst_Register_File_N55 : STD_LOGIC; 
  signal Inst_Register_File_N59 : STD_LOGIC; 
  signal Inst_Register_File_N63 : STD_LOGIC; 
  signal Inst_Register_File_N67 : STD_LOGIC; 
  signal Inst_Register_File_N7 : STD_LOGIC; 
  signal Inst_Register_File_N71 : STD_LOGIC; 
  signal Inst_Register_File_N75 : STD_LOGIC; 
  signal Inst_Register_File_N79 : STD_LOGIC; 
  signal Inst_Register_File_N83 : STD_LOGIC; 
  signal Inst_Register_File_N87 : STD_LOGIC; 
  signal Inst_Register_File_N91 : STD_LOGIC; 
  signal Inst_Register_File_N95 : STD_LOGIC; 
  signal Inst_Register_File_N99 : STD_LOGIC; 
  signal Inst_Register_File_write_ctrl : STD_LOGIC; 
  signal Inst_Register_File_write_ctrl1 : STD_LOGIC; 
  signal N1 : STD_LOGIC; 
  signal N103 : STD_LOGIC; 
  signal N11 : STD_LOGIC; 
  signal N128 : STD_LOGIC; 
  signal N130 : STD_LOGIC; 
  signal N131 : STD_LOGIC; 
  signal N133 : STD_LOGIC; 
  signal N14 : STD_LOGIC; 
  signal N141 : STD_LOGIC; 
  signal N143 : STD_LOGIC; 
  signal N145 : STD_LOGIC; 
  signal N147 : STD_LOGIC; 
  signal N149 : STD_LOGIC; 
  signal N173 : STD_LOGIC; 
  signal N174 : STD_LOGIC; 
  signal N176 : STD_LOGIC; 
  signal N177 : STD_LOGIC; 
  signal N179 : STD_LOGIC; 
  signal N180 : STD_LOGIC; 
  signal N182 : STD_LOGIC; 
  signal N183 : STD_LOGIC; 
  signal N187 : STD_LOGIC; 
  signal N189 : STD_LOGIC; 
  signal N190 : STD_LOGIC; 
  signal N191 : STD_LOGIC; 
  signal N192 : STD_LOGIC; 
  signal N193 : STD_LOGIC; 
  signal N194 : STD_LOGIC; 
  signal N195 : STD_LOGIC; 
  signal N196 : STD_LOGIC; 
  signal N197 : STD_LOGIC; 
  signal N6 : STD_LOGIC; 
  signal alusrc : STD_LOGIC; 
  signal clk_BUFGP_322 : STD_LOGIC; 
  signal extsig_out_11_Q : STD_LOGIC; 
  signal extsig_out_1_Q : STD_LOGIC; 
  signal extsig_out_2_Q : STD_LOGIC; 
  signal extsig_out_3_Q : STD_LOGIC; 
  signal instr_16_Q : STD_LOGIC; 
  signal instr_17_Q : STD_LOGIC; 
  signal instr_20_Q : STD_LOGIC; 
  signal instr_25_Q : STD_LOGIC; 
  signal instr_27_Q : STD_LOGIC; 
  signal pc_out_next_2_Q : STD_LOGIC; 
  signal pc_out_next_3_Q : STD_LOGIC; 
  signal pc_out_next_4_Q : STD_LOGIC; 
  signal pc_out_next_7_Q : STD_LOGIC; 
  signal reset_IBUF_352 : STD_LOGIC; 
  signal writedata_0_OBUF_417 : STD_LOGIC; 
  signal writedata_10_OBUF_418 : STD_LOGIC; 
  signal writedata_11_OBUF_419 : STD_LOGIC; 
  signal writedata_12_OBUF_420 : STD_LOGIC; 
  signal writedata_13_OBUF_421 : STD_LOGIC; 
  signal writedata_14_OBUF_422 : STD_LOGIC; 
  signal writedata_15_OBUF_423 : STD_LOGIC; 
  signal writedata_16_OBUF_424 : STD_LOGIC; 
  signal writedata_17_OBUF_425 : STD_LOGIC; 
  signal writedata_18_OBUF_426 : STD_LOGIC; 
  signal writedata_19_OBUF_427 : STD_LOGIC; 
  signal writedata_1_OBUF_428 : STD_LOGIC; 
  signal writedata_20_OBUF_429 : STD_LOGIC; 
  signal writedata_21_OBUF_430 : STD_LOGIC; 
  signal writedata_22_OBUF_431 : STD_LOGIC; 
  signal writedata_23_OBUF_432 : STD_LOGIC; 
  signal writedata_24_OBUF_433 : STD_LOGIC; 
  signal writedata_25_OBUF_434 : STD_LOGIC; 
  signal writedata_26_OBUF_435 : STD_LOGIC; 
  signal writedata_27_OBUF_436 : STD_LOGIC; 
  signal writedata_28_OBUF_437 : STD_LOGIC; 
  signal writedata_29_OBUF_438 : STD_LOGIC; 
  signal writedata_2_OBUF_439 : STD_LOGIC; 
  signal writedata_30_OBUF_440 : STD_LOGIC; 
  signal writedata_31_OBUF_441 : STD_LOGIC; 
  signal writedata_3_OBUF_442 : STD_LOGIC; 
  signal writedata_4_OBUF_443 : STD_LOGIC; 
  signal writedata_5_OBUF_444 : STD_LOGIC; 
  signal writedata_6_OBUF_445 : STD_LOGIC; 
  signal writedata_7_OBUF_446 : STD_LOGIC; 
  signal writedata_8_OBUF_447 : STD_LOGIC; 
  signal writedata_9_OBUF_448 : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren64_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren62_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren61_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren59_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren58_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren60_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren56_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren55_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren57_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren53_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren52_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren54_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren50_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren49_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren51_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren47_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren46_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren48_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren44_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren43_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren45_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren41_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren40_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren42_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren38_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren37_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren39_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren35_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren34_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren36_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren32_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren31_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren33_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren28_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren30_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren26_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren22_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren24_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren20_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren16_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren18_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren14_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren10_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren12_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren8_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren4_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren6_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren2_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram_ren1_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram64_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram62_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram58_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram60_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram56_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram52_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram54_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram50_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram46_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram48_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram44_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram40_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram42_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram38_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram34_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram36_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram32_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram28_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram30_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram26_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram22_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram24_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram20_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram16_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram18_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram14_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram10_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram12_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram8_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram4_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram6_SPO_UNCONNECTED : STD_LOGIC; 
  signal NLW_Inst_Register_File_Mram_ram2_SPO_UNCONNECTED : STD_LOGIC; 
  signal ALU_suma_4_Madd_sal_cy : STD_LOGIC_VECTOR ( 7 downto 2 ); 
  signal ALU_suma_4_Madd_sal_lut : STD_LOGIC_VECTOR ( 2 downto 2 ); 
  signal ALU_suma_desplaz_Madd_sal_cy : STD_LOGIC_VECTOR ( 7 downto 2 ); 
  signal ALU_suma_desplaz_Madd_sal_lut : STD_LOGIC_VECTOR ( 8 downto 2 ); 
  signal Inst_ALU_Inst_alu_sum_res_Madd_result_cy : STD_LOGIC_VECTOR ( 30 downto 0 ); 
  signal Inst_ALU_Inst_alu_sum_res_Madd_result_lut : STD_LOGIC_VECTOR ( 31 downto 0 ); 
  signal Inst_ALU_rslt_sum_res : STD_LOGIC_VECTOR ( 31 downto 1 ); 
  signal Inst_ALU_zero_cmp_eq0000_wg_cy : STD_LOGIC_VECTOR ( 7 downto 0 ); 
  signal Inst_ALU_zero_cmp_eq0000_wg_lut : STD_LOGIC_VECTOR ( 7 downto 0 ); 
  signal Inst_PC_dout : STD_LOGIC_VECTOR ( 8 downto 2 ); 
  signal aluctrl : STD_LOGIC_VECTOR ( 2 downto 2 ); 
  signal pc_branch : STD_LOGIC_VECTOR ( 8 downto 2 ); 
  signal pc_next_j : STD_LOGIC_VECTOR ( 8 downto 2 ); 
  signal sal_rt_o_rd : STD_LOGIC_VECTOR ( 0 downto 0 ); 
  signal srca : STD_LOGIC_VECTOR ( 30 downto 0 ); 
begin
  XST_GND : GND
    port map (
      G => extsig_out_3_Q
    );
  XST_VCC : VCC
    port map (
      P => N1
    );
  ALU_suma_4_Madd_sal_cy_2_Q : MUXCY
    port map (
      CI => extsig_out_3_Q,
      DI => N1,
      S => ALU_suma_4_Madd_sal_lut(2),
      O => ALU_suma_4_Madd_sal_cy(2)
    );
  ALU_suma_4_Madd_sal_xor_2_Q : XORCY
    port map (
      CI => extsig_out_3_Q,
      LI => ALU_suma_4_Madd_sal_lut(2),
      O => pc_out_next_2_Q
    );
  ALU_suma_4_Madd_sal_cy_3_Q : MUXCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(2),
      DI => extsig_out_3_Q,
      S => ALU_suma_4_Madd_sal_cy_3_rt_2,
      O => ALU_suma_4_Madd_sal_cy(3)
    );
  ALU_suma_4_Madd_sal_xor_3_Q : XORCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(2),
      LI => ALU_suma_4_Madd_sal_cy_3_rt_2,
      O => pc_out_next_3_Q
    );
  ALU_suma_4_Madd_sal_cy_4_Q : MUXCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(3),
      DI => extsig_out_3_Q,
      S => ALU_suma_4_Madd_sal_cy_4_rt_4,
      O => ALU_suma_4_Madd_sal_cy(4)
    );
  ALU_suma_4_Madd_sal_xor_4_Q : XORCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(3),
      LI => ALU_suma_4_Madd_sal_cy_4_rt_4,
      O => pc_out_next_4_Q
    );
  ALU_suma_4_Madd_sal_cy_5_Q : MUXCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(4),
      DI => extsig_out_3_Q,
      S => ALU_suma_4_Madd_sal_cy_5_rt_6,
      O => ALU_suma_4_Madd_sal_cy(5)
    );
  ALU_suma_4_Madd_sal_xor_5_Q : XORCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(4),
      LI => ALU_suma_4_Madd_sal_cy_5_rt_6,
      O => ALU_suma_desplaz_Madd_sal_lut(5)
    );
  ALU_suma_4_Madd_sal_cy_6_Q : MUXCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(5),
      DI => extsig_out_3_Q,
      S => ALU_suma_4_Madd_sal_cy_6_rt_8,
      O => ALU_suma_4_Madd_sal_cy(6)
    );
  ALU_suma_4_Madd_sal_xor_6_Q : XORCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(5),
      LI => ALU_suma_4_Madd_sal_cy_6_rt_8,
      O => ALU_suma_desplaz_Madd_sal_lut(6)
    );
  ALU_suma_4_Madd_sal_cy_7_Q : MUXCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(6),
      DI => extsig_out_3_Q,
      S => ALU_suma_4_Madd_sal_cy_7_rt_10,
      O => ALU_suma_4_Madd_sal_cy(7)
    );
  ALU_suma_4_Madd_sal_xor_7_Q : XORCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(6),
      LI => ALU_suma_4_Madd_sal_cy_7_rt_10,
      O => pc_out_next_7_Q
    );
  ALU_suma_4_Madd_sal_xor_8_Q : XORCY
    port map (
      CI => ALU_suma_4_Madd_sal_cy(7),
      LI => ALU_suma_4_Madd_sal_xor_8_rt_12,
      O => ALU_suma_desplaz_Madd_sal_lut(8)
    );
  ALU_suma_desplaz_Madd_sal_cy_2_Q : MUXCY
    port map (
      CI => extsig_out_3_Q,
      DI => pc_out_next_2_Q,
      S => ALU_suma_desplaz_Madd_sal_lut(2),
      O => ALU_suma_desplaz_Madd_sal_cy(2)
    );
  ALU_suma_desplaz_Madd_sal_xor_2_Q : XORCY
    port map (
      CI => extsig_out_3_Q,
      LI => ALU_suma_desplaz_Madd_sal_lut(2),
      O => pc_branch(2)
    );
  ALU_suma_desplaz_Madd_sal_cy_3_Q : MUXCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(2),
      DI => pc_out_next_3_Q,
      S => ALU_suma_desplaz_Madd_sal_lut(3),
      O => ALU_suma_desplaz_Madd_sal_cy(3)
    );
  ALU_suma_desplaz_Madd_sal_xor_3_Q : XORCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(2),
      LI => ALU_suma_desplaz_Madd_sal_lut(3),
      O => pc_branch(3)
    );
  ALU_suma_desplaz_Madd_sal_lut_4_Q : LUT2
    generic map(
      INIT => X"6"
    )
    port map (
      I0 => extsig_out_2_Q,
      I1 => pc_out_next_4_Q,
      O => ALU_suma_desplaz_Madd_sal_lut(4)
    );
  ALU_suma_desplaz_Madd_sal_cy_4_Q : MUXCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(3),
      DI => pc_out_next_4_Q,
      S => ALU_suma_desplaz_Madd_sal_lut(4),
      O => ALU_suma_desplaz_Madd_sal_cy(4)
    );
  ALU_suma_desplaz_Madd_sal_xor_4_Q : XORCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(3),
      LI => ALU_suma_desplaz_Madd_sal_lut(4),
      O => pc_branch(4)
    );
  ALU_suma_desplaz_Madd_sal_cy_5_Q : MUXCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(4),
      DI => extsig_out_3_Q,
      S => ALU_suma_desplaz_Madd_sal_cy_5_rt_17,
      O => ALU_suma_desplaz_Madd_sal_cy(5)
    );
  ALU_suma_desplaz_Madd_sal_xor_5_Q : XORCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(4),
      LI => ALU_suma_desplaz_Madd_sal_cy_5_rt_17,
      O => pc_branch(5)
    );
  ALU_suma_desplaz_Madd_sal_cy_6_Q : MUXCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(5),
      DI => extsig_out_3_Q,
      S => ALU_suma_desplaz_Madd_sal_cy_6_rt_19,
      O => ALU_suma_desplaz_Madd_sal_cy(6)
    );
  ALU_suma_desplaz_Madd_sal_xor_6_Q : XORCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(5),
      LI => ALU_suma_desplaz_Madd_sal_cy_6_rt_19,
      O => pc_branch(6)
    );
  ALU_suma_desplaz_Madd_sal_lut_7_Q : LUT2
    generic map(
      INIT => X"6"
    )
    port map (
      I0 => extsig_out_11_Q,
      I1 => pc_out_next_7_Q,
      O => ALU_suma_desplaz_Madd_sal_lut(7)
    );
  ALU_suma_desplaz_Madd_sal_cy_7_Q : MUXCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(6),
      DI => pc_out_next_7_Q,
      S => ALU_suma_desplaz_Madd_sal_lut(7),
      O => ALU_suma_desplaz_Madd_sal_cy(7)
    );
  ALU_suma_desplaz_Madd_sal_xor_7_Q : XORCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(6),
      LI => ALU_suma_desplaz_Madd_sal_lut(7),
      O => pc_branch(7)
    );
  ALU_suma_desplaz_Madd_sal_xor_8_Q : XORCY
    port map (
      CI => ALU_suma_desplaz_Madd_sal_cy(7),
      LI => ALU_suma_desplaz_Madd_sal_xor_8_rt_28,
      O => pc_branch(8)
    );
  Inst_PC_dout_8 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(8),
      Q => Inst_PC_dout(8)
    );
  Inst_PC_dout_7 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(7),
      Q => Inst_PC_dout(7)
    );
  Inst_PC_dout_6 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(6),
      Q => Inst_PC_dout(6)
    );
  Inst_PC_dout_5 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(5),
      Q => Inst_PC_dout(5)
    );
  Inst_PC_dout_4 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(4),
      Q => Inst_PC_dout(4)
    );
  Inst_PC_dout_3 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(3),
      Q => Inst_PC_dout(3)
    );
  Inst_PC_dout_2 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(2),
      Q => Inst_PC_dout(2)
    );
  Inst_Register_File_Mram_ram_ren64 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(31),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren64_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N261
    );
  Inst_Register_File_Mram_ram_ren62 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(30),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren62_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N257
    );
  Inst_Register_File_Mram_ram_ren61 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(30),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren61_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N255
    );
  Inst_Register_File_Mram_ram_ren59 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(29),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren59_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N251
    );
  Inst_Register_File_Mram_ram_ren58 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(28),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren58_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N249
    );
  Inst_Register_File_Mram_ram_ren60 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(29),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren60_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N253
    );
  Inst_Register_File_Mram_ram_ren56 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(27),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren56_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N245
    );
  Inst_Register_File_Mram_ram_ren55 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(27),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren55_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N243
    );
  Inst_Register_File_Mram_ram_ren57 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(28),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren57_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N247
    );
  Inst_Register_File_Mram_ram_ren53 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(26),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren53_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N239
    );
  Inst_Register_File_Mram_ram_ren52 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(25),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren52_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N237
    );
  Inst_Register_File_Mram_ram_ren54 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(26),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren54_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N241
    );
  Inst_Register_File_Mram_ram_ren50 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(24),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren50_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N233
    );
  Inst_Register_File_Mram_ram_ren49 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(24),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren49_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N231
    );
  Inst_Register_File_Mram_ram_ren51 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(25),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren51_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N235
    );
  Inst_Register_File_Mram_ram_ren47 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(23),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren47_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N227
    );
  Inst_Register_File_Mram_ram_ren46 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(22),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren46_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N225
    );
  Inst_Register_File_Mram_ram_ren48 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(23),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren48_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N229
    );
  Inst_Register_File_Mram_ram_ren44 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(21),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren44_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N221
    );
  Inst_Register_File_Mram_ram_ren43 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(21),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren43_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N219
    );
  Inst_Register_File_Mram_ram_ren45 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(22),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren45_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N223
    );
  Inst_Register_File_Mram_ram_ren41 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(20),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren41_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N215
    );
  Inst_Register_File_Mram_ram_ren40 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(19),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren40_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N213
    );
  Inst_Register_File_Mram_ram_ren42 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(20),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren42_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N217
    );
  Inst_Register_File_Mram_ram_ren38 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(18),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren38_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N209
    );
  Inst_Register_File_Mram_ram_ren37 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(18),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren37_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N207
    );
  Inst_Register_File_Mram_ram_ren39 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(19),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren39_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N211
    );
  Inst_Register_File_Mram_ram_ren35 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(17),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren35_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N203
    );
  Inst_Register_File_Mram_ram_ren34 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(16),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren34_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N201
    );
  Inst_Register_File_Mram_ram_ren36 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(17),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren36_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N205
    );
  Inst_Register_File_Mram_ram_ren32 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(15),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren32_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N197
    );
  Inst_Register_File_Mram_ram_ren31 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(15),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren31_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N195
    );
  Inst_Register_File_Mram_ram_ren33 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(16),
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren33_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N199
    );
  Inst_Register_File_Mram_ram_ren28 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(13),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren28_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N189
    );
  Inst_Register_File_Mram_ram_ren30 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(14),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren30_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N193
    );
  Inst_Register_File_Mram_ram_ren26 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(12),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren26_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N185
    );
  Inst_Register_File_Mram_ram_ren22 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(10),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren22_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N177
    );
  Inst_Register_File_Mram_ram_ren24 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(11),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren24_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N181
    );
  Inst_Register_File_Mram_ram_ren20 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(9),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren20_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N173
    );
  Inst_Register_File_Mram_ram_ren16 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(7),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren16_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N165
    );
  Inst_Register_File_Mram_ram_ren18 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(8),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren18_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N169
    );
  Inst_Register_File_Mram_ram_ren14 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(6),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren14_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N161
    );
  Inst_Register_File_Mram_ram_ren10 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(4),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren10_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N153
    );
  Inst_Register_File_Mram_ram_ren12 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(5),
      DPRA0 => instr_16_Q,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000151211,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren12_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N157
    );
  Inst_Register_File_Mram_ram_ren8 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(3),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren8_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N149
    );
  Inst_Register_File_Mram_ram_ren4 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(1),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren4_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N141
    );
  Inst_Register_File_Mram_ram_ren6 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(2),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren6_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N145
    );
  Inst_Register_File_Mram_ram_ren2 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_mux_rslt_alu_Mmux_sal_3,
      DPRA0 => Inst_Instruction_Memory_Mrom_mux00012121_160,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux00015121_161,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram_ren2_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N137
    );
  Inst_Register_File_Mram_ram_ren1 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_mux_rslt_alu_Mmux_sal_3,
      DPRA0 => instr_16_Q,
      DPRA1 => instr_17_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl,
      SPO => NLW_Inst_Register_File_Mram_ram_ren1_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N135
    );
  Inst_Register_File_Mram_ram64 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(31),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram64_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N131
    );
  Inst_Register_File_Mram_ram62 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(30),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram62_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N127
    );
  Inst_Register_File_Mram_ram58 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(28),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram58_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N119
    );
  Inst_Register_File_Mram_ram60 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(29),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram60_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N123
    );
  Inst_Register_File_Mram_ram56 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(27),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram56_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N115
    );
  Inst_Register_File_Mram_ram52 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(25),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram52_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N107
    );
  Inst_Register_File_Mram_ram54 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(26),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram54_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N111
    );
  Inst_Register_File_Mram_ram50 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(24),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram50_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N103
    );
  Inst_Register_File_Mram_ram46 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(22),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram46_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N95
    );
  Inst_Register_File_Mram_ram48 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(23),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram48_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N99
    );
  Inst_Register_File_Mram_ram44 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(21),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram44_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N91
    );
  Inst_Register_File_Mram_ram40 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(19),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram40_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N83
    );
  Inst_Register_File_Mram_ram42 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(20),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram42_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N87
    );
  Inst_Register_File_Mram_ram38 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(18),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram38_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N79
    );
  Inst_Register_File_Mram_ram34 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(16),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram34_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N71
    );
  Inst_Register_File_Mram_ram36 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(17),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram36_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N75
    );
  Inst_Register_File_Mram_ram32 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(15),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram32_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N67
    );
  Inst_Register_File_Mram_ram28 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(13),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram28_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N59
    );
  Inst_Register_File_Mram_ram30 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(14),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram30_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N63
    );
  Inst_Register_File_Mram_ram26 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(12),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram26_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N55
    );
  Inst_Register_File_Mram_ram22 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(10),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram22_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N47
    );
  Inst_Register_File_Mram_ram24 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(11),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram24_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N51
    );
  Inst_Register_File_Mram_ram20 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(9),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram20_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N43
    );
  Inst_Register_File_Mram_ram16 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(7),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram16_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N35
    );
  Inst_Register_File_Mram_ram18 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(8),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram18_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N39
    );
  Inst_Register_File_Mram_ram14 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(6),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram14_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N31
    );
  Inst_Register_File_Mram_ram10 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(4),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram10_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N23
    );
  Inst_Register_File_Mram_ram12 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(5),
      DPRA0 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram12_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N27
    );
  Inst_Register_File_Mram_ram8 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(3),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram8_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N19
    );
  Inst_Register_File_Mram_ram4 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(1),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram4_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N11
    );
  Inst_Register_File_Mram_ram6 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_rslt_sum_res(2),
      DPRA0 => extsig_out_11_Q,
      DPRA1 => extsig_out_11_Q,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram6_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N15
    );
  Inst_Register_File_Mram_ram2 : RAM16X1D
    port map (
      A0 => sal_rt_o_rd(0),
      A1 => instr_17_Q,
      A2 => extsig_out_3_Q,
      A3 => extsig_out_3_Q,
      D => Inst_ALU_mux_rslt_alu_Mmux_sal_3,
      DPRA0 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA1 => Inst_Instruction_Memory_Mrom_mux000213121_163,
      DPRA2 => extsig_out_3_Q,
      DPRA3 => extsig_out_3_Q,
      WCLK => clk_BUFGP_322,
      WE => Inst_Register_File_write_ctrl1,
      SPO => NLW_Inst_Register_File_Mram_ram2_SPO_UNCONNECTED,
      DPO => Inst_Register_File_N7
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_31_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(30),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(31),
      O => Inst_ALU_rslt_sum_res(31)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_30_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(29),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(30),
      O => Inst_ALU_rslt_sum_res(30)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_30_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(29),
      DI => srca(30),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(30),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(30)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_29_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(28),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(29),
      O => Inst_ALU_rslt_sum_res(29)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_29_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(28),
      DI => srca(29),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(29),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(29)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_28_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(27),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(28),
      O => Inst_ALU_rslt_sum_res(28)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_28_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(27),
      DI => srca(28),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(28),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(28)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_27_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(26),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(27),
      O => Inst_ALU_rslt_sum_res(27)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_27_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(26),
      DI => srca(27),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(27),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(27)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_26_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(25),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(26),
      O => Inst_ALU_rslt_sum_res(26)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_26_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(25),
      DI => srca(26),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(26),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(26)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_25_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(24),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(25),
      O => Inst_ALU_rslt_sum_res(25)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_25_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(24),
      DI => srca(25),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(25),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(25)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_24_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(23),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(24),
      O => Inst_ALU_rslt_sum_res(24)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_24_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(23),
      DI => srca(24),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(24),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(24)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_23_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(22),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(23),
      O => Inst_ALU_rslt_sum_res(23)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_23_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(22),
      DI => srca(23),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(23),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(23)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_22_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(21),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(22),
      O => Inst_ALU_rslt_sum_res(22)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_22_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(21),
      DI => srca(22),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(22),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(22)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_21_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(20),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(21),
      O => Inst_ALU_rslt_sum_res(21)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_21_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(20),
      DI => srca(21),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(21),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(21)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_20_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(19),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(20),
      O => Inst_ALU_rslt_sum_res(20)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_20_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(19),
      DI => srca(20),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(20),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(20)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_19_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(18),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(19),
      O => Inst_ALU_rslt_sum_res(19)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_19_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(18),
      DI => srca(19),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(19),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(19)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_18_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(17),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(18),
      O => Inst_ALU_rslt_sum_res(18)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_18_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(17),
      DI => srca(18),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(18),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(18)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_17_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(16),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(17),
      O => Inst_ALU_rslt_sum_res(17)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_17_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(16),
      DI => srca(17),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(17),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(17)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_16_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(15),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(16),
      O => Inst_ALU_rslt_sum_res(16)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_16_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(15),
      DI => srca(16),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(16),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(16)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_15_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(14),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(15),
      O => Inst_ALU_rslt_sum_res(15)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_15_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(14),
      DI => srca(15),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(15),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(15)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_14_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(13),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(14),
      O => Inst_ALU_rslt_sum_res(14)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_14_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(13),
      DI => srca(14),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(14),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(14)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_13_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(12),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(13),
      O => Inst_ALU_rslt_sum_res(13)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_13_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(12),
      DI => srca(13),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(13),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(13)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_12_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(11),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(12),
      O => Inst_ALU_rslt_sum_res(12)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_12_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(11),
      DI => srca(12),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(12),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(12)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_11_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(10),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(11),
      O => Inst_ALU_rslt_sum_res(11)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_11_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(10),
      DI => srca(11),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(11),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(11)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_10_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(9),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(10),
      O => Inst_ALU_rslt_sum_res(10)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_10_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(9),
      DI => srca(10),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(10),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(10)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_9_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(8),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(9),
      O => Inst_ALU_rslt_sum_res(9)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_9_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(8),
      DI => srca(9),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(9),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(9)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_8_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(7),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(8),
      O => Inst_ALU_rslt_sum_res(8)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_8_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(7),
      DI => srca(8),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(8),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(8)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_7_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(6),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(7),
      O => Inst_ALU_rslt_sum_res(7)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_7_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(6),
      DI => srca(7),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(7),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(7)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_6_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(5),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(6),
      O => Inst_ALU_rslt_sum_res(6)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_6_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(5),
      DI => srca(6),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(6),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(6)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_5_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(4),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(5),
      O => Inst_ALU_rslt_sum_res(5)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_5_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(4),
      DI => srca(5),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(5),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(5)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_4_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(3),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(4),
      O => Inst_ALU_rslt_sum_res(4)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_4_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(3),
      DI => srca(4),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(4),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(4)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_3_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(2),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(3),
      O => Inst_ALU_rslt_sum_res(3)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_3_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(2),
      DI => srca(3),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(3),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(3)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_2_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(1),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(2),
      O => Inst_ALU_rslt_sum_res(2)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_2_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(1),
      DI => srca(2),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(2),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(2)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_1_Q : XORCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(0),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(1),
      O => Inst_ALU_rslt_sum_res(1)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_1_Q : MUXCY
    port map (
      CI => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(0),
      DI => srca(1),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(1),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(1)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_xor_0_Q : XORCY
    port map (
      CI => aluctrl(2),
      LI => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(0),
      O => Inst_ALU_mux_rslt_alu_Mmux_sal_3
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_cy_0_Q : MUXCY
    port map (
      CI => aluctrl(2),
      DI => srca(0),
      S => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(0),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_cy(0)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_0_Q : LUT2
    generic map(
      INIT => X"6"
    )
    port map (
      I0 => Inst_ALU_bb_0_Q,
      I1 => srca(0),
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(0)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_0_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_rslt_sum_res(22),
      I1 => Inst_ALU_rslt_sum_res(23),
      I2 => Inst_ALU_rslt_sum_res(24),
      I3 => Inst_ALU_rslt_sum_res(25),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(0)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_0_Q : MUXCY
    port map (
      CI => N1,
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(0),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(0)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_1_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_rslt_sum_res(19),
      I1 => Inst_ALU_rslt_sum_res(20),
      I2 => Inst_ALU_rslt_sum_res(21),
      I3 => Inst_ALU_rslt_sum_res(26),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(1)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_1_Q : MUXCY
    port map (
      CI => Inst_ALU_zero_cmp_eq0000_wg_cy(0),
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(1),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(1)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_2_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_rslt_sum_res(16),
      I1 => Inst_ALU_rslt_sum_res(17),
      I2 => Inst_ALU_rslt_sum_res(18),
      I3 => Inst_ALU_rslt_sum_res(27),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(2)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_2_Q : MUXCY
    port map (
      CI => Inst_ALU_zero_cmp_eq0000_wg_cy(1),
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(2),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(2)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_3_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_rslt_sum_res(13),
      I1 => Inst_ALU_rslt_sum_res(14),
      I2 => Inst_ALU_rslt_sum_res(15),
      I3 => Inst_ALU_rslt_sum_res(28),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(3)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_3_Q : MUXCY
    port map (
      CI => Inst_ALU_zero_cmp_eq0000_wg_cy(2),
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(3),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(3)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_4_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_rslt_sum_res(10),
      I1 => Inst_ALU_rslt_sum_res(11),
      I2 => Inst_ALU_rslt_sum_res(12),
      I3 => Inst_ALU_rslt_sum_res(29),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(4)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_4_Q : MUXCY
    port map (
      CI => Inst_ALU_zero_cmp_eq0000_wg_cy(3),
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(4),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(4)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_5_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_rslt_sum_res(7),
      I1 => Inst_ALU_rslt_sum_res(8),
      I2 => Inst_ALU_rslt_sum_res(9),
      I3 => Inst_ALU_rslt_sum_res(30),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(5)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_5_Q : MUXCY
    port map (
      CI => Inst_ALU_zero_cmp_eq0000_wg_cy(4),
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(5),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(5)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_6_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_rslt_sum_res(4),
      I1 => Inst_ALU_rslt_sum_res(5),
      I2 => Inst_ALU_rslt_sum_res(6),
      I3 => Inst_ALU_rslt_sum_res(31),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(6)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_6_Q : MUXCY
    port map (
      CI => Inst_ALU_zero_cmp_eq0000_wg_cy(5),
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(6),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(6)
    );
  Inst_ALU_zero_cmp_eq0000_wg_lut_7_Q : LUT4
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_ALU_mux_rslt_alu_Mmux_sal_3,
      I1 => Inst_ALU_rslt_sum_res(1),
      I2 => Inst_ALU_rslt_sum_res(2),
      I3 => Inst_ALU_rslt_sum_res(3),
      O => Inst_ALU_zero_cmp_eq0000_wg_lut(7)
    );
  Inst_ALU_zero_cmp_eq0000_wg_cy_7_Q : MUXCY
    port map (
      CI => Inst_ALU_zero_cmp_eq0000_wg_cy(6),
      DI => extsig_out_3_Q,
      S => Inst_ALU_zero_cmp_eq0000_wg_lut(7),
      O => Inst_ALU_zero_cmp_eq0000_wg_cy(7)
    );
  Inst_Instruction_Memory_Mrom_mux000213121 : LUT4
    generic map(
      INIT => X"4000"
    )
    port map (
      I0 => Inst_PC_dout_3_1_166,
      I1 => Inst_PC_dout(4),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Instruction_Memory_Mrom_mux0000101111_158,
      O => extsig_out_11_Q
    );
  Inst_Register_File_RD2_30_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N257,
      I2 => Inst_Register_File_N255,
      I3 => extsig_out_3_Q,
      O => writedata_30_OBUF_440
    );
  Inst_Register_File_RD2_29_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N253,
      I2 => Inst_Register_File_N251,
      I3 => extsig_out_3_Q,
      O => writedata_29_OBUF_438
    );
  Inst_Register_File_RD2_28_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N249,
      I2 => Inst_Register_File_N247,
      I3 => extsig_out_3_Q,
      O => writedata_28_OBUF_437
    );
  Inst_Register_File_RD2_27_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N245,
      I2 => Inst_Register_File_N243,
      I3 => extsig_out_3_Q,
      O => writedata_27_OBUF_436
    );
  Inst_Register_File_RD2_26_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N241,
      I2 => Inst_Register_File_N239,
      I3 => extsig_out_3_Q,
      O => writedata_26_OBUF_435
    );
  Inst_Register_File_RD2_25_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N237,
      I2 => Inst_Register_File_N235,
      I3 => extsig_out_3_Q,
      O => writedata_25_OBUF_434
    );
  Inst_Register_File_RD2_24_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N233,
      I2 => Inst_Register_File_N231,
      I3 => extsig_out_3_Q,
      O => writedata_24_OBUF_433
    );
  Inst_Register_File_RD2_23_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N229,
      I2 => Inst_Register_File_N227,
      I3 => extsig_out_3_Q,
      O => writedata_23_OBUF_432
    );
  Inst_Register_File_RD2_22_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N225,
      I2 => Inst_Register_File_N223,
      I3 => extsig_out_3_Q,
      O => writedata_22_OBUF_431
    );
  Inst_Register_File_RD2_21_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N221,
      I2 => Inst_Register_File_N219,
      I3 => extsig_out_3_Q,
      O => writedata_21_OBUF_430
    );
  Inst_Register_File_RD2_20_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N217,
      I2 => Inst_Register_File_N215,
      I3 => extsig_out_3_Q,
      O => writedata_20_OBUF_429
    );
  Inst_Register_File_RD2_19_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N213,
      I2 => Inst_Register_File_N211,
      I3 => extsig_out_3_Q,
      O => writedata_19_OBUF_427
    );
  Inst_Register_File_RD2_18_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N209,
      I2 => Inst_Register_File_N207,
      I3 => extsig_out_3_Q,
      O => writedata_18_OBUF_426
    );
  Inst_Register_File_RD2_17_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N205,
      I2 => Inst_Register_File_N203,
      I3 => extsig_out_3_Q,
      O => writedata_17_OBUF_425
    );
  Inst_Register_File_RD2_16_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N201,
      I2 => Inst_Register_File_N199,
      I3 => extsig_out_3_Q,
      O => writedata_16_OBUF_424
    );
  Inst_Register_File_RD2_15_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N197,
      I2 => Inst_Register_File_N195,
      I3 => extsig_out_3_Q,
      O => writedata_15_OBUF_423
    );
  Inst_Instruction_Memory_Mrom_mux000013121 : LUT4
    generic map(
      INIT => X"0400"
    )
    port map (
      I0 => Inst_PC_dout(3),
      I1 => Inst_PC_dout(4),
      I2 => Inst_PC_dout(2),
      I3 => N6,
      O => aluctrl(2)
    );
  Mux_instru_j_O_8_1 : LUT4
    generic map(
      INIT => X"AE0C"
    )
    port map (
      I0 => ALU_suma_desplaz_Madd_sal_lut(8),
      I1 => pc_branch(8),
      I2 => N11,
      I3 => N14,
      O => pc_next_j(8)
    );
  Mux_instru_j_O_6_1 : LUT4
    generic map(
      INIT => X"AE0C"
    )
    port map (
      I0 => ALU_suma_desplaz_Madd_sal_lut(6),
      I1 => pc_branch(6),
      I2 => N11,
      I3 => N14,
      O => pc_next_j(6)
    );
  Mux_instru_j_O_5_1 : LUT4
    generic map(
      INIT => X"AE0C"
    )
    port map (
      I0 => ALU_suma_desplaz_Madd_sal_lut(5),
      I1 => pc_branch(5),
      I2 => N11,
      I3 => N14,
      O => pc_next_j(5)
    );
  Inst_Register_File_RD2_0_1 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N137,
      I2 => Inst_Register_File_N135,
      I3 => extsig_out_3_Q,
      O => writedata_0_OBUF_417
    );
  Inst_Instruction_Memory_Mrom_mux00015121 : LUT4
    generic map(
      INIT => X"7000"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout_3_1_166,
      I2 => Inst_PC_dout(2),
      I3 => Inst_Instruction_Memory_Mrom_mux0000101111_158,
      O => instr_17_Q
    );
  Inst_Instruction_Memory_Mrom_mux00012121 : LUT4
    generic map(
      INIT => X"4300"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout_3_1_166,
      I2 => Inst_PC_dout(2),
      I3 => Inst_Instruction_Memory_Mrom_mux0000101111_158,
      O => instr_16_Q
    );
  Mux_instru_j_O_4_SW0 : LUT4
    generic map(
      INIT => X"F888"
    )
    port map (
      I0 => instr_27_Q,
      I1 => extsig_out_2_Q,
      I2 => pc_out_next_4_Q,
      I3 => N193,
      O => N103
    );
  Mux_instru_j_O_4_Q : LUT3
    generic map(
      INIT => X"F4"
    )
    port map (
      I0 => N191,
      I1 => pc_branch(4),
      I2 => N103,
      O => pc_next_j(4)
    );
  reset_IBUF : IBUF
    port map (
      I => reset,
      O => reset_IBUF_352
    );
  memwrite_OBUF : OBUF
    port map (
      I => extsig_out_3_Q,
      O => memwrite
    );
  address_31_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(31),
      O => address(31)
    );
  address_30_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(30),
      O => address(30)
    );
  address_29_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(29),
      O => address(29)
    );
  address_28_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(28),
      O => address(28)
    );
  address_27_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(27),
      O => address(27)
    );
  address_26_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(26),
      O => address(26)
    );
  address_25_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(25),
      O => address(25)
    );
  address_24_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(24),
      O => address(24)
    );
  address_23_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(23),
      O => address(23)
    );
  address_22_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(22),
      O => address(22)
    );
  address_21_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(21),
      O => address(21)
    );
  address_20_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(20),
      O => address(20)
    );
  address_19_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(19),
      O => address(19)
    );
  address_18_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(18),
      O => address(18)
    );
  address_17_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(17),
      O => address(17)
    );
  address_16_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(16),
      O => address(16)
    );
  address_15_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(15),
      O => address(15)
    );
  address_14_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(14),
      O => address(14)
    );
  address_13_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(13),
      O => address(13)
    );
  address_12_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(12),
      O => address(12)
    );
  address_11_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(11),
      O => address(11)
    );
  address_10_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(10),
      O => address(10)
    );
  address_9_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(9),
      O => address(9)
    );
  address_8_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(8),
      O => address(8)
    );
  address_7_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(7),
      O => address(7)
    );
  address_6_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(6),
      O => address(6)
    );
  address_5_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(5),
      O => address(5)
    );
  address_4_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(4),
      O => address(4)
    );
  address_3_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(3),
      O => address(3)
    );
  address_2_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(2),
      O => address(2)
    );
  address_1_OBUF : OBUF
    port map (
      I => Inst_ALU_rslt_sum_res(1),
      O => address(1)
    );
  address_0_OBUF : OBUF
    port map (
      I => Inst_ALU_mux_rslt_alu_Mmux_sal_3,
      O => address(0)
    );
  writedata_31_OBUF : OBUF
    port map (
      I => writedata_31_OBUF_441,
      O => writedata(31)
    );
  writedata_30_OBUF : OBUF
    port map (
      I => writedata_30_OBUF_440,
      O => writedata(30)
    );
  writedata_29_OBUF : OBUF
    port map (
      I => writedata_29_OBUF_438,
      O => writedata(29)
    );
  writedata_28_OBUF : OBUF
    port map (
      I => writedata_28_OBUF_437,
      O => writedata(28)
    );
  writedata_27_OBUF : OBUF
    port map (
      I => writedata_27_OBUF_436,
      O => writedata(27)
    );
  writedata_26_OBUF : OBUF
    port map (
      I => writedata_26_OBUF_435,
      O => writedata(26)
    );
  writedata_25_OBUF : OBUF
    port map (
      I => writedata_25_OBUF_434,
      O => writedata(25)
    );
  writedata_24_OBUF : OBUF
    port map (
      I => writedata_24_OBUF_433,
      O => writedata(24)
    );
  writedata_23_OBUF : OBUF
    port map (
      I => writedata_23_OBUF_432,
      O => writedata(23)
    );
  writedata_22_OBUF : OBUF
    port map (
      I => writedata_22_OBUF_431,
      O => writedata(22)
    );
  writedata_21_OBUF : OBUF
    port map (
      I => writedata_21_OBUF_430,
      O => writedata(21)
    );
  writedata_20_OBUF : OBUF
    port map (
      I => writedata_20_OBUF_429,
      O => writedata(20)
    );
  writedata_19_OBUF : OBUF
    port map (
      I => writedata_19_OBUF_427,
      O => writedata(19)
    );
  writedata_18_OBUF : OBUF
    port map (
      I => writedata_18_OBUF_426,
      O => writedata(18)
    );
  writedata_17_OBUF : OBUF
    port map (
      I => writedata_17_OBUF_425,
      O => writedata(17)
    );
  writedata_16_OBUF : OBUF
    port map (
      I => writedata_16_OBUF_424,
      O => writedata(16)
    );
  writedata_15_OBUF : OBUF
    port map (
      I => writedata_15_OBUF_423,
      O => writedata(15)
    );
  writedata_14_OBUF : OBUF
    port map (
      I => writedata_14_OBUF_422,
      O => writedata(14)
    );
  writedata_13_OBUF : OBUF
    port map (
      I => writedata_13_OBUF_421,
      O => writedata(13)
    );
  writedata_12_OBUF : OBUF
    port map (
      I => writedata_12_OBUF_420,
      O => writedata(12)
    );
  writedata_11_OBUF : OBUF
    port map (
      I => writedata_11_OBUF_419,
      O => writedata(11)
    );
  writedata_10_OBUF : OBUF
    port map (
      I => writedata_10_OBUF_418,
      O => writedata(10)
    );
  writedata_9_OBUF : OBUF
    port map (
      I => writedata_9_OBUF_448,
      O => writedata(9)
    );
  writedata_8_OBUF : OBUF
    port map (
      I => writedata_8_OBUF_447,
      O => writedata(8)
    );
  writedata_7_OBUF : OBUF
    port map (
      I => writedata_7_OBUF_446,
      O => writedata(7)
    );
  writedata_6_OBUF : OBUF
    port map (
      I => writedata_6_OBUF_445,
      O => writedata(6)
    );
  writedata_5_OBUF : OBUF
    port map (
      I => writedata_5_OBUF_444,
      O => writedata(5)
    );
  writedata_4_OBUF : OBUF
    port map (
      I => writedata_4_OBUF_443,
      O => writedata(4)
    );
  writedata_3_OBUF : OBUF
    port map (
      I => writedata_3_OBUF_442,
      O => writedata(3)
    );
  writedata_2_OBUF : OBUF
    port map (
      I => writedata_2_OBUF_439,
      O => writedata(2)
    );
  writedata_1_OBUF : OBUF
    port map (
      I => writedata_1_OBUF_428,
      O => writedata(1)
    );
  writedata_0_OBUF : OBUF
    port map (
      I => writedata_0_OBUF_417,
      O => writedata(0)
    );
  ALU_suma_4_Madd_sal_cy_3_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => Inst_PC_dout(3),
      O => ALU_suma_4_Madd_sal_cy_3_rt_2
    );
  ALU_suma_4_Madd_sal_cy_4_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => Inst_PC_dout(4),
      O => ALU_suma_4_Madd_sal_cy_4_rt_4
    );
  ALU_suma_4_Madd_sal_cy_5_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => Inst_PC_dout(5),
      O => ALU_suma_4_Madd_sal_cy_5_rt_6
    );
  ALU_suma_4_Madd_sal_cy_6_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => Inst_PC_dout(6),
      O => ALU_suma_4_Madd_sal_cy_6_rt_8
    );
  ALU_suma_4_Madd_sal_cy_7_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => Inst_PC_dout(7),
      O => ALU_suma_4_Madd_sal_cy_7_rt_10
    );
  ALU_suma_desplaz_Madd_sal_cy_5_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => ALU_suma_desplaz_Madd_sal_lut(5),
      O => ALU_suma_desplaz_Madd_sal_cy_5_rt_17
    );
  ALU_suma_desplaz_Madd_sal_cy_6_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => ALU_suma_desplaz_Madd_sal_lut(6),
      O => ALU_suma_desplaz_Madd_sal_cy_6_rt_19
    );
  ALU_suma_4_Madd_sal_xor_8_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => Inst_PC_dout(8),
      O => ALU_suma_4_Madd_sal_xor_8_rt_12
    );
  ALU_suma_desplaz_Madd_sal_xor_8_rt : LUT1
    generic map(
      INIT => X"2"
    )
    port map (
      I0 => ALU_suma_desplaz_Madd_sal_lut(8),
      O => ALU_suma_desplaz_Madd_sal_xor_8_rt_28
    );
  Inst_Instruction_Memory_Mrom_mux000010112 : LUT4
    generic map(
      INIT => X"8000"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => N6,
      I2 => Inst_PC_dout(2),
      I3 => Inst_PC_dout(3),
      O => instr_27_Q
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_13_Q : LUT4
    generic map(
      INIT => X"693C"
    )
    port map (
      I0 => alusrc,
      I1 => aluctrl(2),
      I2 => srca(13),
      I3 => writedata_13_OBUF_421,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(13)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_14_Q : LUT4
    generic map(
      INIT => X"693C"
    )
    port map (
      I0 => alusrc,
      I1 => aluctrl(2),
      I2 => srca(14),
      I3 => writedata_14_OBUF_422,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(14)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_1_SW0 : LUT4
    generic map(
      INIT => X"4777"
    )
    port map (
      I0 => extsig_out_1_Q,
      I1 => Inst_Instruction_Memory_Mrom_mux000016121_159,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N141,
      O => N128
    );
  Inst_ALU_mux_b_b_compl_O_15_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => Inst_Instruction_Memory_Mrom_mux000016121_159,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N197,
      O => Inst_ALU_bb_15_Q
    );
  Inst_ALU_mux_b_b_compl_O_16_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => N190,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N201,
      O => Inst_ALU_bb_16_Q
    );
  Inst_ALU_mux_b_b_compl_O_17_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N205,
      O => Inst_ALU_bb_17_Q
    );
  Inst_ALU_mux_b_b_compl_O_18_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N209,
      O => Inst_ALU_bb_18_Q
    );
  Inst_ALU_mux_b_b_compl_O_19_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N213,
      O => Inst_ALU_bb_19_Q
    );
  Inst_ALU_mux_b_b_compl_O_20_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N217,
      O => Inst_ALU_bb_20_Q
    );
  Inst_ALU_mux_b_b_compl_O_21_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N221,
      O => Inst_ALU_bb_21_Q
    );
  Inst_ALU_mux_b_b_compl_O_22_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N225,
      O => Inst_ALU_bb_22_Q
    );
  Inst_ALU_mux_b_b_compl_O_23_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N229,
      O => Inst_ALU_bb_23_Q
    );
  Inst_ALU_mux_b_b_compl_O_24_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N233,
      O => Inst_ALU_bb_24_Q
    );
  Inst_ALU_mux_b_b_compl_O_0_1_SW0 : LUT3
    generic map(
      INIT => X"20"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(2),
      I2 => N6,
      O => N130
    );
  Inst_ALU_mux_b_b_compl_O_0_1_SW1 : LUT4
    generic map(
      INIT => X"A8FF"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(2),
      I2 => Inst_PC_dout(3),
      I3 => N6,
      O => N131
    );
  Inst_ALU_mux_b_b_compl_O_0_1 : LUT4
    generic map(
      INIT => X"ACCC"
    )
    port map (
      I0 => N131,
      I1 => N130,
      I2 => N194,
      I3 => Inst_Register_File_N137,
      O => Inst_ALU_bb_0_Q
    );
  Inst_Register_File_RD2_2_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N145,
      O => writedata_2_OBUF_439
    );
  Inst_Register_File_RD2_3_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N149,
      O => writedata_3_OBUF_442
    );
  Inst_Register_File_RD2_4_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N153,
      O => writedata_4_OBUF_443
    );
  Inst_Register_File_RD2_5_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N157,
      O => writedata_5_OBUF_444
    );
  Inst_Register_File_RD2_6_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N161,
      O => writedata_6_OBUF_445
    );
  Inst_Register_File_RD2_7_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N165,
      O => writedata_7_OBUF_446
    );
  Inst_Register_File_RD2_8_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N169,
      O => writedata_8_OBUF_447
    );
  Inst_Register_File_RD2_9_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N173,
      O => writedata_9_OBUF_448
    );
  Inst_Register_File_RD2_10_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N177,
      O => writedata_10_OBUF_418
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_2_SW0 : LUT4
    generic map(
      INIT => X"4777"
    )
    port map (
      I0 => N189,
      I1 => Inst_Instruction_Memory_Mrom_mux000016121_159,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N145,
      O => N133
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_2_Q : LUT4
    generic map(
      INIT => X"6A95"
    )
    port map (
      I0 => aluctrl(2),
      I1 => instr_25_Q,
      I2 => Inst_Register_File_N15,
      I3 => N133,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(2)
    );
  Inst_ALU_mux_b_b_compl_O_25_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N237,
      O => Inst_ALU_bb_25_Q
    );
  Inst_ALU_mux_b_b_compl_O_26_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N241,
      O => Inst_ALU_bb_26_Q
    );
  Inst_ALU_mux_b_b_compl_O_27_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N245,
      O => Inst_ALU_bb_27_Q
    );
  Inst_ALU_mux_b_b_compl_O_28_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N249,
      O => Inst_ALU_bb_28_Q
    );
  Inst_ALU_mux_b_b_compl_O_29_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N253,
      O => Inst_ALU_bb_29_Q
    );
  Inst_ALU_mux_b_b_compl_O_30_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N257,
      O => Inst_ALU_bb_30_Q
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_1_Q : LUT4
    generic map(
      INIT => X"6A95"
    )
    port map (
      I0 => aluctrl(2),
      I1 => instr_25_Q,
      I2 => Inst_Register_File_N11,
      I3 => N128,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(1)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_15_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N67,
      I2 => Inst_ALU_bb_15_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(15)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_16_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N71,
      I2 => Inst_ALU_bb_16_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(16)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_17_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N75,
      I2 => Inst_ALU_bb_17_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(17)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_18_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N79,
      I2 => Inst_ALU_bb_18_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(18)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_19_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N83,
      I2 => Inst_ALU_bb_19_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(19)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_20_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N87,
      I2 => Inst_ALU_bb_20_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(20)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_21_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N91,
      I2 => Inst_ALU_bb_21_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(21)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_22_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N95,
      I2 => Inst_ALU_bb_22_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(22)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_25_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N107,
      I2 => Inst_ALU_bb_25_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(25)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_26_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N111,
      I2 => Inst_ALU_bb_26_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(26)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_27_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N115,
      I2 => Inst_ALU_bb_27_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(27)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_28_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N119,
      I2 => Inst_ALU_bb_28_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(28)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_29_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N123,
      I2 => Inst_ALU_bb_29_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(29)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_30_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N127,
      I2 => Inst_ALU_bb_30_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(30)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_31_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N131,
      I2 => Inst_ALU_bb_31_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(31)
    );
  Inst_Register_File_RD1_0_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => N195,
      I1 => Inst_Register_File_N7,
      O => srca(0)
    );
  Inst_Register_File_RD1_3_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N19,
      O => srca(3)
    );
  Inst_Register_File_RD1_4_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N23,
      O => srca(4)
    );
  Inst_Register_File_RD1_6_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N31,
      O => srca(6)
    );
  Inst_Register_File_RD1_7_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N35,
      O => srca(7)
    );
  Inst_Register_File_RD1_8_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N39,
      O => srca(8)
    );
  Inst_Register_File_RD1_9_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N43,
      O => srca(9)
    );
  Inst_Register_File_RD1_10_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N47,
      O => srca(10)
    );
  Inst_Register_File_RD1_13_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N59,
      O => srca(13)
    );
  Inst_Register_File_RD2_13_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N189,
      O => writedata_13_OBUF_421
    );
  Inst_Register_File_RD1_14_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N63,
      O => srca(14)
    );
  Inst_Register_File_RD2_14_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N193,
      O => writedata_14_OBUF_422
    );
  Inst_Register_File_RD2_31_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N261,
      O => writedata_31_OBUF_441
    );
  Inst_Register_File_RD1_1_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N11,
      O => srca(1)
    );
  Inst_Register_File_RD1_2_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N15,
      O => srca(2)
    );
  Inst_Register_File_RD1_5_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N27,
      O => srca(5)
    );
  Inst_Register_File_RD1_11_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N51,
      O => srca(11)
    );
  Inst_Register_File_RD1_12_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N55,
      O => srca(12)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_3_SW0 : LUT3
    generic map(
      INIT => X"40"
    )
    port map (
      I0 => N197,
      I1 => instr_20_Q,
      I2 => Inst_Register_File_N149,
      O => N141
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_3_Q : LUT4
    generic map(
      INIT => X"956A"
    )
    port map (
      I0 => aluctrl(2),
      I1 => instr_25_Q,
      I2 => Inst_Register_File_N19,
      I3 => N141,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(3)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_4_SW0 : LUT3
    generic map(
      INIT => X"40"
    )
    port map (
      I0 => Inst_Instruction_Memory_Mrom_mux000016121_159,
      I1 => instr_20_Q,
      I2 => Inst_Register_File_N153,
      O => N143
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_4_Q : LUT4
    generic map(
      INIT => X"956A"
    )
    port map (
      I0 => aluctrl(2),
      I1 => instr_25_Q,
      I2 => Inst_Register_File_N23,
      I3 => N143,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(4)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_6_SW0 : LUT3
    generic map(
      INIT => X"40"
    )
    port map (
      I0 => Inst_Instruction_Memory_Mrom_mux000016121_159,
      I1 => instr_20_Q,
      I2 => Inst_Register_File_N161,
      O => N145
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_6_Q : LUT4
    generic map(
      INIT => X"956A"
    )
    port map (
      I0 => aluctrl(2),
      I1 => instr_25_Q,
      I2 => Inst_Register_File_N31,
      I3 => N145,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(6)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_7_SW0 : LUT3
    generic map(
      INIT => X"40"
    )
    port map (
      I0 => Inst_Instruction_Memory_Mrom_mux000016121_159,
      I1 => instr_20_Q,
      I2 => Inst_Register_File_N165,
      O => N147
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_7_Q : LUT4
    generic map(
      INIT => X"956A"
    )
    port map (
      I0 => aluctrl(2),
      I1 => instr_25_Q,
      I2 => Inst_Register_File_N35,
      I3 => N147,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(7)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_8_SW0 : LUT3
    generic map(
      INIT => X"40"
    )
    port map (
      I0 => Inst_Instruction_Memory_Mrom_mux000016121_159,
      I1 => instr_20_Q,
      I2 => Inst_Register_File_N169,
      O => N149
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_8_Q : LUT4
    generic map(
      INIT => X"956A"
    )
    port map (
      I0 => aluctrl(2),
      I1 => instr_25_Q,
      I2 => Inst_Register_File_N39,
      I3 => N149,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(8)
    );
  Inst_ALU_mux_b_b_compl_O_31_1 : LUT4
    generic map(
      INIT => X"9AAA"
    )
    port map (
      I0 => aluctrl(2),
      I1 => alusrc,
      I2 => instr_20_Q,
      I3 => Inst_Register_File_N261,
      O => Inst_ALU_bb_31_Q
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_23_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N99,
      I2 => Inst_ALU_bb_23_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(23)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_24_Q : LUT3
    generic map(
      INIT => X"78"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N103,
      I2 => Inst_ALU_bb_24_Q,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(24)
    );
  Inst_Register_File_RD1_15_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N67,
      O => srca(15)
    );
  Inst_Register_File_RD1_16_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N71,
      O => srca(16)
    );
  Inst_Register_File_RD1_17_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N75,
      O => srca(17)
    );
  Inst_Register_File_RD1_18_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N79,
      O => srca(18)
    );
  Inst_Register_File_RD1_19_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N83,
      O => srca(19)
    );
  Inst_Register_File_RD1_20_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N87,
      O => srca(20)
    );
  Inst_Register_File_RD1_21_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N91,
      O => srca(21)
    );
  Inst_Register_File_RD1_22_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N95,
      O => srca(22)
    );
  Inst_Register_File_RD1_25_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N107,
      O => srca(25)
    );
  Inst_Register_File_RD1_26_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N111,
      O => srca(26)
    );
  Inst_Register_File_RD1_27_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N115,
      O => srca(27)
    );
  Inst_Register_File_RD1_28_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N119,
      O => srca(28)
    );
  Inst_Register_File_RD1_29_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N123,
      O => srca(29)
    );
  Inst_Register_File_RD1_30_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N127,
      O => srca(30)
    );
  Inst_Register_File_RD2_12_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N185,
      O => writedata_12_OBUF_420
    );
  Inst_Register_File_RD2_11_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N181,
      O => writedata_11_OBUF_419
    );
  Inst_Register_File_RD2_1_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_20_Q,
      I1 => Inst_Register_File_N141,
      O => writedata_1_OBUF_428
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_5_SW1 : LUT4
    generic map(
      INIT => X"D7FD"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N27,
      O => N173
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_5_SW2 : LUT4
    generic map(
      INIT => X"F5DF"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N27,
      O => N174
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_5_Q : LUT4
    generic map(
      INIT => X"028A"
    )
    port map (
      I0 => N6,
      I1 => Inst_Register_File_N157,
      I2 => N173,
      I3 => N174,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(5)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_11_SW1 : LUT4
    generic map(
      INIT => X"D7FD"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N51,
      O => N176
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_11_SW2 : LUT4
    generic map(
      INIT => X"F5DF"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N51,
      O => N177
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_11_Q : LUT4
    generic map(
      INIT => X"028A"
    )
    port map (
      I0 => N6,
      I1 => Inst_Register_File_N181,
      I2 => N176,
      I3 => N177,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(11)
    );
  Inst_Register_File_RD1_23_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N99,
      O => srca(23)
    );
  Inst_Register_File_RD1_24_1 : LUT2
    generic map(
      INIT => X"8"
    )
    port map (
      I0 => instr_25_Q,
      I1 => Inst_Register_File_N103,
      O => srca(24)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_9_SW1 : LUT4
    generic map(
      INIT => X"D7FD"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N43,
      O => N179
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_9_SW2 : LUT4
    generic map(
      INIT => X"F5DF"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N43,
      O => N180
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_9_Q : LUT4
    generic map(
      INIT => X"028A"
    )
    port map (
      I0 => N6,
      I1 => Inst_Register_File_N173,
      I2 => N179,
      I3 => N180,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(9)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_10_SW1 : LUT4
    generic map(
      INIT => X"D7FD"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N47,
      O => N182
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_10_SW2 : LUT4
    generic map(
      INIT => X"F5DF"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Register_File_N47,
      O => N183
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_10_Q : LUT4
    generic map(
      INIT => X"028A"
    )
    port map (
      I0 => N6,
      I1 => Inst_Register_File_N177,
      I2 => N182,
      I3 => N183,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(10)
    );
  ALU_suma_desplaz_Madd_sal_lut_2_Q : LUT4
    generic map(
      INIT => X"AA6A"
    )
    port map (
      I0 => pc_out_next_2_Q,
      I1 => N6,
      I2 => Inst_PC_dout(4),
      I3 => Inst_PC_dout(2),
      O => ALU_suma_desplaz_Madd_sal_lut(2)
    );
  ALU_suma_desplaz_Madd_sal_lut_3_Q : LUT4
    generic map(
      INIT => X"CC9C"
    )
    port map (
      I0 => Inst_PC_dout(3),
      I1 => pc_out_next_3_Q,
      I2 => N6,
      I3 => Inst_PC_dout(2),
      O => ALU_suma_desplaz_Madd_sal_lut(3)
    );
  Inst_Mux_rt_o_rd_sal_0_1 : LUT4
    generic map(
      INIT => X"3090"
    )
    port map (
      I0 => Inst_PC_dout(2),
      I1 => Inst_PC_dout(3),
      I2 => N6,
      I3 => Inst_PC_dout(4),
      O => sal_rt_o_rd(0)
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_12_SW1 : LUT4
    generic map(
      INIT => X"C9BE"
    )
    port map (
      I0 => Inst_PC_dout(3),
      I1 => Inst_PC_dout(2),
      I2 => Inst_Register_File_N185,
      I3 => Inst_Register_File_N55,
      O => N187
    );
  Inst_ALU_Inst_alu_sum_res_Madd_result_lut_12_Q : LUT3
    generic map(
      INIT => X"08"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => N6,
      I2 => N187,
      O => Inst_ALU_Inst_alu_sum_res_Madd_result_lut(12)
    );
  Mux_instru_j_O_7_Q : LUT4
    generic map(
      INIT => X"AE0C"
    )
    port map (
      I0 => pc_out_next_7_Q,
      I1 => pc_branch(7),
      I2 => N11,
      I3 => N14,
      O => pc_next_j(7)
    );
  Mux_instru_j_O_3_Q : LUT4
    generic map(
      INIT => X"AE0C"
    )
    port map (
      I0 => pc_out_next_3_Q,
      I1 => pc_branch(3),
      I2 => N11,
      I3 => N14,
      O => pc_next_j(3)
    );
  Mux_instru_j_O_2_Q : LUT4
    generic map(
      INIT => X"AE0C"
    )
    port map (
      I0 => pc_out_next_2_Q,
      I1 => pc_branch(2),
      I2 => N11,
      I3 => N14,
      O => pc_next_j(2)
    );
  Inst_Register_File_write_ctrl3 : LUT4
    generic map(
      INIT => X"60F0"
    )
    port map (
      I0 => Inst_PC_dout(2),
      I1 => Inst_PC_dout(3),
      I2 => N6,
      I3 => Inst_PC_dout(4),
      O => Inst_Register_File_write_ctrl1
    );
  Inst_Register_File_write_ctrl2 : LUT4
    generic map(
      INIT => X"FFFE"
    )
    port map (
      I0 => Inst_PC_dout(8),
      I1 => Inst_PC_dout(7),
      I2 => Inst_PC_dout(5),
      I3 => Inst_PC_dout(6),
      O => Inst_Register_File_write_ctrl
    );
  Inst_Instruction_Memory_Mrom_mux00015121_1 : LUT4
    generic map(
      INIT => X"7000"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout_3_1_166,
      I2 => Inst_PC_dout(2),
      I3 => N196,
      O => Inst_Instruction_Memory_Mrom_mux00015121_161
    );
  Inst_Instruction_Memory_Mrom_mux000213121_1 : LUT4
    generic map(
      INIT => X"4000"
    )
    port map (
      I0 => Inst_PC_dout_3_1_166,
      I1 => Inst_PC_dout(4),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Instruction_Memory_Mrom_mux0000101111_158,
      O => Inst_Instruction_Memory_Mrom_mux000213121_163
    );
  Inst_Instruction_Memory_Mrom_mux00015121_2 : LUT4
    generic map(
      INIT => X"7000"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => N192,
      O => Inst_Instruction_Memory_Mrom_mux000151211
    );
  Inst_Instruction_Memory_Mrom_mux00012121_1 : LUT4
    generic map(
      INIT => X"4300"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout_3_1_166,
      I2 => Inst_PC_dout(2),
      I3 => Inst_Instruction_Memory_Mrom_mux0000101111_158,
      O => Inst_Instruction_Memory_Mrom_mux00012121_160
    );
  Inst_PC_dout_3_1 : FDC
    port map (
      C => clk_BUFGP_322,
      CLR => reset_IBUF_352,
      D => pc_next_j(3),
      Q => Inst_PC_dout_3_1_166
    );
  clk_BUFGP : BUFGP
    port map (
      I => clk,
      O => clk_BUFGP_322
    );
  ALU_suma_4_Madd_sal_lut_2_INV_0 : INV
    port map (
      I => Inst_PC_dout(2),
      O => ALU_suma_4_Madd_sal_lut(2)
    );
  Inst_Instruction_Memory_Mrom_mux00038121 : LUT4_D
    generic map(
      INIT => X"8500"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(2),
      I2 => Inst_PC_dout(3),
      I3 => N6,
      LO => N189,
      O => extsig_out_2_Q
    );
  Inst_Instruction_Memory_Mrom_mux00035121 : LUT3_L
    generic map(
      INIT => X"10"
    )
    port map (
      I0 => Inst_PC_dout(2),
      I1 => Inst_PC_dout(3),
      I2 => N6,
      LO => extsig_out_1_Q
    );
  Inst_Instruction_Memory_Mrom_mux000016121 : LUT4_D
    generic map(
      INIT => X"5D00"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => N6,
      LO => N190,
      O => alusrc
    );
  Mux_instru_j_O_28_11 : LUT4_D
    generic map(
      INIT => X"FBFF"
    )
    port map (
      I0 => instr_27_Q,
      I1 => aluctrl(2),
      I2 => alusrc,
      I3 => Inst_ALU_zero_cmp_eq0000_wg_cy(7),
      LO => N191,
      O => N11
    );
  Inst_Instruction_Memory_Mrom_mux0000101111 : LUT4_D
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_PC_dout(8),
      I1 => Inst_PC_dout(7),
      I2 => Inst_PC_dout(5),
      I3 => Inst_PC_dout(6),
      LO => N192,
      O => N6
    );
  Mux_instru_j_O_10_11 : LUT4_D
    generic map(
      INIT => X"F9FD"
    )
    port map (
      I0 => instr_27_Q,
      I1 => aluctrl(2),
      I2 => alusrc,
      I3 => Inst_ALU_zero_cmp_eq0000_wg_cy(7),
      LO => N193,
      O => N14
    );
  Inst_Instruction_Memory_Mrom_mux000113121 : LUT4_D
    generic map(
      INIT => X"7F00"
    )
    port map (
      I0 => Inst_PC_dout_3_1_166,
      I1 => Inst_PC_dout(4),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Instruction_Memory_Mrom_mux0000101111_158,
      LO => N194,
      O => instr_20_Q
    );
  Inst_Instruction_Memory_Mrom_mux00005121 : LUT4_D
    generic map(
      INIT => X"4C00"
    )
    port map (
      I0 => Inst_PC_dout_3_1_166,
      I1 => Inst_PC_dout(4),
      I2 => Inst_PC_dout(2),
      I3 => Inst_Instruction_Memory_Mrom_mux0000101111_158,
      LO => N195,
      O => instr_25_Q
    );
  Inst_Instruction_Memory_Mrom_mux0000101111_1 : LUT4_D
    generic map(
      INIT => X"0001"
    )
    port map (
      I0 => Inst_PC_dout(8),
      I1 => Inst_PC_dout(7),
      I2 => Inst_PC_dout(5),
      I3 => Inst_PC_dout(6),
      LO => N196,
      O => Inst_Instruction_Memory_Mrom_mux0000101111_158
    );
  Inst_Instruction_Memory_Mrom_mux000016121_1 : LUT4_D
    generic map(
      INIT => X"5D00"
    )
    port map (
      I0 => Inst_PC_dout(4),
      I1 => Inst_PC_dout(3),
      I2 => Inst_PC_dout(2),
      I3 => N6,
      LO => N197,
      O => Inst_Instruction_Memory_Mrom_mux000016121_159
    );

end Structure;

