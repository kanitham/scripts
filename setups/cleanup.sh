#sudo # (Allows you to execute commands with the privileges of the superuser.)       
KERNELCUR=$(uname -r | sed 's/-*[a-z]//g' | sed 's/-386//g')
PKGLINUX="linux-(image|headers|ubuntu-modules|restricted-modules)"
METAPKGLINUX="linux-(image|headers|restricted-modules)-(generic|i386|server|common|rt|xen)"
KERNELSOLD=$(dpkg -l | awk '{print $2}' | grep -E "$PKGLINUX" | grep -vE "$METAPKGLINUX" | grep -v "$KERNELCUR")

sudo apt-get purge "$KERNELSOLD"   # (Remove old kernels.)

CONFOLD=$(dpkg -l | grep '^rc' | awk '{print $2}')  

sudo apt-get purge "$CONFOLD"   # (Removes configuration files from deb packages that have been uninstalled.)
sudo apt-get autoremove   # (Deletes orphaned packages, or dependencies that remain installed after you have installed an application and then deleted it.)
sudo apt-get clean   # (Removes all packets from the cache.)
sudo rm -rf /home/*/.local/share/Trash/*/** &> /dev/null   # (Empty the trash from all users.)
sudo rm -rf /root/.local/share/Trash/*/** &> /dev/null   # (Empty the trash from root.)
