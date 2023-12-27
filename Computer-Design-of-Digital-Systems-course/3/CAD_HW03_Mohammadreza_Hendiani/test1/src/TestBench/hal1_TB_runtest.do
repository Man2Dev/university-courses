SetActiveLib -work
comp -include "$dsn\src\hal1.vhd" 
comp -include "$dsn\src\TestBench\hal1_TB.vhd" 
asim +access +r TESTBENCH_FOR_hal1 
wave 
wave -noreg a
wave -noreg b
wave -noreg c
wave -noreg d
wave -noreg z
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\hal1_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_hal1 
