#R1
sh ip int br
configure terminal
interface fastEthernet 0/0
ip address 192.168.10.1 255.255.255.0
no shut
exit
sh ip int br

#Border1
sh ip int br
configure terminal
interface fastEthernet 1/0
ip address 192.168.10.2 255.255.255.0
no shut
exit
interface fastEthernet 0/0
ip address 192.168.30.1 255.255.255.0
no shut
exit
sh ip int br

#Border2
sh ip int br
configure terminal
interface fastEthernet 0/0
ip address 192.168.30.2 255.255.255.0
no shut
exit
interface fastEthernet 1/0
ip address 192.168.20.2 255.255.255.0
no shut
exit
sh ip int br

#R2
sh ip int br
configure terminal
interface fastEthernet 0/0
ip address 192.168.20.1 255.255.255.0
no shut
exit
sh ip int br

//hame router ha ip gerftan

#R1
router bgp 46520
neighbor 192.168.10.2 remote-as 46520
network 192.168.10.0 mask 255.255.255.0
exit

#Border1
router bgp 46520
neighbor 192.168.10.1 remote-as 46520
neighbor 192.168.30.2 remote-as 46530
network 192.168.10.0 mask 255.255.255.0
network 192.168.30.0 mask 255.255.255.0
exit
exit

#Border2
router bgp 46530
neighbor 192.168.30.1 remote-as 46520
neighbor 192.168.20.1 remote-as 46530
network 192.168.30.0 mask 255.255.255.0
network 192.168.20.0 mask 255.255.255.0
exit
exit

#R1
router bgp 46530
neighbor 192.168.20.2 remote-as 46530
network 192.168.10.0 mask 255.255.255.0
exit
exit
sh ip bgp
sh ip bgp summary

#Border1
sh ip bgp
sh ip route bgp

#Border2
sh ip bgp
sh ip route bgp


#R1
ping 192.168.10.2
ping 192.168.30.1
ping 192.168.20.2
ping 192.168.20.1



#Border1
ping 192.168.10.1
ping 192.168.30.2
ping 192.168.20.2
ping 192.168.20.1


#Border2
ping 192.168.10.1
ping 192.168.10.2
ping 192.168.30.1
ping 192.168.30.2
ping 192.168.20.1

#R2
ping 192.168.10.1
ping 192.168.10.2
ping 192.168.30.1
ping 192.168.30.2
ping 192.168.20.1
ping 192.168.20.2