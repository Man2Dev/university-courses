<?xml version="1.0" encoding="UTF-8"?>
<drawing version="7">
    <attr value="spartan3" name="DeviceFamilyName">
        <trait delete="all:0" />
        <trait editname="all:0" />
        <trait edittrait="all:0" />
    </attr>
    <netlist>
        <signal name="XLXN_1" />
        <signal name="XLXN_3" />
        <signal name="XLXN_4" />
        <signal name="XLXN_5" />
        <signal name="input_0" />
        <signal name="input_1" />
        <signal name="input_2" />
        <signal name="input_3" />
        <signal name="output_0" />
        <signal name="output_1" />
        <signal name="output_2" />
        <signal name="output_3" />
        <port polarity="Input" name="input_0" />
        <port polarity="Input" name="input_1" />
        <port polarity="Input" name="input_2" />
        <port polarity="Input" name="input_3" />
        <port polarity="Output" name="output_0" />
        <port polarity="Output" name="output_1" />
        <port polarity="Output" name="output_2" />
        <port polarity="Output" name="output_3" />
        <blockdef name="ibuf">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="0" y2="-64" x1="64" />
            <line x2="64" y1="-32" y2="0" x1="128" />
            <line x2="128" y1="-64" y2="-32" x1="64" />
            <line x2="128" y1="-32" y2="-32" x1="224" />
            <line x2="64" y1="-32" y2="-32" x1="0" />
        </blockdef>
        <blockdef name="obuf">
            <timestamp>2000-1-1T10:10:10</timestamp>
            <line x2="64" y1="0" y2="-64" x1="64" />
            <line x2="64" y1="-32" y2="0" x1="128" />
            <line x2="128" y1="-64" y2="-32" x1="64" />
            <line x2="64" y1="-32" y2="-32" x1="0" />
            <line x2="128" y1="-32" y2="-32" x1="224" />
        </blockdef>
        <block symbolname="ibuf" name="XLXI_1">
            <blockpin signalname="input_0" name="I" />
            <blockpin signalname="XLXN_1" name="O" />
        </block>
        <block symbolname="ibuf" name="XLXI_2">
            <blockpin signalname="input_1" name="I" />
            <blockpin signalname="XLXN_3" name="O" />
        </block>
        <block symbolname="ibuf" name="XLXI_3">
            <blockpin signalname="input_2" name="I" />
            <blockpin signalname="XLXN_4" name="O" />
        </block>
        <block symbolname="ibuf" name="XLXI_4">
            <blockpin signalname="input_3" name="I" />
            <blockpin signalname="XLXN_5" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_5">
            <blockpin signalname="XLXN_1" name="I" />
            <blockpin signalname="output_0" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_6">
            <blockpin signalname="XLXN_3" name="I" />
            <blockpin signalname="output_1" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_7">
            <blockpin signalname="XLXN_4" name="I" />
            <blockpin signalname="output_2" name="O" />
        </block>
        <block symbolname="obuf" name="XLXI_8">
            <blockpin signalname="XLXN_5" name="I" />
            <blockpin signalname="output_3" name="O" />
        </block>
    </netlist>
    <sheet sheetnum="1" width="3520" height="2720">
        <instance x="528" y="272" name="XLXI_1" orien="R0" />
        <instance x="528" y="400" name="XLXI_2" orien="R0" />
        <instance x="528" y="512" name="XLXI_3" orien="R0" />
        <instance x="528" y="624" name="XLXI_4" orien="R0" />
        <branch name="XLXN_1">
            <wire x2="944" y1="240" y2="240" x1="752" />
        </branch>
        <branch name="XLXN_3">
            <wire x2="768" y1="368" y2="368" x1="752" />
            <wire x2="944" y1="368" y2="368" x1="768" />
        </branch>
        <branch name="XLXN_4">
            <wire x2="768" y1="480" y2="480" x1="752" />
            <wire x2="944" y1="480" y2="480" x1="768" />
        </branch>
        <branch name="XLXN_5">
            <wire x2="768" y1="592" y2="592" x1="752" />
            <wire x2="944" y1="592" y2="592" x1="768" />
        </branch>
        <instance x="944" y="400" name="XLXI_6" orien="R0" />
        <instance x="944" y="512" name="XLXI_7" orien="R0" />
        <instance x="944" y="624" name="XLXI_8" orien="R0" />
        <instance x="944" y="272" name="XLXI_5" orien="R0" />
        <branch name="input_0">
            <wire x2="528" y1="240" y2="240" x1="496" />
        </branch>
        <iomarker fontsize="28" x="496" y="240" name="input_0" orien="R180" />
        <branch name="input_1">
            <wire x2="528" y1="368" y2="368" x1="496" />
        </branch>
        <iomarker fontsize="28" x="496" y="368" name="input_1" orien="R180" />
        <branch name="input_2">
            <wire x2="528" y1="480" y2="480" x1="496" />
        </branch>
        <iomarker fontsize="28" x="496" y="480" name="input_2" orien="R180" />
        <branch name="input_3">
            <wire x2="528" y1="592" y2="592" x1="496" />
        </branch>
        <iomarker fontsize="28" x="496" y="592" name="input_3" orien="R180" />
        <branch name="output_0">
            <wire x2="1200" y1="240" y2="240" x1="1168" />
        </branch>
        <iomarker fontsize="28" x="1200" y="240" name="output_0" orien="R0" />
        <branch name="output_1">
            <wire x2="1200" y1="368" y2="368" x1="1168" />
        </branch>
        <iomarker fontsize="28" x="1200" y="368" name="output_1" orien="R0" />
        <branch name="output_2">
            <wire x2="1200" y1="480" y2="480" x1="1168" />
        </branch>
        <iomarker fontsize="28" x="1200" y="480" name="output_2" orien="R0" />
        <branch name="output_3">
            <wire x2="1200" y1="592" y2="592" x1="1168" />
        </branch>
        <iomarker fontsize="28" x="1200" y="592" name="output_3" orien="R0" />
    </sheet>
</drawing>