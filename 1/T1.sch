<?xml version="1.0" encoding="UTF-8"?>
<drawing version="7">
    <attr value="spartan3" name="DeviceFamilyName">
        <trait delete="all:0" />
        <trait editname="all:0" />
        <trait edittrait="all:0" />
    </attr>
    <netlist>
        <signal name="XLXN_1" />
        <signal name="input_0" />
        <signal name="output_0" />
        <port polarity="Input" name="input_0" />
        <port polarity="Output" name="output_0" />
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
        <block symbolname="obuf" name="XLXI_2">
            <blockpin signalname="XLXN_1" name="I" />
            <blockpin signalname="output_0" name="O" />
        </block>
    </netlist>
    <sheet sheetnum="1" width="3520" height="2720">
        <instance x="640" y="496" name="XLXI_1" orien="R0" />
        <instance x="1168" y="496" name="XLXI_2" orien="R0" />
        <branch name="XLXN_1">
            <wire x2="1168" y1="464" y2="464" x1="864" />
        </branch>
        <branch name="input_0">
            <wire x2="640" y1="464" y2="464" x1="608" />
        </branch>
        <iomarker fontsize="28" x="608" y="464" name="input_0" orien="R180" />
        <branch name="output_0">
            <wire x2="1424" y1="464" y2="464" x1="1392" />
        </branch>
        <iomarker fontsize="28" x="1424" y="464" name="output_0" orien="R0" />
    </sheet>
</drawing>