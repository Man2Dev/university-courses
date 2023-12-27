#############################################################
# vsimsa environment configuration
set dsn $curdir
log $dsn/log/vsimsa.log
@echo
@echo #################### Starting C Code Debug Session ######################
cd $dsn/src
amap CAD3 $dsn/CAD3/CAD3.lib
set worklib CAD3
# simulation
asim -callbacks -O5 +access +r +m+top top top
run -all
#############################################################