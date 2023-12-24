----------------------------------------
#v1

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
----------------------------------------
#v2

#R1
config t
int fa0/0
ip address 192.168.10.1 255.255.255.0
no shut
exit

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

#R2
config t
int fa0/0
ip address 192.168.20.1 255.255.255.0
no shut
exit

#hame router ha ip gerftan
#(IBGP & EBGP)

#R1
router bgp 46520
#Border1 (IBGP)
neighbor 192.168.10.2 remote-as 46520
#Border1 (IBGP)
network 192.168.10.0 mask 255.255.255.0
exit
exit

#Border1
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
----------------------------------------