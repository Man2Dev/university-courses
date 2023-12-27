SetActiveLib -work
comp -include "$dsn\src\ans1.vhd" 
comp -include "$dsn\src\TestBench\ans1_TB.vhd" 
asim +access +r TESTBENCH_FOR_ans1 
wave 
wave -noreg qin
wave -noreg y1
wave -noreg y2
wave -noreg y3
wave -noreg y4
wave -noreg y5
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\ans1_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_ans1 
