#!/bin/sh

# documentation from:
# https://docs.github.com/en/get-started/using-git/about-git-subtree-merges

# Advanced-Programming-course
# https://github.com/Man2Dev/Advanced-Programming-course

# Algorithms-Design-course
# https://github.com/Man2Dev/Algorithms-Design-course

# Computer-Architecture-course
# https://github.com/Man2Dev/Computer-Architecture-course

# Computer-Design-of-Digital-Systems-course
# https://github.com/Man2Dev/Computer-Design-of-Digital-Systems-course

# Computer-Networks-course
# https://github.com/Man2Dev/Computer-Networks-course

# Computer-Networks-Lab-course
# https://github.com/Man2Dev/Computer-Networks-Lab-course

# Database-course
# https://github.com/Man2Dev/Database-course

# Data-Structure-course
# https://github.com/Man2Dev/Data-Structure-course

# Electric-Circuits-course
# https://github.com/Man2Dev/Electric-Circuits-course

# Embedded-and-Real-time-Systems-course
# https://github.com/Man2Dev/Embedded-and-Real-time-Systems-course

# Hardware-Software-Codesign-course
# https://github.com/Man2Dev/Hardware-Software-Codesign-course

# Logic-Circuits-and-Computer-Architecture-Lab-course
# https://github.com/Man2Dev/Logic-Circuits-and-Computer-Architecture-Lab-course

# Microprocessor-and-Assembly-Language-course
# https://github.com/Man2Dev/Microprocessor-and-Assembly-Language-course

# Microprocessor-Lab-course
# https://github.com/Man2Dev/Microprocessor-Lab-course

# Systems-Analysis-and-Design-course
# https://github.com/Man2Dev/Systems-Analysis-and-Design-course

# Basics-of-Computer-and-Programming-course
# https://github.com/Man2Dev/Basics-of-Computer-and-Programming-course

#for repo in Advanced-Programming-course Algorithms-Design-course Computer-Architecture-course Computer-Design-of-Digital-Systems-course Computer-Networks-course Computer-Networks-Lab-course Database-course Data-Structure-course Electric-Circuits-course Embedded-and-Real-time-Systems-course Hardware-Software-Codesign-course Logic-Circuits-and-Computer-Architecture-Lab-course Microprocessor-and-Assembly-Language-course Microprocessor-Lab-course Systems-Analysis-and-Design-course Basics-of-Computer-and-Programming-course; do
#	mkdir -p $repo
#	git remote add -f $repo git@github.com:man2dev/$repo.git
#	git merge -s ours --no-commit --allow-unrelated-histories $repo/master
#	git read-tree --prefix=$repo/ -u $repo/master
#	git commit -m "Subtree merged"
#done

sync
for repo in Advanced-Programming-course Algorithms-Design-course Computer-Architecture-course Computer-Design-of-Digital-Systems-course Computer-Networks-course Computer-Networks-Lab-course Database-course Data-Structure-course Electric-Circuits-course Embedded-and-Real-time-Systems-course Hardware-Software-Codesign-course Logic-Circuits-and-Computer-Architecture-Lab-course Microprocessor-and-Assembly-Language-course Microprocessor-Lab-course Systems-Analysis-and-Design-course Basics-of-Computer-and-Programming-course; do
	mkdir -p $repo
	git pull -s --ff-only subtree $repo master
done
