SetActiveLib -work
comp -include "$dsn\src\hal3.vhd" 
comp -include "$dsn\src\TestBench\hal3_TB.vhd" 
asim +access +r TESTBENCH_FOR_hal3 
wave 
wave -noreg clk
wave -noreg reset
wave -noreg cmd
wave -noreg data_in
wave -noreg data_out
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\hal3_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_hal3 
