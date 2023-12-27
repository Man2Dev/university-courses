SetActiveLib -work
comp -include "$dsn\src\ans2.vhd" 
comp -include "$dsn\src\TestBench\ans2_TB.vhd" 
asim +access +r TESTBENCH_FOR_ans2 
wave 
wave -noreg clk
wave -noreg reset
wave -noreg x
wave -noreg o
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\ans2_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_ans2 
