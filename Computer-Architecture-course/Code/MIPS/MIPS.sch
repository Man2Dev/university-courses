<?xml version="1.0" encoding="UTF-8"?>
<drawing version="7">
    <attr value="spartan3e" name="DeviceFamilyName">
        <trait delete="all:0" />
        <trait editname="all:0" />
        <trait edittrait="all:0" />
    </attr>
    <netlist>
        <signal name="XLXN_1(31:0)" />
        <signal name="Instruction(31:0)" />
        <signal name="Instruction(20:16)" />
        <signal name="Instruction(25:21)" />
        <signal name="XLXN_14(4:0)" />
        <signal name="Instruction(15:11)" />
        <signal name="Instruction(15:0)" />
        <signal name="Toggle" />
        <signal name="Clk" />
        <signal name="XLXN_26" />
        <signal name="XLXN_27" />
        <signal name="XLXN_32(31:0)" />
        <signal name="XLXN_34(31:0)" />
        <signal name="XLXN_35(31:0)" />
        <signal name="XLXN_36" />
        <signal name="XLXN_37" />
        <signal name="XLXN_41(31:0)" />
        <signal name="XLXN_42(31:0)" />
        <signal name="XLXN_44(31:0)" />
        <signal name="XLXN_45(3:0)" />
        <signal name="XLXN_46" />
        <signal name="XLXN_48" />
        <signal name="XLXN_84" />
        <signal name="XLXN_51" />
        <signal name="XLXN_53" />
        <signal name="XLXN_54" />
        <signal name="XLXN_55" />
        <signal name="XLXN_58" />
        <signal name="XLXN_60" />
        <signal name="XLXN_61(1:0)" />
        <signal name="Instruction(5:0)" />
        <signal name="XLXN_67" />
        <signal name="XLXN_68(31:0)" />
        <signal name="Instruction(31:26)" />
        <signal name="XLXN_93(31:0)" />
        <signal name="XLXN_94(31:0)" />
        <signal name="XLXN_95(31:0)" />
        <port polarity="Input" name="Toggle" />
        <port polarity="Input" name="Clk" />
        <blockdef name="CtrlFSM">
            <timestamp>2021-1-14T14:44:53</timestamp>
            <rect width="400" x="64" y="-320" height="320" />
            <line x2="0" y1="-288" y2="-288" x1="64" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <line x2="528" y1="-288" y2="-288" x1="464" />
            <line x2="528" y1="-224" y2="-224" x1="464" />
            <line x2="528" y1="-160" y2="-160" x1="464" />
            <line x2="528" y1="-96" y2="-96" x1="464" />
            <line x2="528" y1="-32" y2="-32" x1="464" />
        </blockdef>
        <blockdef name="PC">
            <timestamp>2021-1-14T14:46:45</timestamp>
            <rect width="304" x="64" y="-128" height="128" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="368" y="-108" height="24" />
            <line x2="432" y1="-96" y2="-96" x1="368" />
        </blockdef>
        <blockdef name="IM">
            <timestamp>2021-1-14T14:45:3</timestamp>
            <rect width="480" x="64" y="-128" height="128" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="544" y="-108" height="24" />
            <line x2="608" y1="-96" y2="-96" x1="544" />
        </blockdef>
        <blockdef name="ADD1">
            <timestamp>2021-1-14T14:44:27</timestamp>
            <rect width="320" x="64" y="-64" height="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="384" y="-44" height="24" />
            <line x2="448" y1="-32" y2="-32" x1="384" />
        </blockdef>
        <blockdef name="ADD2">
            <timestamp>2021-1-14T14:44:32</timestamp>
            <rect width="336" x="64" y="-128" height="128" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="400" y="-108" height="24" />
            <line x2="464" y1="-96" y2="-96" x1="400" />
        </blockdef>
        <blockdef name="MUX32">
            <timestamp>2021-1-14T14:45:8</timestamp>
            <rect width="336" x="64" y="-192" height="192" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="400" y="-172" height="24" />
            <line x2="464" y1="-160" y2="-160" x1="400" />
        </blockdef>
        <blockdef name="CTL">
            <timestamp>2021-1-14T14:44:48</timestamp>
            <rect width="384" x="64" y="-512" height="512" />
            <line x2="0" y1="-480" y2="-480" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <line x2="512" y1="-480" y2="-480" x1="448" />
            <line x2="512" y1="-416" y2="-416" x1="448" />
            <line x2="512" y1="-352" y2="-352" x1="448" />
            <line x2="512" y1="-288" y2="-288" x1="448" />
            <line x2="512" y1="-224" y2="-224" x1="448" />
            <line x2="512" y1="-160" y2="-160" x1="448" />
            <line x2="512" y1="-96" y2="-96" x1="448" />
            <rect width="64" x="448" y="-44" height="24" />
            <line x2="512" y1="-32" y2="-32" x1="448" />
        </blockdef>
        <blockdef name="MUX5">
            <timestamp>2021-1-14T14:45:20</timestamp>
            <rect width="320" x="64" y="-192" height="192" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="384" y="-172" height="24" />
            <line x2="448" y1="-160" y2="-160" x1="384" />
        </blockdef>
        <blockdef name="REG">
            <timestamp>2021-1-14T14:47:8</timestamp>
            <rect width="496" x="64" y="-384" height="384" />
            <line x2="0" y1="-352" y2="-352" x1="64" />
            <line x2="0" y1="-288" y2="-288" x1="64" />
            <rect width="64" x="0" y="-236" height="24" />
            <line x2="0" y1="-224" y2="-224" x1="64" />
            <rect width="64" x="0" y="-172" height="24" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="560" y="-364" height="24" />
            <line x2="624" y1="-352" y2="-352" x1="560" />
            <rect width="64" x="560" y="-44" height="24" />
            <line x2="624" y1="-32" y2="-32" x1="560" />
        </blockdef>
        <blockdef name="ALU">
            <timestamp>2021-1-14T14:44:43</timestamp>
            <rect width="336" x="64" y="-256" height="256" />
            <line x2="0" y1="-224" y2="-224" x1="64" />
            <rect width="64" x="0" y="-172" height="24" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <line x2="464" y1="-224" y2="-224" x1="400" />
            <rect width="64" x="400" y="-44" height="24" />
            <line x2="464" y1="-32" y2="-32" x1="400" />
        </blockdef>
        <blockdef name="ALUCTR">
            <timestamp>2021-1-14T14:44:37</timestamp>
            <rect width="400" x="64" y="-128" height="128" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="464" y="-108" height="24" />
            <line x2="528" y1="-96" y2="-96" x1="464" />
        </blockdef>
        <blockdef name="EXT">
            <timestamp>2021-1-14T14:44:58</timestamp>
            <rect width="256" x="64" y="-64" height="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="320" y="-44" height="24" />
            <line x2="384" y1="-32" y2="-32" x1="320" />
        </blockdef>
        <blockdef name="RAM">
            <timestamp>2021-1-14T14:46:6</timestamp>
            <rect width="432" x="64" y="-320" height="320" />
            <line x2="0" y1="-288" y2="-288" x1="64" />
            <line x2="0" y1="-224" y2="-224" x1="64" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="496" y="-300" height="24" />
            <line x2="560" y1="-288" y2="-288" x1="496" />
        </blockdef>
        <blockdef name="and2">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="-64" y2="-64" x1="0" />
            <line x2="64" y1="-128" y2="-128" x1="0" />
            <line x2="192" y1="-96" y2="-96" x1="256" />
            <arc ex="144" ey="-144" sx="144" sy="-48" r="48" cx="144" cy="-96" />
            <line x2="64" y1="-48" y2="-48" x1="144" />
            <line x2="144" y1="-144" y2="-144" x1="64" />
            <line x2="64" y1="-48" y2="-144" x1="64" />
        </blockdef>
        <block symbolname="CtrlFSM" name="XLXI_1">
            <blockpin signalname="Toggle" name="I_FSM_T" />
            <blockpin signalname="Clk" name="I_FSM_CLK" />
            <blockpin signalname="Instruction(31:0)" name="I_FSM_INSTR(31:0)" />
            <blockpin signalname="XLXN_26" name="O_FSM_IM" />
            <blockpin signalname="XLXN_27" name="O_FSM_CTL" />
            <blockpin signalname="XLXN_46" name="O_FSM_ALU" />
            <blockpin signalname="XLXN_67" name="O_FSM_RAM" />
            <blockpin signalname="XLXN_84" name="O_FSM_PCREG" />
        </block>
        <block symbolname="PC" name="XLXI_2">
            <blockpin signalname="XLXN_84" name="I_PC_TOGGLE" />
            <blockpin signalname="XLXN_35(31:0)" name="I_PC(31:0)" />
            <blockpin signalname="XLXN_1(31:0)" name="O_PC(31:0)" />
        </block>
        <block symbolname="IM" name="XLXI_3">
            <blockpin signalname="XLXN_26" name="I_ROM_T" />
            <blockpin signalname="XLXN_1(31:0)" name="I_ROM_ADDRESS(31:0)" />
            <blockpin signalname="Instruction(31:0)" name="O_ROM_DATA(31:0)" />
        </block>
        <block symbolname="CTL" name="XLXI_7">
            <blockpin signalname="XLXN_27" name="I_CTL_T" />
            <blockpin signalname="Instruction(31:26)" name="I_CTL_INS(5:0)" />
            <blockpin signalname="XLXN_51" name="O_CTL_RegDst" />
            <blockpin signalname="XLXN_37" name="O_CTL_Branch" />
            <blockpin signalname="XLXN_53" name="O_CTL_MemRead" />
            <blockpin signalname="XLXN_54" name="O_CTL_MemtoReg" />
            <blockpin signalname="XLXN_58" name="O_CTL_MemWrite" />
            <blockpin signalname="XLXN_55" name="O_CTL_ALUSrc" />
            <blockpin signalname="XLXN_60" name="O_CTL_RegWrite" />
            <blockpin signalname="XLXN_61(1:0)" name="O_CTL_ALUOp(1:0)" />
        </block>
        <block symbolname="MUX5" name="XLXI_8">
            <blockpin signalname="XLXN_51" name="I_MUX_SELECT" />
            <blockpin signalname="Instruction(20:16)" name="I_MUX_0(4:0)" />
            <blockpin signalname="Instruction(15:11)" name="I_MUX_1(4:0)" />
            <blockpin signalname="XLXN_14(4:0)" name="O_MUX(4:0)" />
        </block>
        <block symbolname="REG" name="XLXI_9">
            <blockpin signalname="XLXN_84" name="I_REG_T" />
            <blockpin signalname="XLXN_60" name="I_REG_Write" />
            <blockpin signalname="Instruction(25:21)" name="I_REG_SEL_RS(4:0)" />
            <blockpin signalname="Instruction(20:16)" name="I_REG_SEL_RT(4:0)" />
            <blockpin signalname="XLXN_14(4:0)" name="I_REG_SEL_RD(4:0)" />
            <blockpin signalname="XLXN_93(31:0)" name="I_REG_DATA_RD(31:0)" />
            <blockpin signalname="XLXN_44(31:0)" name="O_REG_DATA_A(31:0)" />
            <blockpin signalname="XLXN_41(31:0)" name="O_REG_DATA_B(31:0)" />
        </block>
        <block symbolname="ADD1" name="XLXI_4">
            <blockpin signalname="XLXN_1(31:0)" name="I_ADD1(31:0)" />
            <blockpin signalname="XLXN_34(31:0)" name="O_ADD1(31:0)" />
        </block>
        <block symbolname="ADD2" name="XLXI_5">
            <blockpin signalname="XLXN_34(31:0)" name="I_ADD2_1(31:0)" />
            <blockpin signalname="XLXN_68(31:0)" name="I_ADD2_2(31:0)" />
            <blockpin signalname="XLXN_32(31:0)" name="O_ADD2(31:0)" />
        </block>
        <block symbolname="MUX32" name="XLXI_6">
            <blockpin signalname="XLXN_36" name="I_MUX_SELECT" />
            <blockpin signalname="XLXN_34(31:0)" name="I_MUX_0(31:0)" />
            <blockpin signalname="XLXN_32(31:0)" name="I_MUX_1(31:0)" />
            <blockpin signalname="XLXN_35(31:0)" name="O_MUX(31:0)" />
        </block>
        <block symbolname="MUX32" name="XLXI_13">
            <blockpin signalname="XLXN_55" name="I_MUX_SELECT" />
            <blockpin signalname="XLXN_41(31:0)" name="I_MUX_0(31:0)" />
            <blockpin signalname="XLXN_68(31:0)" name="I_MUX_1(31:0)" />
            <blockpin signalname="XLXN_42(31:0)" name="O_MUX(31:0)" />
        </block>
        <block symbolname="ALU" name="XLXI_14">
            <blockpin signalname="XLXN_46" name="I_ALU_T" />
            <blockpin signalname="XLXN_45(3:0)" name="I_ALU_CTR(3:0)" />
            <blockpin signalname="XLXN_44(31:0)" name="I_ALU_1(31:0)" />
            <blockpin signalname="XLXN_42(31:0)" name="I_ALU_2(31:0)" />
            <blockpin signalname="XLXN_48" name="O_ALU_ZERO" />
            <blockpin signalname="XLXN_95(31:0)" name="O_ALU(31:0)" />
        </block>
        <block symbolname="ALUCTR" name="XLXI_15">
            <blockpin signalname="XLXN_61(1:0)" name="I_ALU_OP(1:0)" />
            <blockpin signalname="Instruction(5:0)" name="I_ALU_FUNCT(5:0)" />
            <blockpin signalname="XLXN_45(3:0)" name="O_ALU_CTR(3:0)" />
        </block>
        <block symbolname="EXT" name="XLXI_16">
            <blockpin signalname="Instruction(15:0)" name="I_EXT(15:0)" />
            <blockpin signalname="XLXN_68(31:0)" name="O_EXT(31:0)" />
        </block>
        <block symbolname="RAM" name="XLXI_17">
            <blockpin signalname="XLXN_67" name="I_RAM_T" />
            <blockpin signalname="XLXN_53" name="I_RAM_RE" />
            <blockpin signalname="XLXN_58" name="I_RAM_WR" />
            <blockpin signalname="XLXN_95(31:0)" name="I_RAM_ADDR(31:0)" />
            <blockpin signalname="XLXN_41(31:0)" name="I_RAM_DATA(31:0)" />
            <blockpin signalname="XLXN_94(31:0)" name="O_RAM_DATA(31:0)" />
        </block>
        <block symbolname="MUX32" name="XLXI_18">
            <blockpin signalname="XLXN_54" name="I_MUX_SELECT" />
            <blockpin signalname="XLXN_95(31:0)" name="I_MUX_0(31:0)" />
            <blockpin signalname="XLXN_94(31:0)" name="I_MUX_1(31:0)" />
            <blockpin signalname="XLXN_93(31:0)" name="O_MUX(31:0)" />
        </block>
        <block symbolname="and2" name="XLXI_19">
            <blockpin signalname="XLXN_48" name="I0" />
            <blockpin signalname="XLXN_37" name="I1" />
            <blockpin signalname="XLXN_36" name="O" />
        </block>
    </netlist>
    <sheet sheetnum="1" width="5440" height="3520">
        <instance x="1920" y="1440" name="XLXI_7" orien="R0">
        </instance>
        <instance x="864" y="592" name="XLXI_4" orien="R0">
        </instance>
        <instance x="208" y="1792" name="XLXI_2" orien="R0">
        </instance>
        <instance x="208" y="3264" name="XLXI_1" orien="R0">
        </instance>
        <instance x="832" y="1728" name="XLXI_3" orien="R0">
        </instance>
        <branch name="XLXN_1(31:0)">
            <wire x2="736" y1="1696" y2="1696" x1="640" />
            <wire x2="832" y1="1696" y2="1696" x1="736" />
            <wire x2="864" y1="560" y2="560" x1="736" />
            <wire x2="736" y1="560" y2="1696" x1="736" />
        </branch>
        <branch name="Instruction(31:0)">
            <wire x2="144" y1="3232" y2="3376" x1="144" />
            <wire x2="1536" y1="3376" y2="3376" x1="144" />
            <wire x2="208" y1="3232" y2="3232" x1="144" />
            <wire x2="1536" y1="1632" y2="1632" x1="1440" />
            <wire x2="1536" y1="1632" y2="1904" x1="1536" />
            <wire x2="1536" y1="1904" y2="1968" x1="1536" />
            <wire x2="1536" y1="1968" y2="2160" x1="1536" />
            <wire x2="1536" y1="2160" y2="2624" x1="1536" />
            <wire x2="1536" y1="2624" y2="2816" x1="1536" />
            <wire x2="1536" y1="2816" y2="3376" x1="1536" />
            <wire x2="1536" y1="1408" y2="1632" x1="1536" />
        </branch>
        <instance x="2448" y="2128" name="XLXI_9" orien="R0">
        </instance>
        <branch name="Instruction(20:16)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1680" y="1968" type="branch" />
            <wire x2="1680" y1="1968" y2="1968" x1="1632" />
            <wire x2="1712" y1="1968" y2="1968" x1="1680" />
            <wire x2="1712" y1="1968" y2="2096" x1="1712" />
            <wire x2="1824" y1="2096" y2="2096" x1="1712" />
            <wire x2="2448" y1="1968" y2="1968" x1="1712" />
        </branch>
        <branch name="Instruction(25:21)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1680" y="1904" type="branch" />
            <wire x2="1680" y1="1904" y2="1904" x1="1632" />
            <wire x2="2448" y1="1904" y2="1904" x1="1680" />
        </branch>
        <branch name="XLXN_14(4:0)">
            <wire x2="2448" y1="2032" y2="2032" x1="2272" />
        </branch>
        <branch name="Instruction(15:11)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1680" y="2160" type="branch" />
            <wire x2="1680" y1="2160" y2="2160" x1="1632" />
            <wire x2="1824" y1="2160" y2="2160" x1="1680" />
        </branch>
        <instance x="1824" y="2192" name="XLXI_8" orien="R0">
        </instance>
        <instance x="2576" y="2848" name="XLXI_16" orien="R0">
        </instance>
        <branch name="Instruction(15:0)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1664" y="2816" type="branch" />
            <wire x2="1664" y1="2816" y2="2816" x1="1632" />
            <wire x2="2576" y1="2816" y2="2816" x1="1664" />
        </branch>
        <branch name="Toggle">
            <wire x2="208" y1="2976" y2="2976" x1="176" />
        </branch>
        <iomarker fontsize="28" x="176" y="2976" name="Toggle" orien="R180" />
        <branch name="Clk">
            <wire x2="208" y1="3104" y2="3104" x1="176" />
        </branch>
        <iomarker fontsize="28" x="176" y="3104" name="Clk" orien="R180" />
        <branch name="XLXN_26">
            <wire x2="784" y1="2976" y2="2976" x1="736" />
            <wire x2="784" y1="1632" y2="2976" x1="784" />
            <wire x2="832" y1="1632" y2="1632" x1="784" />
        </branch>
        <branch name="XLXN_27">
            <wire x2="816" y1="3040" y2="3040" x1="736" />
            <wire x2="816" y1="960" y2="3040" x1="816" />
            <wire x2="1920" y1="960" y2="960" x1="816" />
        </branch>
        <instance x="3520" y="656" name="XLXI_5" orien="R0">
        </instance>
        <branch name="XLXN_35(31:0)">
            <wire x2="80" y1="128" y2="1760" x1="80" />
            <wire x2="208" y1="1760" y2="1760" x1="80" />
            <wire x2="5072" y1="128" y2="128" x1="80" />
            <wire x2="5072" y1="128" y2="432" x1="5072" />
            <wire x2="5072" y1="432" y2="432" x1="4960" />
        </branch>
        <branch name="XLXN_37">
            <wire x2="4048" y1="1024" y2="1024" x1="2432" />
        </branch>
        <instance x="4048" y="1152" name="XLXI_19" orien="R0" />
        <branch name="XLXN_32(31:0)">
            <wire x2="4496" y1="560" y2="560" x1="3984" />
        </branch>
        <branch name="XLXN_34(31:0)">
            <wire x2="3168" y1="560" y2="560" x1="1312" />
            <wire x2="3520" y1="560" y2="560" x1="3168" />
            <wire x2="3168" y1="496" y2="560" x1="3168" />
            <wire x2="4496" y1="496" y2="496" x1="3168" />
        </branch>
        <branch name="XLXN_36">
            <wire x2="4416" y1="1056" y2="1056" x1="4304" />
            <wire x2="4416" y1="432" y2="1056" x1="4416" />
            <wire x2="4496" y1="432" y2="432" x1="4416" />
        </branch>
        <instance x="4496" y="592" name="XLXI_6" orien="R0">
        </instance>
        <branch name="XLXN_41(31:0)">
            <wire x2="3184" y1="2096" y2="2096" x1="3072" />
            <wire x2="3184" y1="2096" y2="2272" x1="3184" />
            <wire x2="4512" y1="2272" y2="2272" x1="3184" />
            <wire x2="3248" y1="2096" y2="2096" x1="3184" />
        </branch>
        <instance x="3248" y="2192" name="XLXI_13" orien="R0">
        </instance>
        <branch name="XLXN_42(31:0)">
            <wire x2="3888" y1="2032" y2="2032" x1="3712" />
        </branch>
        <instance x="3888" y="2064" name="XLXI_14" orien="R0">
        </instance>
        <branch name="XLXN_44(31:0)">
            <wire x2="3600" y1="1776" y2="1776" x1="3072" />
            <wire x2="3600" y1="1776" y2="1968" x1="3600" />
            <wire x2="3888" y1="1968" y2="1968" x1="3600" />
        </branch>
        <branch name="XLXN_45(3:0)">
            <wire x2="3808" y1="2560" y2="2560" x1="3712" />
            <wire x2="3808" y1="1904" y2="2560" x1="3808" />
            <wire x2="3888" y1="1904" y2="1904" x1="3808" />
        </branch>
        <branch name="XLXN_46">
            <wire x2="848" y1="3104" y2="3104" x1="736" />
            <wire x2="3744" y1="2368" y2="2368" x1="848" />
            <wire x2="848" y1="2368" y2="3104" x1="848" />
            <wire x2="3888" y1="1840" y2="1840" x1="3744" />
            <wire x2="3744" y1="1840" y2="2368" x1="3744" />
        </branch>
        <instance x="3184" y="2656" name="XLXI_15" orien="R0">
        </instance>
        <branch name="XLXN_48">
            <wire x2="4048" y1="1088" y2="1088" x1="4032" />
            <wire x2="4032" y1="1088" y2="1456" x1="4032" />
            <wire x2="4384" y1="1456" y2="1456" x1="4032" />
            <wire x2="4384" y1="1456" y2="1840" x1="4384" />
            <wire x2="4384" y1="1840" y2="1840" x1="4352" />
        </branch>
        <branch name="XLXN_84">
            <wire x2="208" y1="1696" y2="1696" x1="144" />
            <wire x2="144" y1="1696" y2="1872" x1="144" />
            <wire x2="912" y1="1872" y2="1872" x1="144" />
            <wire x2="912" y1="1872" y2="3232" x1="912" />
            <wire x2="912" y1="3232" y2="3232" x1="736" />
            <wire x2="912" y1="1776" y2="1872" x1="912" />
            <wire x2="2448" y1="1776" y2="1776" x1="912" />
        </branch>
        <branch name="XLXN_51">
            <wire x2="1808" y1="784" y2="2032" x1="1808" />
            <wire x2="1824" y1="2032" y2="2032" x1="1808" />
            <wire x2="2544" y1="784" y2="784" x1="1808" />
            <wire x2="2544" y1="784" y2="960" x1="2544" />
            <wire x2="2544" y1="960" y2="960" x1="2432" />
        </branch>
        <branch name="XLXN_53">
            <wire x2="3920" y1="1088" y2="1088" x1="2432" />
            <wire x2="3920" y1="1088" y2="1360" x1="3920" />
            <wire x2="4480" y1="1360" y2="1360" x1="3920" />
            <wire x2="4480" y1="1360" y2="2080" x1="4480" />
            <wire x2="4512" y1="2080" y2="2080" x1="4480" />
        </branch>
        <branch name="XLXN_55">
            <wire x2="3216" y1="1280" y2="1280" x1="2432" />
            <wire x2="3216" y1="1280" y2="2032" x1="3216" />
            <wire x2="3248" y1="2032" y2="2032" x1="3216" />
        </branch>
        <branch name="XLXN_58">
            <wire x2="4448" y1="1216" y2="1216" x1="2432" />
            <wire x2="4448" y1="1216" y2="2144" x1="4448" />
            <wire x2="4512" y1="2144" y2="2144" x1="4448" />
        </branch>
        <branch name="XLXN_60">
            <wire x2="2512" y1="1504" y2="1504" x1="2384" />
            <wire x2="2384" y1="1504" y2="1840" x1="2384" />
            <wire x2="2448" y1="1840" y2="1840" x1="2384" />
            <wire x2="2512" y1="1344" y2="1344" x1="2432" />
            <wire x2="2512" y1="1344" y2="1504" x1="2512" />
        </branch>
        <branch name="XLXN_61(1:0)">
            <wire x2="3136" y1="1408" y2="1408" x1="2432" />
            <wire x2="3136" y1="1408" y2="2560" x1="3136" />
            <wire x2="3184" y1="2560" y2="2560" x1="3136" />
        </branch>
        <branch name="Instruction(5:0)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1664" y="2624" type="branch" />
            <wire x2="1664" y1="2624" y2="2624" x1="1632" />
            <wire x2="3184" y1="2624" y2="2624" x1="1664" />
        </branch>
        <instance x="4512" y="2304" name="XLXI_17" orien="R0">
        </instance>
        <branch name="XLXN_67">
            <wire x2="880" y1="3168" y2="3168" x1="736" />
            <wire x2="880" y1="3008" y2="3168" x1="880" />
            <wire x2="4464" y1="3008" y2="3008" x1="880" />
            <wire x2="4512" y1="2016" y2="2016" x1="4464" />
            <wire x2="4464" y1="2016" y2="3008" x1="4464" />
        </branch>
        <branch name="XLXN_68(31:0)">
            <wire x2="3152" y1="2816" y2="2816" x1="2960" />
            <wire x2="3504" y1="624" y2="624" x1="3152" />
            <wire x2="3520" y1="624" y2="624" x1="3504" />
            <wire x2="3152" y1="624" y2="2160" x1="3152" />
            <wire x2="3152" y1="2160" y2="2816" x1="3152" />
            <wire x2="3248" y1="2160" y2="2160" x1="3152" />
        </branch>
        <branch name="XLXN_54">
            <wire x2="4144" y1="1152" y2="1152" x1="2432" />
            <wire x2="4144" y1="1152" y2="1600" x1="4144" />
            <wire x2="4848" y1="1600" y2="1600" x1="4144" />
        </branch>
        <instance x="4848" y="1760" name="XLXI_18" orien="R0">
        </instance>
        <bustap x2="1632" y1="1904" y2="1904" x1="1536" />
        <bustap x2="1632" y1="1968" y2="1968" x1="1536" />
        <bustap x2="1632" y1="2160" y2="2160" x1="1536" />
        <bustap x2="1632" y1="2624" y2="2624" x1="1536" />
        <bustap x2="1632" y1="2816" y2="2816" x1="1536" />
        <bustap x2="1632" y1="1408" y2="1408" x1="1536" />
        <branch name="Instruction(31:26)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1680" y="1408" type="branch" />
            <wire x2="1680" y1="1408" y2="1408" x1="1632" />
            <wire x2="1920" y1="1408" y2="1408" x1="1680" />
        </branch>
        <branch name="XLXN_93(31:0)">
            <wire x2="2448" y1="2096" y2="2096" x1="2352" />
            <wire x2="2352" y1="2096" y2="2688" x1="2352" />
            <wire x2="5376" y1="2688" y2="2688" x1="2352" />
            <wire x2="5376" y1="1600" y2="1600" x1="5312" />
            <wire x2="5376" y1="1600" y2="2688" x1="5376" />
        </branch>
        <branch name="XLXN_94(31:0)">
            <wire x2="4848" y1="1728" y2="1728" x1="4784" />
            <wire x2="4784" y1="1728" y2="1824" x1="4784" />
            <wire x2="5136" y1="1824" y2="1824" x1="4784" />
            <wire x2="5136" y1="1824" y2="2016" x1="5136" />
            <wire x2="5136" y1="2016" y2="2016" x1="5072" />
        </branch>
        <branch name="XLXN_95(31:0)">
            <wire x2="4416" y1="2032" y2="2032" x1="4352" />
            <wire x2="4416" y1="2032" y2="2208" x1="4416" />
            <wire x2="4512" y1="2208" y2="2208" x1="4416" />
            <wire x2="4848" y1="1664" y2="1664" x1="4416" />
            <wire x2="4416" y1="1664" y2="2032" x1="4416" />
        </branch>
    </sheet>
</drawing>