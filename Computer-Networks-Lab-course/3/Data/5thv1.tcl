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
int loopback 0
ip address 2.2.2.2 255.255.255.0
router ospf 1
network 2.2.2.2 0.0.0.0.255 area 0
exit

#John
int loopback 0
ip address 5.5.5.5 255.255.255.0
router ospf 1
network 5.5.5.5 0.0.0.0.255 area 0
exit

#EBGP
#Jim
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 0
network 192.168.12.0 mask 255.255.255.0
exit

#John
router bgp 2
neighbor 2.2.2.2 remote-as 2
neighbor 2.2.2.2 update-source loopback 0
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
neighbor 2.2.2.2 update-source loopback 0
exit

#Jim
router bgp 2
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 0
exit

#Jack
router bgp 2
int loopback 0
ip address 3.3.3.3 255.255.255.0
router ospf 1
network 3.3.3.3 0.0.0.0255 area 0
router bgp 2
neighbor 2.2.2.2 remote-as 2
neighbor 2.2.2.2 update-source loopback 0
exit

#Jim
router bgp 2
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 0
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
neighbor 4.4.4.4 update-source loopback 0
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 0
exit

#James
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 0
neighbor 3.3.3.3 remote-as 2
neighbor 3.3.3.3 update-source loopback 0
exit

#Jack
router bgp 2
neighbor 5.5.5.5 remote-as 2
neighbor 5.5.5.5 update-source loopback 0
neighbor 4.4.4.4 remote-as 2
neighbor 4.4.4.4 update-source loopback 0
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