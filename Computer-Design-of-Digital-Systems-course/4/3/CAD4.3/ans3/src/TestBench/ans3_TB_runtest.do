SetActiveLib -work
comp -include "$dsn\src\ans3.vhd" 
comp -include "$dsn\src\TestBench\ans3_TB.vhd" 
asim +access +r TESTBENCH_FOR_ans3 
wave 
wave -noreg clk
wave -noreg a
wave -noreg b
wave -noreg enter_out
wave -noreg exit_out
wave -noreg in_counter
wave -noreg out_counter
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\ans3_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_ans3 
