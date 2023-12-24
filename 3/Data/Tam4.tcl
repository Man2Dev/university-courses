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

#hame router ha ip gerftan

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

----------------------------------------

#R1
sh ip int br
config t
int fa0/0
ip add 192.168.10.1 255.255.255.0
no shut
exit
exit
sh ip int br

#Border1
sh ip int br
configure terminal
interface fastEthernet 0/0
ip address 192.168.10.2 255.255.255.0
no shut
exit
interface fastEthernet 1/0
ip address 192.168.30.1 255.255.255.0
no shut
exit
exit
sh ip int br

#Border2
sh ip int br
config t
interface fastEthernet 0/0
ip address 192.168.30.2 255.255.255.0
no shut
exit
interface fastEthernet 1/0
ip address 192.168.20.2 255.255.255.0
no shut
exit
exit
sh ip int br

#R2
sh ip int br
config t
interface fastEthernet 0/0
ip address 192.168.20.1 255.255.255.0
no shut
exit
exit
sh ip int br

#hame router ha ip gerftan

#R1
config t
router bgp 46520
network 192.168.10.0 mask 255.255.255.0
neighbor 192.168.10.2 remote-as 46520
exit
exit

#Border1
config t
router bgp 46520
network 192.168.10.0 mask 255.255.255.0
network 192.168.30.0 mask 255.255.255.0
neighbor 192.168.10.1 remote-as 46520
neighbor 192.168.10.1 remote-as 46520
neighbor 192.168.30.2 remote-as 46530
exit
exit

#Border2
config t
router bgp 46530
network 192.168.30.0 mask 255.255.255.0
network 192.168.20.0 mask 255.255.255.0
neighbor 192.168.30.1 remote-as 46520
neighbor 192.168.20.2 remote-as 46520
neighbor 192.168.20.1 remote-as 46530
exit
exit

#R2
config t
router bgp 46530
network 192.168.20.0 mask 255.255.255.0
neighbor 192.168.20.2 remote-as 46530
exit
exit
//sh ip bgp
//sh ip bgp summary

#Border1
//sh ip bgp
//sh ip route bgp

#Border2
//sh ip bgp
//sh ip route bgp

#R1
#to R2
ping 192.168.20.1
#to Border2
ping 192.168.20.2
#to Border1
ping 192.168.30.1
//ping 192.168.10.2

#R2
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.30.1
//ping 192.168.10.2
//ping 192.168.30.2
//ping 192.168.20.1
//ping 192.168.20.2

#Border2
#to R1
ping 192.168.10.1
//ping 192.168.10.2
//ping 192.168.30.1
//ping 192.168.30.2
//ping 192.168.20.1

#Border1
#to R1
ping 192.168.20.1
//ping 192.168.10.1
//ping 192.168.30.2
//ping 192.168.20.2

----------------------------------------

#R1
config t
int fa0/0
ip add 192.168.10.1 255.255.255.0
no shut
exit
exit

#Border1
config t
int fa0/0
ip add 192.168.10.2 255.255.255.0
no shut
exit
int fa0/1
ip address 192.168.30.1 255.255.255.0
no shut
exit
exit

#Border2
config t
int fa0/1
ip add 192.168.30.2 255.255.255.0
no shut
exit
int fa0/0
ip address 192.168.20.2 255.255.255.0
no shut
exit
exit

#R2
config t
int fa0/0
ip add 192.168.20.1 255.255.255.0
no shut
exit
exit

#hame router ha ip gerftan
#(IBGP & EBGP)

#R1
config t
router bgp 46520
#Border1 (IBGP)
neighbor 192.168.10.2 remote-as 46520
#Border1 (IBGP)
network 192.168.10.0 mask 255.255.255.0
exit
exit

#Border1
config t
router bgp 46520
#Border2 (EBGP)
neighbor 192.168.30.2 remote-as 46530
#R1 (IBGP)
neighbor 192.168.10.1 remote-as 46520
#Network
network 192.168.10.0 mask 255.255.255.0
network 192.168.30.0 mask 255.255.255.0
#Self
network 192.168.10.1 next-hop-self
exit
exit

