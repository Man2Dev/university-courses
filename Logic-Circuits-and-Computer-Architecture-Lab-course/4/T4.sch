<?xml version="1.0" encoding="UTF-8"?>
<drawing version="7">
    <attr value="spartan3" name="DeviceFamilyName">
        <trait delete="all:0" />
        <trait editname="all:0" />
        <trait edittrait="all:0" />
    </attr>
    <netlist>
        <signal name="XLXN_1" />
        <signal name="XLXN_2" />
        <signal name="XLXN_18" />
        <signal name="XLXN_22" />
        <signal name="clk" />
        <signal name="port0" />
        <signal name="XLXN_7" />
        <signal name="XLXN_20" />
        <signal name="port1" />
        <signal name="port2" />
        <signal name="XLXN_11" />
        <signal name="XLXN_12" />
        <signal name="XLXN_33" />
        <signal name="XLXN_36" />
        <signal name="XLXN_21" />
        <signal name="port3" />
        <signal name="XLXN_38" />
        <signal name="XLXN_39" />
        <signal name="XLXN_41" />
        <signal name="XLXN_43" />
        <signal name="XLXN_44" />
        <signal name="XLXN_45" />
        <signal name="XLXN_46" />
        <signal name="XLXN_47" />
        <signal name="XLXN_48" />
        <signal name="XLXN_49" />
        <port polarity="Input" name="clk" />
        <port polarity="Output" name="port0" />
        <port polarity="Output" name="port1" />
        <port polarity="Output" name="port2" />
        <port polarity="Output" name="port3" />
        <blockdef name="ibuf">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="0" y2="-64" x1="64" />
            <line x2="64" y1="-32" y2="0" x1="128" />
            <line x2="128" y1="-64" y2="-32" x1="64" />
            <line x2="128" y1="-32" y2="-32" x1="224" />
            <line x2="64" y1="-32" y2="-32" x1="0" />
        </blockdef>
        <blockdef name="gnd">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="-64" y2="-96" x1="64" />
            <line x2="52" y1="-48" y2="-48" x1="76" />
            <line x2="60" y1="-32" y2="-32" x1="68" />
            <line x2="40" y1="-64" y2="-64" x1="88" />
            <line x2="64" y1="-64" y2="-80" x1="64" />
            <line x2="64" y1="-128" y2="-96" x1="64" />
        </blockdef>
        <blockdef name="ftc">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <rect width="256" x="64" y="-320" height="256" />
            <line x2="64" y1="-32" y2="-32" x1="192" />
            <line x2="192" y1="-64" y2="-32" x1="192" />
            <line x2="64" y1="-128" y2="-144" x1="80" />
            <line x2="80" y1="-112" y2="-128" x1="64" />
            <line x2="320" y1="-256" y2="-256" x1="384" />
            <line x2="64" y1="-256" y2="-256" x1="0" />
            <line x2="64" y1="-32" y2="-32" x1="0" />
            <line x2="64" y1="-128" y2="-128" x1="0" />
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
        <blockdef name="obuf">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="0" y2="-64" x1="64" />
            <line x2="64" y1="-32" y2="0" x1="128" />
            <line x2="128" y1="-64" y2="-32" x1="64" />
            <line x2="64" y1="-32" y2="-32" x1="0" />
            <line x2="128" y1="-32" y2="-32" x1="224" />
        </blockdef>
        <blockdef name="vcc">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="-32" y2="-64" x1="64" />
            <line x2="64" y1="0" y2="-32" x1="64" />
            <line x2="32" y1="-64" y2="-64" x1="96" />
        </blockdef>
        <block symbolname="ibuf" name="XLXI_1">
            <blockpin signalname="clk" name="I" />
            <blockpin signalname="XLXN_1" name="O" />
        </block>
        <block symbolname="gnd" name="XLXI_15">
            <blockpin signalname="XLXN_2" name="G" />
        </block>
        <block symbolname="ftc" name="XLXI_3">
            <blockpin signalname="XLXN_1" name="C" />
            <blockpin signalname="XLXN_2" name="CLR" />
            <blockpin signalname="XLXN_18" name="T" />
            <blockpin signalname="XLXN_33" name="Q" />
        </block>
        <block symbolname="ftc" name="XLXI_4">
            <blockpin signalname="XLXN_1" name="C" />
            <blockpin signalname="XLXN_2" name="CLR" />
            <blockpin signalname="XLXN_33" name="T" />
            <blockpin signalname="XLXN_20" name="Q" />
        </block>
        <block symbolname="ftc" name="XLXI_2">
            <blockpin signalname="XLXN_1" name="C" />
            <blockpin signalname="XLXN_2" name="CLR" />
            <blockpin signalname="XLXN_36" name="T" />
            <blockpin signalname="XLXN_21" name="Q" />
        </block>
        <block symbolname="ftc" name="XLXI_6">
            <blockpin signalname="XLXN_1" name="C" />
            <blockpin signalname="XLXN_2" name="CLR" />
            <blockpin signalname="XLXN_38" name="T" />
            <blockpin signalname="XLXN_22" name="Q" />
        </block>
        <block symbolname="and2" name="XLXI_26">
            <blockpin signalname="XLXN_20" name="I0" />
            <blockpin signalname="XLXN_33" name="I1" />
            <blockpin signalname="XLXN_36" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_21">
            <blockpin signalname="XLXN_33" name="I" />
            <blockpin signalname="port0" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_22">
            <blockpin signalname="XLXN_20" name="I" />
            <blockpin signalname="port1" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_23">
            <blockpin signalname="XLXN_21" name="I" />
            <blockpin signalname="port2" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_24">
            <blockpin signalname="XLXN_22" name="I" />
            <blockpin signalname="port3" name="O" />
        </block>
        <block symbolname="and2" name="XLXI_25">
            <blockpin signalname="XLXN_21" name="I0" />
            <blockpin signalname="XLXN_36" name="I1" />
            <blockpin signalname="XLXN_38" name="O" />
        </block>
        <block symbolname="vcc" name="XLXI_16">
            <blockpin signalname="XLXN_18" name="P" />
        </block>
    </netlist>
    <sheet sheetnum="1" width="3520" height="2720">
        <branch name="XLXN_1">
            <wire x2="1040" y1="1680" y2="1680" x1="688" />
            <wire x2="1744" y1="1680" y2="1680" x1="1040" />
            <wire x2="2384" y1="1680" y2="1680" x1="1744" />
            <wire x2="3040" y1="1680" y2="1680" x1="2384" />
            <wire x2="1040" y1="1392" y2="1680" x1="1040" />
            <wire x2="1744" y1="1392" y2="1680" x1="1744" />
            <wire x2="2384" y1="1376" y2="1680" x1="2384" />
            <wire x2="3040" y1="1360" y2="1680" x1="3040" />
        </branch>
        <instance x="464" y="1712" name="XLXI_1" orien="R0" />
        <branch name="XLXN_2">
            <wire x2="1136" y1="1392" y2="1520" x1="1136" />
            <wire x2="1840" y1="1520" y2="1520" x1="1136" />
            <wire x2="2480" y1="1520" y2="1520" x1="1840" />
            <wire x2="3136" y1="1520" y2="1520" x1="2480" />
            <wire x2="3200" y1="1520" y2="1520" x1="3136" />
            <wire x2="3200" y1="1520" y2="1936" x1="3200" />
            <wire x2="1840" y1="1392" y2="1520" x1="1840" />
            <wire x2="2480" y1="1376" y2="1520" x1="2480" />
            <wire x2="3136" y1="1360" y2="1520" x1="3136" />
            <wire x2="3200" y1="1936" y2="1936" x1="3136" />
        </branch>
        <instance x="3072" y="2064" name="XLXI_15" orien="R0" />
        <instance x="2512" y="1376" name="XLXI_4" orien="R270" />
        <branch name="XLXN_18">
            <wire x2="2848" y1="2016" y2="2080" x1="2848" />
            <wire x2="2912" y1="2080" y2="2080" x1="2848" />
            <wire x2="2912" y1="1360" y2="2080" x1="2912" />
        </branch>
        <branch name="XLXN_22">
            <wire x2="912" y1="896" y2="912" x1="912" />
            <wire x2="912" y1="912" y2="1008" x1="912" />
        </branch>
        <branch name="clk">
            <wire x2="464" y1="1680" y2="1680" x1="432" />
        </branch>
        <instance x="2944" y="880" name="XLXI_21" orien="R270" />
        <branch name="port0">
            <wire x2="2912" y1="560" y2="640" x1="2912" />
            <wire x2="2912" y1="640" y2="656" x1="2912" />
        </branch>
        <instance x="2288" y="880" name="XLXI_22" orien="R270" />
        <branch name="port1">
            <wire x2="2256" y1="560" y2="640" x1="2256" />
            <wire x2="2256" y1="640" y2="656" x1="2256" />
        </branch>
        <instance x="1648" y="880" name="XLXI_23" orien="R270" />
        <branch name="port2">
            <wire x2="1616" y1="576" y2="640" x1="1616" />
            <wire x2="1616" y1="640" y2="656" x1="1616" />
        </branch>
        <instance x="944" y="896" name="XLXI_24" orien="R270" />
        <branch name="XLXN_33">
            <wire x2="2320" y1="1952" y2="1952" x1="1920" />
            <wire x2="2256" y1="1376" y2="1792" x1="2256" />
            <wire x2="2320" y1="1792" y2="1792" x1="2256" />
            <wire x2="2544" y1="1792" y2="1792" x1="2320" />
            <wire x2="2320" y1="1792" y2="1952" x1="2320" />
            <wire x2="2912" y1="912" y2="912" x1="2544" />
            <wire x2="2912" y1="912" y2="976" x1="2912" />
            <wire x2="2544" y1="912" y2="1792" x1="2544" />
            <wire x2="2912" y1="880" y2="912" x1="2912" />
        </branch>
        <branch name="XLXN_36">
            <wire x2="1616" y1="1872" y2="1872" x1="1296" />
            <wire x2="1616" y1="1872" y2="1920" x1="1616" />
            <wire x2="1664" y1="1920" y2="1920" x1="1616" />
            <wire x2="1616" y1="1392" y2="1872" x1="1616" />
        </branch>
        <branch name="port3">
            <wire x2="912" y1="592" y2="624" x1="912" />
            <wire x2="912" y1="624" y2="672" x1="912" />
        </branch>
        <iomarker fontsize="28" x="432" y="1680" name="clk" orien="R180" />
        <iomarker fontsize="28" x="1616" y="576" name="port2" orien="R270" />
        <iomarker fontsize="28" x="912" y="592" name="port3" orien="R270" />
        <branch name="XLXN_38">
            <wire x2="912" y1="1392" y2="1840" x1="912" />
            <wire x2="1024" y1="1840" y2="1840" x1="912" />
            <wire x2="1040" y1="1840" y2="1840" x1="1024" />
        </branch>
        <iomarker fontsize="28" x="2256" y="560" name="port1" orien="R270" />
        <iomarker fontsize="28" x="2912" y="560" name="port0" orien="R270" />
        <instance x="1920" y="1824" name="XLXI_26" orien="R180" />
        <branch name="XLXN_20">
            <wire x2="2080" y1="1888" y2="1888" x1="1920" />
            <wire x2="2080" y1="944" y2="1888" x1="2080" />
            <wire x2="2256" y1="944" y2="944" x1="2080" />
            <wire x2="2256" y1="944" y2="992" x1="2256" />
            <wire x2="2256" y1="880" y2="944" x1="2256" />
        </branch>
        <instance x="1296" y="1744" name="XLXI_25" orien="R180" />
        <branch name="XLXN_21">
            <wire x2="1456" y1="1808" y2="1808" x1="1296" />
            <wire x2="1456" y1="928" y2="1808" x1="1456" />
            <wire x2="1616" y1="928" y2="928" x1="1456" />
            <wire x2="1616" y1="928" y2="1008" x1="1616" />
            <wire x2="1616" y1="880" y2="928" x1="1616" />
        </branch>
        <instance x="1168" y="1392" name="XLXI_6" orien="R270" />
        <instance x="1872" y="1392" name="XLXI_2" orien="R270" />
        <instance x="3168" y="1360" name="XLXI_3" orien="R270" />
        <instance x="2784" y="2016" name="XLXI_16" orien="R0" />
    </sheet>
</drawing>