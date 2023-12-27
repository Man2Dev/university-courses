SetActiveLib -work
comp -include "$dsn\src\counter.vhd" 
comp -include "$dsn\src\top.vhd" 
comp -include "$dsn\src\TestBench\top_TB.vhd" 
asim +access +r TESTBENCH_FOR_top 
wave 
wave -noreg clk
wave -noreg reset
wave -noreg start
wave -noreg data_in
wave -noreg stop
wave -noreg direction
wave -noreg speed
wave -noreg location
wave -noreg y1
wave -noreg y2
wave -noreg y3
wave -noreg flag
wave -noreg finish
wave -noreg wait_out
wave -noreg total_fruit
wave -noreg total_time
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\top_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_top 