#Border2
config t
router bgp 46530
#Border1 (EBGP)
neighbor 192.168.30.1 remote-as 46520
#R1 (IBGP)
neighbor 192.168.20.1 remote-as 46530
#Network
network 192.168.20.0 mask 255.255.255.0
network 192.168.30.0 mask 255.255.255.0
#Self
neighbor 192.168.20.1 next-hop-self
//neighbor 192.168.20.1 remote-as 46530
exit
exit

#R2
config t
router bgp 46530
#Border2 (IBGP)
neighbor 192.168.20.2 remote-as 46530
#Network
network 192.168.20.0 mask 255.255.255.0
exit
exit

#Ping

#R1
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2


#R2
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2

#Border2
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2

#Border1
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2

#BGP

sh ip bgp
sh ip bgp summary

#Border1
sh ip bgp
sh ip route bgp

#Border2
sh ip bgp
sh ip route bgp

----------------------------------------
----------------------------------------

#R1
config t
int fa0/0
ip address 192.168.10.1 255.255.255.0
no shut
exit
exit
sh ip int br

#Border1
config t
int fa0/0
ip address 192.168.10.2 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.30.1 255.255.255.0
no shut
exit
exit
sh ip int br

#Border2
config t
int fa1/0
ip address 192.168.30.2 255.255.255.0
no shut
exit
int fa0/0
ip address 192.168.20.2 255.255.255.0
no shut
exit
exit
sh ip int br

#R2
config t
int fa0/0
ip address 192.168.20.1 255.255.255.0
no shut
exit
exit
sh ip int br

#hame router ha ip gerftan
#(IBGP & EBGP)

#R1
config t
router bgp 46520
#Border1 (IBGP)
neighbor 192.168.10.2 remote-as 46520
#Border1 (IBGP)
network 192.168.10.0 mask 255.255.255.0
exit
exit

#Border1
config t
router bgp 46520
#Border2 (EBGP)
neighbor 192.168.30.2 remote-as 46530
#R1 (IBGP)
neighbor 192.168.10.1 remote-as 46520
#Network
network 192.168.10.0 mask 255.255.255.0
network 192.168.30.0 mask 255.255.255.0
#Self
network 192.168.10.1 next-hop-self
exit
exit

#Border2
config t
router bgp 46530
#Border1 (EBGP)
neighbor 192.168.30.1 remote-as 46520
#R1 (IBGP)
neighbor 192.168.20.1 remote-as 46530
#Network
network 192.168.20.0 mask 255.255.255.0
network 192.168.30.0 mask 255.255.255.0
#Self
neighbor 192.168.20.1 next-hop-self
exit
exit

#R2
config t
router bgp 46530
#Border2 (IBGP)
neighbor 192.168.20.2 remote-as 46530
#Network
network 192.168.20.0 mask 255.255.255.0
exit
exit

#Ping

#R1
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2


#R2
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2

#Border2
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2

#Border1
#to R1
ping 192.168.10.1
#to Border1
ping 192.168.10.2
#to Border1
ping 192.168.30.1
#to Border2
ping 192.168.30.2
#to Border2
ping 192.168.20.1
#to R2
ping 192.168.20.2

#BGP
sh ip bgp
sh ip bgp summary

#Border1
sh ip bgp
sh ip route bgp

#Border2
sh ip bgp
sh ip route bgp

----------------------------------------

#Maria
config t
int fa0/0
ip address 192.168.12.1 255.255.255.0
no shut
exit
exit
sh ip int br

#Jim
config t
int fa0/0
ip address 192.168.12.2 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.23.2 255.255.255.0
no shut
exit
int fa2/0
ip address 192.168.24.2 255.255.255.0
no shut
exit
exit
sh ip int br

#Jack
config t
int fa0/0
ip address 192.168.23.3 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.35.3 255.255.255.0
no shut
exit
exit
sh ip int br

#John
config t
int fa0/0
ip address 192.168.35.5 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.45.5 255.255.255.0
no shut
exit
int fa2/0
ip address 192.168.56.5 255.255.255.0
no shut
exit
exit
sh ip int br

#James
config t
int fa0/0
ip address 192.168.24.4 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.45.4 255.255.255.0
no shut
exit
exit
sh ip int br

