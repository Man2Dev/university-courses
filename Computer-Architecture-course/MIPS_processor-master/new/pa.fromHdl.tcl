
# PlanAhead Launch Script for Pre-Synthesis Floorplanning, created by Project Navigator

create_project -name new -dir "C:/Users/home/Desktop/MIPS_processor-master/new/planAhead_run_2" -part xc3s1200efg320-5
set_param project.pinAheadLayout yes
set srcset [get_property srcset [current_run -impl]]
set_property target_constrs_file "pc.ucf" [current_fileset -constrset]
set hdlfile [add_files [list {../../tempp/programcounter.vhd}]]
set_property file_type VHDL $hdlfile
set_property library work $hdlfile
set_property top pc $srcset
add_files [list {pc.ucf}] -fileset [get_property constrset [current_run]]
open_rtl_design -part xc3s1200efg320-5
