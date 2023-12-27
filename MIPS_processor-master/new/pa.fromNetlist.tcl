
# PlanAhead Launch Script for Post-Synthesis floorplanning, created by Project Navigator

create_project -name new -dir "C:/Users/home/Desktop/MIPS_processor-master/new/planAhead_run_3" -part xc3s1200efg320-5
set_property design_mode GateLvl [get_property srcset [current_run -impl]]
set_property edif_top_file "C:/Users/home/Desktop/MIPS_processor-master/new/pc.ngc" [ get_property srcset [ current_run ] ]
add_files -norecurse { {C:/Users/home/Desktop/MIPS_processor-master/new} }
set_property target_constrs_file "pc.ucf" [current_fileset -constrset]
add_files [list {pc.ucf}] -fileset [get_property constrset [current_run]]
link_design