#Emma
config t
int fa0/0
ip address 192.168.56.6 255.255.255.0
no shut
exit
ip address 6.6.6.6 255.255.255.0
exit
sh ip int br

#hame router ha ip gerftan

#Maria (EBGP)
#Jim
router bgp 1
neighbor 192.168.12.2 remote-as 2

#Jim
router bgp 2
neighbor 192.168.12.1 remote-as 1

#John
router bgp 2
neighbor 192.168.56.6 remote-as 3

#Emma
router bgp 3
neighbor 192.168.56.5 remote-as 2
#LoppBack
router bgp 3
network 6.6.6.0 mask 255.255.255.0

#John
exit
exit
sh ip bgp summary

#OSPF

#Jim
router ospf 1
network 192.168.24.0.0.0.0.255 area 0
network 192.168.23.0.0.0.0.255 area 0

#James
config t
router ospf 1
network 192.168.24.0.0.0.0.255 area 0
network 192.168.45.0.0.0.0.255 area 0

#Jack
config t
router ospf 1
network 192.168.23.0.0.0.0.255 area 0
network 192.168.35.0.0.0.0.255 area 0

#John
config t
router ospf 1
network 192.168.35.0.0.0.0.255 area 0
network 192.168.45.0.0.0.0.255 area 0
exit
exit

#Ping

#John
#to Jim
ping 102.168.24.2
#to Jim
ping 102.168.23.2

#John
int loopback 0
ip address 5.5.5.5 255.255.255.0
router ospf 1
network 5.5.5.5 0.0.0.0.255 area 0

#Jim
int loopback 0
ip address 2.2.2.2 255.255.255.0
router ospf 1
network 2.2.2.2 0.0.0.0.255 area 0

#Jim
route bgp 2
neighbor 5.5.5.5 remote-as 2
exit
exit

#John
route bgp 2
neighbor 2.2.2.2 remote-as 2
exit
exit
sh ip bgp summary

#Jim
sh ip bgp summary
config t
router bgp 2
neighbor 5.5.5.5 update-source loopback 0
exit
exit

#John
config t
router bgp 2
neighbor 2.2.2.2 update-source loopback 0
exit
exit
sh ip bgp summary

#Jim
sh ip bgp
sh ip bgp | include 6.6.6.6

#John
sh ip bgp | include 6.6.6.6

#Jim
sh ip route bgp

#John
sh ip route bgp

#Jim
sh ip bgp
sh ip route | include 192.168.56

#John
config t
router bgp 2
network 192.168.56.0 mask 255.255.255.0

#Jim
config t
router bgp 2
network 192.168.12.0 mask 255.255.255.0
exit
exit
sh ip bgp

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
#EBGP

#Jim
exit
sh ip bgp summary

#John
exit
sh ip bgp summary

#Jim
sh ip bgp
sh ip bgp | include 6.6.6.6

#John
sh ip bgp | include 6.6.6.6

#Jim
sh ip route bgp

#John
sh ip route bgp
config t

#Jim
sh ip bgp
sh ip route | include 192.168.56
config t
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


#Maria
exit
exit
sh ip bgp
sh ip route bgp
ping 6.6.6.6
traceroute 6.6.6.6

#Jim
sh ip route | include 6.6.6.0
sh ip route | include 196.168.56.0
sh ip route 5.5.5.5

#James
exit
exit
sh ip route | include 6.6.6.0

#Jack
exit
exit
sh ip route | include 6.6.6.0

#James
config t
int loopback 0
ip address 4.4.4.4 255.255.255.0
router ospf 1
network 4.4.4.4 0.0.0.0255 area 0
router bgp 2
neighbor 2.2.2.2 remote-as 2
neighbor 2.2.2.2  update-source loopback 0

#Jim
config t
router bgp 2
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 0

#Jack
config t
int loopback 0
ip address 3.3.3.3 255.255.255.0
router ospf 1
network 3.3.3.3 0.0.0.0255 area 0
router bgp 2
neighbor 2.2.2.2 remote-as 2
neighbor 2.2.2.2  update-source loopback 0

#Jim
config t
router bgp 2
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3  update-source loopback 0

#James
exit
exit
sh ip bgp

#Jack
exit
exit
sh ip bgp

#John
config t
router bgp 2
network 192.168.56.0 mask 255.255.255.0
router bgp 2
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 0
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 0

