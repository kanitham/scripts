# To install linux flavor
sudo sh crouton -r xenial -t xfce,extension,xorg,xiwi

#sudo sh ~/Downloads/crouton -e -r -t touch,unity-desktop,xiwi
#sudo sh -e crouton -r bionic -t touch,xfce,extension,xorg,xiwi -p /media/removable/Bionic
#sudo sh -e crouton -r unity -t touch,unity-desktop,xorg,xiwi -p /media/removable/Bionic
#sudo sh -e crouton -r Bionic -t touch,xfce-desktop,xorg,xiwi -p /media/removable/Bionic
#sudo sh /media/removable/Bionic/bin/startxfce4

# To install git ( and open ssh )
sudo apt-get install git
#https://git-scm.com/book/en/v2/Customizing-Git-Git-Configuration
# To fix the missing packages
sudo apt-get install --fix-broken
# To install C++ along with build essential
sudo apt-get install idle-python3.7
#To install add-apt-repository
sudo apt-get install software-properties-common
# To install atom
sudo add-apt-repository ppa:webupd8team/atom
sudo apt-get install atom
# To install java8
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
sudo apt-get install oracle-java8-set-default
# To install vscode:
sudo add-apt-repository -y "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main"
sudo apt-key adv --keyserver keyserver.ubuntu.com --recv-keys EB3E94ADBE1229CF
sudo apt update
sudo apt -y install code
# To install C++ 
sudo apt install g++
sudo apt install build-essential

#How do I install XAMPP?
#Choose your flavor for your linux OS, the 32-bit or 64-bit version.
#Change the permissions to the installer
#chmod 755 xampp-linux-*-installer.run
#Run the installer
#sudo ./xampp-linux-*-installer.run
#XAMPP is now installed below the /opt/lampp directory.

#To take backup of current chroot into harddisc
sudo edit-chroot -f '/var/host/media/removable/Seagate Backup Plus Drive/backups' -b bionic
#To run atom editor in crouton
#xiwi -T atom -f .
#https://github.com/dnschneid/crouton/wiki/crouton-in-a-Chromium-OS-window-(xiwi)

#Tomcat application installation and setup
https://www.digitalocean.com/community/tutorials/install-tomcat-9-ubuntu-1804
