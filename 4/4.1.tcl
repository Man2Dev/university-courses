
#IP config

#R1
config t
int f0/0
ip address 192.168.1.1 255.255.255.0
no shut
exit
int f1/0
ip address 192.168.2.1 255.255.255.0
no shut
exit
exit
sh ip int br

#R2
config t
int f0/0
ip address 192.168.3.1 255.255.255.0
no shut
exit
int f1/0
ip address 192.168.2.2 255.255.255.0
no shut
exit
exit
sh ip int br

******************************************
#OSPF

#R1
config t
router ospf 1
network 192.168.1.0 0.0.0.255 area 0
network 192.168.2.0 0.0.0.255 area 0
exit
exit

#R2
config t
router ospf 1
network 192.168.2.0 0.0.0.255 area 0
network 192.168.3.0 0.0.0.255 area 0
exit
exit

******************************************
#IP Pool

#R1 (DHCP server)
config t
ip dhcp pool pool0
network 192.168.1.0 255.255.255.0
lease 5
default-router 192.168.1.1
dns-server 1.1.1.1
ip dhcp excluded-address 192.168.1.1

ip dhcp pool pool1
network 192.168.3.0 255.255.255.0
lease 5
default-router 192.168.3.1
dns-server 1.1.1.1
ip dhcp excluded-address 192.168.3.1
exit

#R2 (Relay Agent)
config t
int f0/0
ip helper-address 192.168.2.1
exit
exit

******************************************
#Ip to PCs

#PC1
sh ip
dhcp
sh ip dhcp binding


#PC2
sh ip
dhcp

******************************************





