#James
config t
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 0
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 0
exit
exit

#Jack
config t
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 0
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 0
exit
exit


$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
#James
exit
sh ip bgp
config t

#Jack
exit
sh ip bgp
config t

#Maria
exit
ping 6.6.6.6 
config t
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

#John
router bgp 2
no network 192.168.56.0
router bgp 2
neighbor 4.4.4.4 next-hop-self

#Jack
sh ip route bgp | include 6.6.6.0

#Jim




































































































------------------------------------------
******************************************
#IP

#Maria
config t
int fa0/0
ip address 192.168.12.1 255.255.255.0
no shut
exit

#Jim
config t
int fa0/0
ip address 192.168.12.2 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.23.2 255.255.255.0
no shut
exit
int fa2/0
ip address 192.168.24.2 255.255.255.0
no shut
exit

#Jack
config t
int fa0/0
ip address 192.168.23.3 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.35.3 255.255.255.0
no shut
exit

#John
config t
int fa0/0
ip address 192.168.35.5 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.45.5 255.255.255.0
no shut
exit
int fa2/0
ip address 192.168.56.5 255.255.255.0
no shut
exit

#James
config t
int fa0/0
ip address 192.168.24.4 255.255.255.0
no shut
exit
int fa1/0
ip address 192.168.45.4 255.255.255.0
no shut
exit

#Emma
config t
int fa0/0
ip address 192.168.56.6 255.255.255.0
no shut
exit
int loopback 0
ip address 6.6.6.6 255.255.255.0
exit

#copy run start
******************************************
#EBGP AS1 & AS2 & AS3

#Maria
router bgp 1
neighbor 192.168.12.2 remote-as 2
exit

#Jim
router bgp 2
neighbor 192.168.12.1 remote-as 1
exit

#John
router bgp 2
neighbor 192.168.56.6 remote-as 3
exit

#Emma
router bgp 3
neighbor 192.168.56.5 remote-as 2
network 6.6.6.0 mask 255.255.255.0
exit

$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
#John
exit
sh ip bgp
config t
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
******************************************
#OSPF

#Jim
router ospf 1
network 192.168.23.0 0.0.0.255 area 0
network 192.168.24.0 0.0.0.255 area 0
exit

#Jack
router ospf 1
network 192.168.23.0 0.0.0.255 area 0
network 192.168.35.0 0.0.0.255 area 0
exit

#James
router ospf 1
network 192.168.24.0 0.0.0.255 area 0
network 192.168.45.0 0.0.0.255 area 0
exit

#John
router ospf 1
network 192.168.35.0 0.0.0.255 area 0
network 192.168.45.0 0.0.0.255 area 0
exit

$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
#Ping John to Jim

#John
exit
ping 192.168.23.2
ping 192.168.24.2
config t
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
******************************************
#BGP Jim & John

#LB
#Jim
int loopback 1
ip address 2.2.2.2 255.255.255.0
router ospf 1
network 2.2.2.2 0.0.0.0.255 area 0
exit

#John
int loopback 1
ip address 5.5.5.5 255.255.255.0
router ospf 1
network 5.5.5.5 0.0.0.0.255 area 0
exit

#EBGP
#Jim
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 1
network 192.168.12.0 mask 255.255.255.0
exit

#John
router bgp 2
neighbor 2.2.2.2 remote-as 2
neighbor 2.2.2.2 update-source loopback 1
network 192.168.56.0 mask 255.255.255.0
exit

$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
#EBGP

#Jim
exit
sh bgp summary
config t
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
******************************************
#BGP Slit-Horizen

#James
router bgp 2
int loopback 0
ip address 4.4.4.4 255.255.255.0
router ospf 1
network 4.4.4.4 0.0.0.0255 area 0
router bgp 2
neighbor 2.2.2.2 remote-as 2
neighbor 2.2.2.2 update-source loopback 1
exit

#Jim
router bgp 2
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 1
exit

#Jack
router bgp 2
int loopback 0
ip address 3.3.3.3 255.255.255.0
router ospf 1
network 3.3.3.3 0.0.0.0255 area 0
router bgp 2
neighbor 2.2.2.2 remote-as 2
neighbor 2.2.2.2 update-source loopback 1
exit

