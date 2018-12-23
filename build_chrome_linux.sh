# To install linux flavor
sudo sh crouton -r xenial -t xfce,extension,xorg,xiwi
# To install git ( and open ssh )
sudo apt-get install git
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
