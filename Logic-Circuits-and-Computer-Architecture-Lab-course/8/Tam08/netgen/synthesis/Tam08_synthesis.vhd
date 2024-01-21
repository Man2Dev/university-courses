--------------------------------------------------------------------------------
-- Copyright (c) 1995-2013 Xilinx, Inc.  All rights reserved.
--------------------------------------------------------------------------------
--   ____  ____
--  /   /\/   /
-- /___/  \  /    Vendor: Xilinx
-- \   \   \/     Version: P.20131013
--  \   \         Application: netgen
--  /   /         Filename: Tam08_synthesis.vhd
-- /___/   /\     Timestamp: Fri Dec 25 06:31:59 2020
-- \   \  /  \ 
--  \___\/\___\
--             
-- Command	: -intstyle ise -ar Structure -tm Tam08 -w -dir netgen/synthesis -ofmt vhdl -sim Tam08.ngc Tam08_synthesis.vhd 
-- Device	: xc3s400-5-pq208
-- Input file	: Tam08.ngc
-- Output file	: C:\Users\home\Tam08\netgen\synthesis\Tam08_synthesis.vhd
-- # of Entities	: 1
-- Design Name	: Tam08
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

entity Tam08 is
  port (
    E : in STD_LOGIC := 'X'; 
    Q : out STD_LOGIC_VECTOR ( 7 downto 0 ); 
    S : in STD_LOGIC_VECTOR ( 2 downto 0 ) 
  );
end Tam08;

architecture Structure of Tam08 is
  signal E_IBUF_1 : STD_LOGIC; 
  signal Q_0_OBUF_10 : STD_LOGIC; 
  signal Q_1_OBUF_11 : STD_LOGIC; 
  signal Q_2_OBUF_12 : STD_LOGIC; 
  signal Q_3_OBUF_13 : STD_LOGIC; 
  signal Q_4_OBUF_14 : STD_LOGIC; 
  signal Q_5_OBUF_15 : STD_LOGIC; 
  signal Q_6_OBUF_16 : STD_LOGIC; 
  signal Q_7_OBUF_17 : STD_LOGIC; 
  signal S_0_IBUF_21 : STD_LOGIC; 
  signal S_1_IBUF_22 : STD_LOGIC; 
  signal S_2_IBUF_23 : STD_LOGIC; 
begin
  Q_7_1 : LUT4
    generic map(
      INIT => X"8000"
    )
    port map (
      I0 => E_IBUF_1,
      I1 => S_0_IBUF_21,
      I2 => S_1_IBUF_22,
      I3 => S_2_IBUF_23,
      O => Q_7_OBUF_17
    );
  Q_6_1 : LUT4
    generic map(
      INIT => X"2000"
    )
    port map (
      I0 => E_IBUF_1,
      I1 => S_0_IBUF_21,
      I2 => S_1_IBUF_22,
      I3 => S_2_IBUF_23,
      O => Q_6_OBUF_16
    );
  Q_5_1 : LUT4
    generic map(
      INIT => X"2000"
    )
    port map (
      I0 => S_0_IBUF_21,
      I1 => S_1_IBUF_22,
      I2 => E_IBUF_1,
      I3 => S_2_IBUF_23,
      O => Q_5_OBUF_15
    );
  Q_4_1 : LUT4
    generic map(
      INIT => X"0200"
    )
    port map (
      I0 => E_IBUF_1,
      I1 => S_0_IBUF_21,
      I2 => S_1_IBUF_22,
      I3 => S_2_IBUF_23,
      O => Q_4_OBUF_14
    );
  Q_3_1 : LUT4
    generic map(
      INIT => X"2000"
    )
    port map (
      I0 => E_IBUF_1,
      I1 => S_2_IBUF_23,
      I2 => S_0_IBUF_21,
      I3 => S_1_IBUF_22,
      O => Q_3_OBUF_13
    );
  Q_2_1 : LUT4
    generic map(
      INIT => X"0200"
    )
    port map (
      I0 => E_IBUF_1,
      I1 => S_0_IBUF_21,
      I2 => S_2_IBUF_23,
      I3 => S_1_IBUF_22,
      O => Q_2_OBUF_12
    );
  Q_1_1 : LUT4
    generic map(
      INIT => X"0200"
    )
    port map (
      I0 => S_0_IBUF_21,
      I1 => S_2_IBUF_23,
      I2 => S_1_IBUF_22,
      I3 => E_IBUF_1,
      O => Q_1_OBUF_11
    );
  Q_0_1 : LUT4
    generic map(
      INIT => X"0004"
    )
    port map (
      I0 => S_0_IBUF_21,
      I1 => E_IBUF_1,
      I2 => S_2_IBUF_23,
      I3 => S_1_IBUF_22,
      O => Q_0_OBUF_10
    );
  E_IBUF : IBUF
    port map (
      I => E,
      O => E_IBUF_1
    );
  S_2_IBUF : IBUF
    port map (
      I => S(2),
      O => S_2_IBUF_23
    );
  S_1_IBUF : IBUF
    port map (
      I => S(1),
      O => S_1_IBUF_22
    );
  S_0_IBUF : IBUF
    port map (
      I => S(0),
      O => S_0_IBUF_21
    );
  Q_7_OBUF : OBUF
    port map (
      I => Q_7_OBUF_17,
      O => Q(7)
    );
  Q_6_OBUF : OBUF
    port map (
      I => Q_6_OBUF_16,
      O => Q(6)
    );
  Q_5_OBUF : OBUF
    port map (
      I => Q_5_OBUF_15,
      O => Q(5)
    );
  Q_4_OBUF : OBUF
    port map (
      I => Q_4_OBUF_14,
      O => Q(4)
    );
  Q_3_OBUF : OBUF
    port map (
      I => Q_3_OBUF_13,
      O => Q(3)
    );
  Q_2_OBUF : OBUF
    port map (
      I => Q_2_OBUF_12,
      O => Q(2)
    );
  Q_1_OBUF : OBUF
    port map (
      I => Q_1_OBUF_11,
      O => Q(1)
    );
  Q_0_OBUF : OBUF
    port map (
      I => Q_0_OBUF_10,
      O => Q(0)
    );

end Structure;

