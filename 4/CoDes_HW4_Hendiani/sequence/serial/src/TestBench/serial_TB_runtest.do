SetActiveLib -work
comp -include "$dsn\src\serial.vhd" 
comp -include "$dsn\src\TestBench\serial_TB.vhd" 
asim +access +r TESTBENCH_FOR_serial 
wave 
wave -noreg D
wave -noreg reset
wave -noreg clock
wave -noreg Q
# The following lines can be used for timing simulation
# acom <backannotated_vhdl_file_name>
# comp -include "$dsn\src\TestBench\serial_TB_tim_cfg.vhd" 
# asim +access +r TIMING_FOR_serial 
