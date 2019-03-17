#include <iostream>
#include <string>
using namespace std;
typedef long long int lli;
void sayHello() {
	cout << "Hello";
}
int main() {

  sayHello();
	string divident;
	cout<<"Enter the divident: ";
	cin>>divident;
	lli divisor;
	cout<<"Enter the divisor: ";
	cin>>divisor;
	if (divisor<=0)
	{
		cout<<"Divisor must be greater than 0";
		return 1;
	}
	lli rem=0;
	for (int i=0; i<divident.length(); i++)
	{
		rem=(rem*10)+ int(divident[i]-'0');
		rem=rem-divisor*(rem/divisor);
	}
	cout<<"The remainder is: "<<rem<<endl;
	return 0;
}