#Jim
router bgp 2
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 1
exit

$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
#James
exit
sh ip bgp
config t

#Jack
exit
sh ip bgp
config t
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
******************************************
#Full-Mesh

#John
router bgp 2
network 192.168.56.0 mask 255.255.255.0
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 1
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 1
exit

#James
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 1
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 1
exit

#Jack
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 1
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 1
exit

#John
router bgp 2
no network 192.168.56.0
neighbor 4.4.4.4 next-hop-self
neighbor 3.3.3.3 next-hop-self
exit

$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
#Maria
exit
ping 6.6.6.6 
config t

#Jack
exit
sh ip bgp
sh ip route bgp | include 6.6.6.0
config t

#James
exit
sh ip bgp
sh ip route bgp | include 6.6.6.0
config t
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
******************************************
#OSPF

#Jim
router ospf 1
network 192.168.12.0 0.0.0.255 area 0
exit
exit

#Maria
router ospf 1
network 192.168.12.0 0.0.0.255 area 0
exit
exit

#Emma
router ospf 1
network 192.168.56.0 0.0.0.255 area 0
exit
exit

#John
router ospf 1
network 192.168.56.0 0.0.0.255 area 0
exit
exit

#copy run start
******************************************
#Ping

#Maria
ping 192.168.12.1
ping 192.168.12.2
ping 192.168.23.2
ping 192.168.23.3
ping 192.168.24.2
ping 192.168.24.4
ping 192.168.35.3
ping 192.168.35.5
ping 192.168.45.4
ping 192.168.45.5
ping 192.168.56.5
ping 192.168.56.6
ping 2.2.2.2
ping 3.3.3.3
ping 4.4.4.4
ping 5.5.5.5
ping 6.6.6.6

#Jim
ping 192.168.12.1
ping 192.168.12.2
ping 192.168.23.2
ping 192.168.23.3
ping 192.168.24.2
ping 192.168.24.4
ping 192.168.35.3
ping 192.168.35.5
ping 192.168.45.4
ping 192.168.45.5
ping 192.168.56.5
ping 192.168.56.6
ping 2.2.2.2
ping 3.3.3.3
ping 4.4.4.4
ping 5.5.5.5
ping 6.6.6.6

#Jack
ping 192.168.12.1
ping 192.168.12.2
ping 192.168.23.2
ping 192.168.23.3
ping 192.168.24.2
ping 192.168.24.4
ping 192.168.35.3
ping 192.168.35.5
ping 192.168.45.4
ping 192.168.45.5
ping 192.168.56.5
ping 192.168.56.6
ping 2.2.2.2
ping 3.3.3.3
ping 4.4.4.4
ping 5.5.5.5
ping 6.6.6.6

#John
ping 192.168.12.1
ping 192.168.12.2
ping 192.168.23.2
ping 192.168.23.3
ping 192.168.24.2
ping 192.168.24.4
ping 192.168.35.3
ping 192.168.35.5
ping 192.168.45.4
ping 192.168.45.5
ping 192.168.56.5
ping 192.168.56.6
ping 2.2.2.2
ping 3.3.3.3
ping 4.4.4.4
ping 5.5.5.5
ping 6.6.6.6

#James
ping 192.168.12.1
ping 192.168.12.2
ping 192.168.23.2
ping 192.168.23.3
ping 192.168.24.2
ping 192.168.24.4
ping 192.168.35.3
ping 192.168.35.5
ping 192.168.45.4
ping 192.168.45.5
ping 192.168.56.5
ping 192.168.56.6
ping 2.2.2.2
ping 3.3.3.3
ping 4.4.4.4
ping 5.5.5.5
ping 6.6.6.6

#Emma
ping 192.168.12.1
ping 192.168.12.2
ping 192.168.23.2
ping 192.168.23.3
ping 192.168.24.2
ping 192.168.24.4
ping 192.168.35.3
ping 192.168.35.5
ping 192.168.45.4
ping 192.168.45.5
ping 192.168.56.5
ping 192.168.56.6
ping 2.2.2.2
ping 3.3.3.3
ping 4.4.4.4
ping 5.5.5.5
ping 6.6.6.6

-----------------------------------------




























































































