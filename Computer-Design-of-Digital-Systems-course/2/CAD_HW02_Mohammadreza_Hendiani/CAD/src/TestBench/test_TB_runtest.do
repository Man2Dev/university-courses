SetActiveLib -work
comp -include "$dsn\src\test.vhd" 
comp -include "$dsn\src\TestBench\test_TB.vhd" 
asim +access +r TESTBENCH_FOR_test 
wave 
wave -noreg r
wave -noreg code
wave -noreg act
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\test_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_test 
