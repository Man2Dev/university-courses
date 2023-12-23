<?xml version="1.0" encoding="UTF-8"?>
<drawing version="7">
    <attr value="spartan3" name="DeviceFamilyName">
        <trait delete="all:0" />
        <trait editname="all:0" />
        <trait edittrait="all:0" />
    </attr>
    <netlist>
        <signal name="XLXN_5" />
        <signal name="XLXN_7(5:0)" />
        <signal name="XLXN_12(5:0)" />
        <signal name="XLXN_13(5:0)" />
        <signal name="XLXN_14(5:0)" />
        <signal name="XLXN_15(5:0)" />
        <signal name="XLXN_16" />
        <signal name="XLXN_25(5:0)" />
        <signal name="XLXN_26(5:0)" />
        <signal name="XLXN_27(5:0)" />
        <signal name="XLXN_28(5:0)" />
        <signal name="XLXN_29(5:0)" />
        <signal name="XLXN_30(5:0)" />
        <signal name="XLXN_31(5:0)" />
        <signal name="XLXN_32(5:0)" />
        <signal name="XLXN_33(5:0)" />
        <signal name="XLXN_34(5:0)" />
        <signal name="XLXN_35(5:0)" />
        <signal name="XLXN_36(5:0)" />
        <signal name="XLXN_37(5:0)" />
        <signal name="XLXN_38(5:0)" />
        <signal name="XLXN_39" />
        <signal name="XLXN_40" />
        <signal name="XLXN_41" />
        <signal name="XLXN_42" />
        <signal name="XLXN_43" />
        <signal name="XLXN_44" />
        <signal name="XLXN_45" />
        <signal name="XLXN_46" />
        <signal name="XLXN_47" />
        <signal name="XLXN_48" />
        <signal name="XLXN_49" />
        <signal name="XLXN_50" />
        <signal name="XLXN_51" />
        <signal name="XLXN_52" />
        <signal name="XLXN_53" />
        <signal name="XLXN_54" />
        <signal name="XLXN_55" />
        <signal name="XLXN_56(5:0)" />
        <signal name="XLXN_57(5:0)" />
        <signal name="XLXN_58(5:0)" />
        <signal name="XLXN_59(5:0)" />
        <signal name="XLXN_60(5:0)" />
        <signal name="XLXN_62(5:0)" />
        <signal name="XLXN_63(5:0)" />
        <signal name="Reset" />
        <signal name="clock" />
        <signal name="XLXN_66" />
        <signal name="XLXN_67" />
        <signal name="XLXN_68" />
        <signal name="XLXN_69" />
        <signal name="XLXN_70" />
        <signal name="XLXN_71(5:0)" />
        <signal name="XLXN_72(5:0)" />
        <port polarity="Input" name="Reset" />
        <port polarity="Input" name="clock" />
        <blockdef name="REG">
            <timestamp>2022-7-1T14:19:10</timestamp>
            <rect width="256" x="64" y="-192" height="192" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <line x2="384" y1="-160" y2="-160" x1="320" />
            <rect width="64" x="320" y="-44" height="24" />
            <line x2="384" y1="-32" y2="-32" x1="320" />
        </blockdef>
        <blockdef name="PC">
            <timestamp>2022-7-1T14:15:55</timestamp>
            <rect width="256" x="64" y="-320" height="320" />
            <line x2="0" y1="-288" y2="-288" x1="64" />
            <line x2="0" y1="-224" y2="-224" x1="64" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="320" y="-300" height="24" />
            <line x2="384" y1="-288" y2="-288" x1="320" />
        </blockdef>
        <blockdef name="IR">
            <timestamp>2022-7-1T14:18:47</timestamp>
            <rect width="256" x="64" y="-192" height="192" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="320" y="-172" height="24" />
            <line x2="384" y1="-160" y2="-160" x1="320" />
        </blockdef>
        <blockdef name="MEM">
            <timestamp>2022-7-1T14:16:5</timestamp>
            <rect width="288" x="64" y="-64" height="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="352" y="-44" height="24" />
            <line x2="416" y1="-32" y2="-32" x1="352" />
        </blockdef>
        <blockdef name="MUX4">
            <timestamp>2022-7-1T14:16:0</timestamp>
            <rect width="256" x="64" y="-384" height="384" />
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
            <rect width="64" x="320" y="-364" height="24" />
            <line x2="384" y1="-352" y2="-352" x1="320" />
        </blockdef>
        <blockdef name="ALU">
            <timestamp>2022-7-1T14:19:1</timestamp>
            <rect width="256" x="64" y="-192" height="192" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="320" y="-172" height="24" />
            <line x2="384" y1="-160" y2="-160" x1="320" />
        </blockdef>
        <blockdef name="ControlUnit">
            <timestamp>2022-7-1T14:18:52</timestamp>
            <rect width="256" x="64" y="-896" height="896" />
            <line x2="0" y1="-864" y2="-864" x1="64" />
            <line x2="0" y1="-736" y2="-736" x1="64" />
            <line x2="0" y1="-608" y2="-608" x1="64" />
            <line x2="0" y1="-480" y2="-480" x1="64" />
            <line x2="0" y1="-352" y2="-352" x1="64" />
            <line x2="0" y1="-224" y2="-224" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <line x2="384" y1="-864" y2="-864" x1="320" />
            <line x2="384" y1="-800" y2="-800" x1="320" />
            <line x2="384" y1="-736" y2="-736" x1="320" />
            <line x2="384" y1="-672" y2="-672" x1="320" />
            <line x2="384" y1="-608" y2="-608" x1="320" />
            <line x2="384" y1="-544" y2="-544" x1="320" />
            <line x2="384" y1="-480" y2="-480" x1="320" />
            <line x2="384" y1="-416" y2="-416" x1="320" />
            <line x2="384" y1="-352" y2="-352" x1="320" />
            <line x2="384" y1="-288" y2="-288" x1="320" />
            <line x2="384" y1="-224" y2="-224" x1="320" />
            <line x2="384" y1="-160" y2="-160" x1="320" />
            <line x2="384" y1="-96" y2="-96" x1="320" />
            <line x2="384" y1="-32" y2="-32" x1="320" />
        </blockdef>
        <blockdef name="BUSC">
            <timestamp>2022-7-1T14:18:56</timestamp>
            <rect width="256" x="64" y="-192" height="192" />
            <line x2="0" y1="-160" y2="-160" x1="64" />
            <rect width="64" x="0" y="-108" height="24" />
            <line x2="0" y1="-96" y2="-96" x1="64" />
            <rect width="64" x="0" y="-44" height="24" />
            <line x2="0" y1="-32" y2="-32" x1="64" />
            <rect width="64" x="320" y="-172" height="24" />
            <line x2="384" y1="-160" y2="-160" x1="320" />
        </blockdef>
        <block symbolname="ControlUnit" name="XLXI_12">
            <blockpin signalname="clock" name="clock" />
            <blockpin signalname="Reset" name="Reset" />
            <blockpin signalname="XLXN_52" name="ZR0" />
            <blockpin signalname="XLXN_53" name="ZR1" />
            <blockpin signalname="XLXN_54" name="ZR2" />
            <blockpin signalname="XLXN_55" name="ZR3" />
            <blockpin signalname="XLXN_56(5:0)" name="ROUTIR(5:0)" />
            <blockpin signalname="XLXN_39" name="LD0" />
            <blockpin signalname="XLXN_40" name="LD1" />
            <blockpin signalname="XLXN_41" name="LD2" />
            <blockpin signalname="XLXN_42" name="LD3" />
            <blockpin signalname="XLXN_43" name="LDPC" />
            <blockpin signalname="XLXN_44" name="LDIR" />
            <blockpin signalname="XLXN_48" name="S00" />
            <blockpin signalname="XLXN_49" name="S01" />
            <blockpin signalname="XLXN_50" name="S10" />
            <blockpin signalname="XLXN_51" name="S11" />
            <blockpin signalname="XLXN_16" name="Bus_Sel" />
            <blockpin signalname="XLXN_45" name="CMD" />
            <blockpin signalname="XLXN_46" name="INC" />
            <blockpin signalname="XLXN_47" name="RST" />
        </block>
        <block symbolname="PC" name="XLXI_5">
            <blockpin signalname="clock" name="CLK" />
            <blockpin signalname="XLXN_43" name="LD" />
            <blockpin signalname="XLXN_47" name="CLR" />
            <blockpin signalname="XLXN_46" name="INC" />
            <blockpin signalname="XLXN_72(5:0)" name="RIN(5:0)" />
            <blockpin signalname="XLXN_7(5:0)" name="ROUT(5:0)" />
        </block>
        <block symbolname="IR" name="XLXI_6">
            <blockpin signalname="clock" name="CLK" />
            <blockpin signalname="XLXN_44" name="LD" />
            <blockpin signalname="XLXN_72(5:0)" name="RIN(5:0)" />
            <blockpin signalname="XLXN_56(5:0)" name="ROUT(5:0)" />
        </block>
        <block symbolname="MEM" name="XLXI_7">
            <blockpin signalname="XLXN_7(5:0)" name="ADDRESS(5:0)" />
            <blockpin signalname="XLXN_12(5:0)" name="DATA(5:0)" />
        </block>
        <block symbolname="MUX4" name="XLXI_8">
            <blockpin signalname="XLXN_48" name="S0" />
            <blockpin signalname="XLXN_49" name="S1" />
            <blockpin signalname="XLXN_57(5:0)" name="I0(5:0)" />
            <blockpin signalname="XLXN_58(5:0)" name="I1(5:0)" />
            <blockpin signalname="XLXN_59(5:0)" name="I2(5:0)" />
            <blockpin signalname="XLXN_60(5:0)" name="I3(5:0)" />
            <blockpin signalname="XLXN_62(5:0)" name="O(5:0)" />
        </block>
        <block symbolname="MUX4" name="XLXI_9">
            <blockpin signalname="XLXN_50" name="S0" />
            <blockpin signalname="XLXN_51" name="S1" />
            <blockpin signalname="XLXN_57(5:0)" name="I0(5:0)" />
            <blockpin signalname="XLXN_58(5:0)" name="I1(5:0)" />
            <blockpin signalname="XLXN_59(5:0)" name="I2(5:0)" />
            <blockpin signalname="XLXN_60(5:0)" name="I3(5:0)" />
            <blockpin signalname="XLXN_63(5:0)" name="O(5:0)" />
        </block>
        <block symbolname="ALU" name="XLXI_10">
            <blockpin signalname="XLXN_45" name="CMD" />
            <blockpin signalname="XLXN_62(5:0)" name="IN1(5:0)" />
            <blockpin signalname="XLXN_63(5:0)" name="IN2(5:0)" />
            <blockpin signalname="XLXN_15(5:0)" name="RESULT(5:0)" />
        </block>
        <block symbolname="BUSC" name="XLXI_53">
            <blockpin signalname="XLXN_16" name="SEL" />
            <blockpin signalname="XLXN_12(5:0)" name="MDATA(5:0)" />
            <blockpin signalname="XLXN_15(5:0)" name="ALURES(5:0)" />
            <blockpin signalname="XLXN_72(5:0)" name="DBUS(5:0)" />
        </block>
        <block symbolname="REG" name="XLXI_1">
            <blockpin signalname="clock" name="CLK" />
            <blockpin signalname="XLXN_39" name="LD" />
            <blockpin signalname="XLXN_72(5:0)" name="RIN(5:0)" />
            <blockpin signalname="XLXN_52" name="ZR" />
            <blockpin signalname="XLXN_57(5:0)" name="ROUT(5:0)" />
        </block>
        <block symbolname="REG" name="XLXI_2">
            <blockpin signalname="clock" name="CLK" />
            <blockpin signalname="XLXN_40" name="LD" />
            <blockpin signalname="XLXN_72(5:0)" name="RIN(5:0)" />
            <blockpin signalname="XLXN_53" name="ZR" />
            <blockpin signalname="XLXN_58(5:0)" name="ROUT(5:0)" />
        </block>
        <block symbolname="REG" name="XLXI_3">
            <blockpin signalname="clock" name="CLK" />
            <blockpin signalname="XLXN_41" name="LD" />
            <blockpin signalname="XLXN_72(5:0)" name="RIN(5:0)" />
            <blockpin signalname="XLXN_54" name="ZR" />
            <blockpin signalname="XLXN_59(5:0)" name="ROUT(5:0)" />
        </block>
        <block symbolname="REG" name="XLXI_4">
            <blockpin signalname="clock" name="CLK" />
            <blockpin signalname="XLXN_42" name="LD" />
            <blockpin signalname="XLXN_72(5:0)" name="RIN(5:0)" />
            <blockpin signalname="XLXN_55" name="ZR" />
            <blockpin signalname="XLXN_60(5:0)" name="ROUT(5:0)" />
        </block>
    </netlist>
    <sheet sheetnum="1" width="7040" height="5440">
        <instance x="2224" y="3120" name="XLXI_5" orien="R0">
        </instance>
        <instance x="2224" y="3376" name="XLXI_6" orien="R0">
        </instance>
        <branch name="XLXN_7(5:0)">
            <wire x2="2736" y1="2832" y2="2832" x1="2608" />
        </branch>
        <instance x="3984" y="2272" name="XLXI_8" orien="R0">
        </instance>
        <instance x="3984" y="2752" name="XLXI_9" orien="R0">
        </instance>
        <instance x="4656" y="2112" name="XLXI_10" orien="R0">
        </instance>
        <instance x="1536" y="2656" name="XLXI_53" orien="R0">
        </instance>
        <branch name="XLXN_12(5:0)">
            <wire x2="1488" y1="2560" y2="3472" x1="1488" />
            <wire x2="3216" y1="3472" y2="3472" x1="1488" />
            <wire x2="1536" y1="2560" y2="2560" x1="1488" />
            <wire x2="3216" y1="2832" y2="2832" x1="3152" />
            <wire x2="3216" y1="2832" y2="3472" x1="3216" />
        </branch>
        <branch name="XLXN_15(5:0)">
            <wire x2="1536" y1="2624" y2="2624" x1="1520" />
            <wire x2="1520" y1="2624" y2="3520" x1="1520" />
            <wire x2="5120" y1="3520" y2="3520" x1="1520" />
            <wire x2="5120" y1="1952" y2="1952" x1="5040" />
            <wire x2="5120" y1="1952" y2="3520" x1="5120" />
        </branch>
        <instance x="2736" y="2864" name="XLXI_7" orien="R0">
        </instance>
        <branch name="XLXN_16">
            <wire x2="1520" y1="1904" y2="1904" x1="1504" />
            <wire x2="1520" y1="1904" y2="2496" x1="1520" />
            <wire x2="1536" y1="2496" y2="2496" x1="1520" />
        </branch>
        <instance x="1120" y="2128" name="XLXI_12" orien="R0">
        </instance>
        <instance x="2192" y="1472" name="XLXI_1" orien="R0">
        </instance>
        <instance x="2192" y="1760" name="XLXI_2" orien="R0">
        </instance>
        <instance x="2192" y="2080" name="XLXI_3" orien="R0">
        </instance>
        <instance x="2192" y="2384" name="XLXI_4" orien="R0">
        </instance>
        <branch name="XLXN_39">
            <wire x2="1840" y1="1264" y2="1264" x1="1504" />
            <wire x2="1840" y1="1264" y2="1376" x1="1840" />
            <wire x2="2192" y1="1376" y2="1376" x1="1840" />
        </branch>
        <branch name="XLXN_40">
            <wire x2="1824" y1="1328" y2="1328" x1="1504" />
            <wire x2="1824" y1="1328" y2="1664" x1="1824" />
            <wire x2="2192" y1="1664" y2="1664" x1="1824" />
        </branch>
        <branch name="XLXN_41">
            <wire x2="1808" y1="1392" y2="1392" x1="1504" />
            <wire x2="1808" y1="1392" y2="1984" x1="1808" />
            <wire x2="2192" y1="1984" y2="1984" x1="1808" />
        </branch>
        <branch name="XLXN_42">
            <wire x2="1792" y1="1456" y2="1456" x1="1504" />
            <wire x2="1792" y1="1456" y2="2288" x1="1792" />
            <wire x2="2192" y1="2288" y2="2288" x1="1792" />
        </branch>
        <branch name="XLXN_43">
            <wire x2="1936" y1="1520" y2="1520" x1="1504" />
            <wire x2="1936" y1="1520" y2="2896" x1="1936" />
            <wire x2="2224" y1="2896" y2="2896" x1="1936" />
        </branch>
        <branch name="XLXN_44">
            <wire x2="1952" y1="1584" y2="1584" x1="1504" />
            <wire x2="1952" y1="1584" y2="3280" x1="1952" />
            <wire x2="2224" y1="3280" y2="3280" x1="1952" />
        </branch>
        <branch name="XLXN_45">
            <wire x2="1584" y1="1968" y2="1968" x1="1504" />
            <wire x2="1584" y1="1824" y2="1968" x1="1584" />
            <wire x2="4432" y1="1824" y2="1824" x1="1584" />
            <wire x2="4432" y1="1824" y2="1952" x1="4432" />
            <wire x2="4656" y1="1952" y2="1952" x1="4432" />
        </branch>
        <branch name="XLXN_46">
            <wire x2="2016" y1="2032" y2="2032" x1="1504" />
            <wire x2="2016" y1="2032" y2="3024" x1="2016" />
            <wire x2="2224" y1="3024" y2="3024" x1="2016" />
        </branch>
        <branch name="XLXN_47">
            <wire x2="2000" y1="2096" y2="2096" x1="1504" />
            <wire x2="2000" y1="2096" y2="2960" x1="2000" />
            <wire x2="2224" y1="2960" y2="2960" x1="2000" />
        </branch>
        <branch name="XLXN_48">
            <wire x2="1568" y1="1648" y2="1648" x1="1504" />
            <wire x2="1568" y1="1504" y2="1648" x1="1568" />
            <wire x2="2624" y1="1504" y2="1504" x1="1568" />
            <wire x2="2624" y1="1504" y2="1920" x1="2624" />
            <wire x2="3984" y1="1920" y2="1920" x1="2624" />
        </branch>
        <branch name="XLXN_49">
            <wire x2="1568" y1="1712" y2="1712" x1="1504" />
            <wire x2="1568" y1="1712" y2="1808" x1="1568" />
            <wire x2="2640" y1="1808" y2="1808" x1="1568" />
            <wire x2="2640" y1="1808" y2="1984" x1="2640" />
            <wire x2="3984" y1="1984" y2="1984" x1="2640" />
        </branch>
        <branch name="XLXN_50">
            <wire x2="2736" y1="1776" y2="1776" x1="1504" />
            <wire x2="2736" y1="1776" y2="2400" x1="2736" />
            <wire x2="3984" y1="2400" y2="2400" x1="2736" />
        </branch>
        <branch name="XLXN_51">
            <wire x2="2720" y1="1840" y2="1840" x1="1504" />
            <wire x2="2720" y1="1840" y2="2464" x1="2720" />
            <wire x2="3984" y1="2464" y2="2464" x1="2720" />
        </branch>
        <branch name="XLXN_52">
            <wire x2="1040" y1="1168" y2="1520" x1="1040" />
            <wire x2="1120" y1="1520" y2="1520" x1="1040" />
            <wire x2="2640" y1="1168" y2="1168" x1="1040" />
            <wire x2="2640" y1="1168" y2="1312" x1="2640" />
            <wire x2="2640" y1="1312" y2="1312" x1="2576" />
        </branch>
        <branch name="XLXN_53">
            <wire x2="1120" y1="1648" y2="1648" x1="1056" />
            <wire x2="1056" y1="1648" y2="2144" x1="1056" />
            <wire x2="2608" y1="2144" y2="2144" x1="1056" />
            <wire x2="2608" y1="1600" y2="1600" x1="2576" />
            <wire x2="2608" y1="1600" y2="2144" x1="2608" />
        </branch>
        <branch name="XLXN_54">
            <wire x2="1120" y1="1776" y2="1776" x1="1104" />
            <wire x2="1104" y1="1776" y2="2160" x1="1104" />
            <wire x2="2592" y1="2160" y2="2160" x1="1104" />
            <wire x2="2592" y1="1920" y2="1920" x1="2576" />
            <wire x2="2592" y1="1920" y2="2160" x1="2592" />
        </branch>
        <branch name="XLXN_55">
            <wire x2="1120" y1="1904" y2="1904" x1="1088" />
            <wire x2="1088" y1="1904" y2="2176" x1="1088" />
            <wire x2="2640" y1="2176" y2="2176" x1="1088" />
            <wire x2="2640" y1="2176" y2="2224" x1="2640" />
            <wire x2="2640" y1="2224" y2="2224" x1="2576" />
        </branch>
        <branch name="XLXN_56(5:0)">
            <wire x2="1120" y1="2032" y2="2032" x1="1024" />
            <wire x2="1024" y1="2032" y2="2448" x1="1024" />
            <wire x2="2672" y1="2448" y2="2448" x1="1024" />
            <wire x2="2672" y1="2448" y2="3216" x1="2672" />
            <wire x2="2672" y1="3216" y2="3216" x1="2608" />
        </branch>
        <branch name="XLXN_57(5:0)">
            <wire x2="3280" y1="1440" y2="1440" x1="2576" />
            <wire x2="3280" y1="1440" y2="2048" x1="3280" />
            <wire x2="3984" y1="2048" y2="2048" x1="3280" />
            <wire x2="3632" y1="1440" y2="1440" x1="3280" />
            <wire x2="3632" y1="1440" y2="2528" x1="3632" />
            <wire x2="3984" y1="2528" y2="2528" x1="3632" />
        </branch>
        <branch name="XLXN_59(5:0)">
            <wire x2="3248" y1="2048" y2="2048" x1="2576" />
            <wire x2="3248" y1="2048" y2="2176" x1="3248" />
            <wire x2="3984" y1="2176" y2="2176" x1="3248" />
            <wire x2="3248" y1="2032" y2="2048" x1="3248" />
            <wire x2="3360" y1="2032" y2="2032" x1="3248" />
            <wire x2="3360" y1="2032" y2="2656" x1="3360" />
            <wire x2="3984" y1="2656" y2="2656" x1="3360" />
        </branch>
        <branch name="XLXN_60(5:0)">
            <wire x2="3280" y1="2352" y2="2352" x1="2576" />
            <wire x2="3280" y1="2240" y2="2240" x1="3248" />
            <wire x2="3280" y1="2240" y2="2352" x1="3280" />
            <wire x2="3984" y1="2240" y2="2240" x1="3280" />
            <wire x2="3248" y1="2240" y2="2720" x1="3248" />
            <wire x2="3984" y1="2720" y2="2720" x1="3248" />
        </branch>
        <branch name="XLXN_58(5:0)">
            <wire x2="3264" y1="1728" y2="1728" x1="2576" />
            <wire x2="3264" y1="1728" y2="2112" x1="3264" />
            <wire x2="3984" y1="2112" y2="2112" x1="3264" />
            <wire x2="3616" y1="1728" y2="1728" x1="3264" />
            <wire x2="3616" y1="1728" y2="2592" x1="3616" />
            <wire x2="3984" y1="2592" y2="2592" x1="3616" />
        </branch>
        <branch name="XLXN_62(5:0)">
            <wire x2="4416" y1="1920" y2="1920" x1="4368" />
            <wire x2="4416" y1="1920" y2="2016" x1="4416" />
            <wire x2="4656" y1="2016" y2="2016" x1="4416" />
        </branch>
        <branch name="XLXN_63(5:0)">
            <wire x2="4512" y1="2400" y2="2400" x1="4368" />
            <wire x2="4512" y1="2080" y2="2400" x1="4512" />
            <wire x2="4656" y1="2080" y2="2080" x1="4512" />
        </branch>
        <branch name="Reset">
            <wire x2="1104" y1="1392" y2="1392" x1="624" />
            <wire x2="1120" y1="1392" y2="1392" x1="1104" />
        </branch>
        <branch name="clock">
            <wire x2="880" y1="3216" y2="3216" x1="672" />
            <wire x2="896" y1="3216" y2="3216" x1="880" />
            <wire x2="2224" y1="3216" y2="3216" x1="896" />
            <wire x2="896" y1="3216" y2="3232" x1="896" />
            <wire x2="976" y1="3232" y2="3232" x1="896" />
            <wire x2="880" y1="1264" y2="3216" x1="880" />
            <wire x2="1104" y1="1264" y2="1264" x1="880" />
            <wire x2="1120" y1="1264" y2="1264" x1="1104" />
            <wire x2="2224" y1="2832" y2="2832" x1="896" />
            <wire x2="896" y1="2832" y2="2848" x1="896" />
            <wire x2="896" y1="2848" y2="3216" x1="896" />
            <wire x2="1968" y1="2848" y2="2848" x1="896" />
            <wire x2="976" y1="2224" y2="3232" x1="976" />
            <wire x2="2192" y1="2224" y2="2224" x1="976" />
            <wire x2="2192" y1="1312" y2="1312" x1="1968" />
            <wire x2="1968" y1="1312" y2="1600" x1="1968" />
            <wire x2="2192" y1="1600" y2="1600" x1="1968" />
            <wire x2="1968" y1="1600" y2="1920" x1="1968" />
            <wire x2="1968" y1="1920" y2="2848" x1="1968" />
            <wire x2="2192" y1="1920" y2="1920" x1="1968" />
        </branch>
        <iomarker fontsize="28" x="672" y="3216" name="clock" orien="R180" />
        <iomarker fontsize="28" x="624" y="1392" name="Reset" orien="R180" />
        <branch name="XLXN_72(5:0)">
            <wire x2="2096" y1="2496" y2="2496" x1="1920" />
            <wire x2="2096" y1="2496" y2="3088" x1="2096" />
            <wire x2="2224" y1="3088" y2="3088" x1="2096" />
            <wire x2="2096" y1="3088" y2="3344" x1="2096" />
            <wire x2="2224" y1="3344" y2="3344" x1="2096" />
            <wire x2="2192" y1="1440" y2="1440" x1="2096" />
            <wire x2="2096" y1="1440" y2="1728" x1="2096" />
            <wire x2="2096" y1="1728" y2="1744" x1="2096" />
            <wire x2="2096" y1="1744" y2="2048" x1="2096" />
            <wire x2="2096" y1="2048" y2="2064" x1="2096" />
            <wire x2="2096" y1="2064" y2="2352" x1="2096" />
            <wire x2="2096" y1="2352" y2="2368" x1="2096" />
            <wire x2="2096" y1="2368" y2="2496" x1="2096" />
            <wire x2="2144" y1="2368" y2="2368" x1="2096" />
            <wire x2="2144" y1="2064" y2="2064" x1="2096" />
            <wire x2="2192" y1="1728" y2="1728" x1="2096" />
            <wire x2="2144" y1="2048" y2="2064" x1="2144" />
            <wire x2="2192" y1="2048" y2="2048" x1="2144" />
            <wire x2="2144" y1="2352" y2="2368" x1="2144" />
            <wire x2="2192" y1="2352" y2="2352" x1="2144" />
        </branch>
    </sheet>
</drawing>