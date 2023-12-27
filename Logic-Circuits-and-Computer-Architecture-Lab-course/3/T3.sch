<?xml version="1.0" encoding="UTF-8"?>
<drawing version="7">
    <attr value="spartan3" name="DeviceFamilyName">
        <trait delete="all:0" />
        <trait editname="all:0" />
        <trait edittrait="all:0" />
    </attr>
    <netlist>
        <signal name="Clock" />
        <signal name="XLXN_2" />
        <signal name="XLXN_3" />
        <signal name="Q(7:0)" />
        <signal name="LED1" />
        <signal name="Q(1)" />
        <signal name="Q(0)" />
        <signal name="Q(7)" />
        <signal name="Q(6)" />
        <signal name="Q(5)" />
        <signal name="Q(4)" />
        <signal name="Q(3)" />
        <signal name="Q(2)" />
        <signal name="LED2" />
        <signal name="LED3" />
        <signal name="LED4" />
        <signal name="LED5" />
        <signal name="LED6" />
        <signal name="LED7" />
        <signal name="LED8" />
        <port polarity="Input" name="Clock" />
        <port polarity="Output" name="LED1" />
        <port polarity="Output" name="LED2" />
        <port polarity="Output" name="LED3" />
        <port polarity="Output" name="LED4" />
        <port polarity="Output" name="LED5" />
        <port polarity="Output" name="LED6" />
        <port polarity="Output" name="LED7" />
        <port polarity="Output" name="LED8" />
        <blockdef name="cb8ce">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="320" y1="-128" y2="-128" x1="384" />
            <rect width="64" x="320" y="-268" height="24" />
            <line x2="320" y1="-256" y2="-256" x1="384" />
            <line x2="64" y1="-192" y2="-192" x1="0" />
            <line x2="64" y1="-32" y2="-32" x1="192" />
            <line x2="192" y1="-64" y2="-32" x1="192" />
            <line x2="64" y1="-128" y2="-144" x1="80" />
            <line x2="80" y1="-112" y2="-128" x1="64" />
            <line x2="64" y1="-128" y2="-128" x1="0" />
            <line x2="64" y1="-32" y2="-32" x1="0" />
            <line x2="320" y1="-192" y2="-192" x1="384" />
            <rect width="256" x="64" y="-320" height="256" />
        </blockdef>
        <blockdef name="vcc">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="-32" y2="-64" x1="64" />
            <line x2="64" y1="0" y2="-32" x1="64" />
            <line x2="32" y1="-64" y2="-64" x1="96" />
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
        <blockdef name="obuf">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="0" y2="-64" x1="64" />
            <line x2="64" y1="-32" y2="0" x1="128" />
            <line x2="128" y1="-64" y2="-32" x1="64" />
            <line x2="64" y1="-32" y2="-32" x1="0" />
            <line x2="128" y1="-32" y2="-32" x1="224" />
        </blockdef>
        <block symbolname="cb8ce" name="XLXI_1">
            <blockpin signalname="Clock" name="C" />
            <blockpin signalname="XLXN_2" name="CE" />
            <blockpin signalname="XLXN_3" name="CLR" />
            <blockpin name="CEO" />
            <blockpin signalname="Q(7:0)" name="Q(7:0)" />
            <blockpin name="TC" />
        </block>
        <block symbolname="vcc" name="XLXI_3">
            <blockpin signalname="XLXN_2" name="P" />
        </block>
        <block symbolname="gnd" name="XLXI_4">
            <blockpin signalname="XLXN_3" name="G" />
        </block>
        <block symbolname="obuf" name="XLXI_5">
            <blockpin signalname="Q(7)" name="I" />
            <blockpin signalname="LED1" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_6">
            <blockpin signalname="Q(6)" name="I" />
            <blockpin signalname="LED2" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_7">
            <blockpin signalname="Q(5)" name="I" />
            <blockpin signalname="LED3" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_8">
            <blockpin signalname="Q(4)" name="I" />
            <blockpin signalname="LED4" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_9">
            <blockpin signalname="Q(3)" name="I" />
            <blockpin signalname="LED5" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_10">
            <blockpin signalname="Q(2)" name="I" />
            <blockpin signalname="LED6" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_11">
            <blockpin signalname="Q(1)" name="I" />
            <blockpin signalname="LED7" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_12">
            <blockpin signalname="Q(0)" name="I" />
            <blockpin signalname="LED8" name="O" />
        </block>
    </netlist>
    <sheet sheetnum="1" width="3520" height="2720">
        <instance x="224" y="400" name="XLXI_1" orien="R0" />
        <instance x="16" y="128" name="XLXI_3" orien="R0" />
        <branch name="Clock">
            <wire x2="224" y1="272" y2="272" x1="112" />
        </branch>
        <branch name="XLXN_2">
            <wire x2="80" y1="128" y2="208" x1="80" />
            <wire x2="224" y1="208" y2="208" x1="80" />
        </branch>
        <iomarker fontsize="28" x="112" y="272" name="Clock" orien="R180" />
        <branch name="Q(7:0)">
            <wire x2="720" y1="144" y2="144" x1="608" />
            <wire x2="720" y1="144" y2="176" x1="720" />
            <wire x2="720" y1="176" y2="256" x1="720" />
            <wire x2="720" y1="256" y2="336" x1="720" />
            <wire x2="720" y1="336" y2="416" x1="720" />
            <wire x2="720" y1="416" y2="496" x1="720" />
            <wire x2="720" y1="496" y2="576" x1="720" />
            <wire x2="720" y1="576" y2="656" x1="720" />
            <wire x2="720" y1="96" y2="144" x1="720" />
        </branch>
        <instance x="1136" y="128" name="XLXI_5" orien="R0" />
        <instance x="1136" y="208" name="XLXI_6" orien="R0" />
        <instance x="1136" y="288" name="XLXI_7" orien="R0" />
        <instance x="1136" y="368" name="XLXI_8" orien="R0" />
        <instance x="1136" y="448" name="XLXI_9" orien="R0" />
        <instance x="1136" y="528" name="XLXI_10" orien="R0" />
        <instance x="1136" y="608" name="XLXI_11" orien="R0" />
        <instance x="1136" y="688" name="XLXI_12" orien="R0" />
        <branch name="LED1">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="96" type="branch" />
            <wire x2="1424" y1="96" y2="96" x1="1360" />
            <wire x2="1552" y1="96" y2="96" x1="1424" />
        </branch>
        <bustap x2="816" y1="576" y2="576" x1="720" />
        <branch name="Q(1)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="576" type="branch" />
            <wire x2="976" y1="576" y2="576" x1="816" />
            <wire x2="1136" y1="576" y2="576" x1="976" />
        </branch>
        <bustap x2="816" y1="656" y2="656" x1="720" />
        <branch name="Q(0)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="656" type="branch" />
            <wire x2="976" y1="656" y2="656" x1="816" />
            <wire x2="1136" y1="656" y2="656" x1="976" />
        </branch>
        <bustap x2="816" y1="96" y2="96" x1="720" />
        <branch name="Q(7)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="96" type="branch" />
            <wire x2="976" y1="96" y2="96" x1="816" />
            <wire x2="1136" y1="96" y2="96" x1="976" />
        </branch>
        <bustap x2="816" y1="176" y2="176" x1="720" />
        <branch name="Q(6)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="176" type="branch" />
            <wire x2="976" y1="176" y2="176" x1="816" />
            <wire x2="1136" y1="176" y2="176" x1="976" />
        </branch>
        <bustap x2="816" y1="256" y2="256" x1="720" />
        <branch name="Q(5)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="256" type="branch" />
            <wire x2="976" y1="256" y2="256" x1="816" />
            <wire x2="1136" y1="256" y2="256" x1="976" />
        </branch>
        <bustap x2="816" y1="336" y2="336" x1="720" />
        <branch name="Q(4)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="336" type="branch" />
            <wire x2="976" y1="336" y2="336" x1="816" />
            <wire x2="1136" y1="336" y2="336" x1="976" />
        </branch>
        <bustap x2="816" y1="416" y2="416" x1="720" />
        <branch name="Q(3)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="416" type="branch" />
            <wire x2="976" y1="416" y2="416" x1="816" />
            <wire x2="1136" y1="416" y2="416" x1="976" />
        </branch>
        <bustap x2="816" y1="496" y2="496" x1="720" />
        <branch name="Q(2)">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="976" y="496" type="branch" />
            <wire x2="976" y1="496" y2="496" x1="816" />
            <wire x2="1136" y1="496" y2="496" x1="976" />
        </branch>
        <iomarker fontsize="28" x="1552" y="96" name="LED1" orien="R0" />
        <branch name="LED2">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="176" type="branch" />
            <wire x2="1424" y1="176" y2="176" x1="1360" />
            <wire x2="1552" y1="176" y2="176" x1="1424" />
        </branch>
        <branch name="LED3">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="256" type="branch" />
            <wire x2="1424" y1="256" y2="256" x1="1360" />
            <wire x2="1552" y1="256" y2="256" x1="1424" />
        </branch>
        <branch name="LED4">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="336" type="branch" />
            <wire x2="1424" y1="336" y2="336" x1="1360" />
            <wire x2="1552" y1="336" y2="336" x1="1424" />
        </branch>
        <branch name="LED5">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="416" type="branch" />
            <wire x2="1424" y1="416" y2="416" x1="1360" />
            <wire x2="1552" y1="416" y2="416" x1="1424" />
        </branch>
        <branch name="LED6">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="496" type="branch" />
            <wire x2="1424" y1="496" y2="496" x1="1360" />
            <wire x2="1552" y1="496" y2="496" x1="1424" />
        </branch>
        <branch name="LED7">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="576" type="branch" />
            <wire x2="1424" y1="576" y2="576" x1="1360" />
            <wire x2="1552" y1="576" y2="576" x1="1424" />
        </branch>
        <branch name="LED8">
            <attrtext style="alignment:SOFT-BCENTER;fontsize:28;fontname:Arial" attrname="Name" x="1424" y="656" type="branch" />
            <wire x2="1424" y1="656" y2="656" x1="1360" />
            <wire x2="1552" y1="656" y2="656" x1="1424" />
        </branch>
        <iomarker fontsize="28" x="1552" y="256" name="LED3" orien="R0" />
        <iomarker fontsize="28" x="1552" y="336" name="LED4" orien="R0" />
        <iomarker fontsize="28" x="1552" y="416" name="LED5" orien="R0" />
        <iomarker fontsize="28" x="1552" y="496" name="LED6" orien="R0" />
        <iomarker fontsize="28" x="1552" y="576" name="LED7" orien="R0" />
        <iomarker fontsize="28" x="1552" y="656" name="LED8" orien="R0" />
        <iomarker fontsize="28" x="1552" y="176" name="LED2" orien="R0" />
        <branch name="XLXN_3">
            <wire x2="224" y1="368" y2="448" x1="224" />
        </branch>
        <instance x="160" y="576" name="XLXI_4" orien="R0" />
    </sheet>
</drawing>