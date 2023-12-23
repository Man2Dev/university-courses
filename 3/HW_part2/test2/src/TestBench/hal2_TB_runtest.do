SetActiveLib -work
comp -include "$dsn\src\hal2.vhd" 
comp -include "$dsn\src\TestBench\hal2_TB.vhd" 
asim +access +r TESTBENCH_FOR_hal2 
wave 
wave -noreg clk
wave -noreg reset
wave -noreg control_signal
wave -noreg r2_in
wave -noreg r1_out
wave -noreg r2_out
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\hal2_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_hal2 
