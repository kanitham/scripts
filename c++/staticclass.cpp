#include<iostream>
using namespace std;
class myclass {
    const int a=5;
  public:
    myclass(int x){ a=x; }
    static void show() {
       cout << "The value of a is: \n" << a;
    }
};

int main() {
  myclass obj1(10);

  const myclass obj2(3);

 obj1.show();

  obj2.show();



}
