#!/bin/bash
sudo apt update
sudo apt upgrade
sudo apt-get clean
sudo apt-get autoclean
sudo apt-get autoremove --purge
dpkg -l | grep '^rc' | awk '{print $2}' > config_list.txt
if [ -s config_list.txt ]
then
sudo xargs dpkg --purge < config_list.txt
fi
if [ -f /var/run/reboot-required ]; then
echo '**** reboot required ****'
fi
sudo su -c "echo 3 >'/proc/sys/vm/drop_caches' && swapoff -a && swapon -a && printf '\n%s\n' 'Ram-cache and Swap Cleared'"
