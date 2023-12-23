SetActiveLib -work
comp -include "$dsn\src\prob4.vhd" 
comp -include "$dsn\src\TestBench\prob4_TB.vhd" 
asim +access +r TESTBENCH_FOR_prob4 
wave 
wave -noreg clk
wave -noreg reset
wave -noreg push
wave -noreg pop
wave -noreg data_in
wave -noreg stack_full
wave -noreg stack_empty
wave -noreg data_out
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\prob4_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_prob4 
