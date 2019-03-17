#include<iostream>
#include<stdio.h>
using namespace std;

void printArray(int* arr,int arraylen){
/* prints the input array */
  for(int i=0;i<arraylen;i++)
    cout << arr[i] <<" ";
}

void printIndex(int* a,int arraylen,int target) {
/* prints the indices of array elements whose sum is target */
  int diff=0;
  //int arraylen=sizeof(a)/sizeof(a[0]);
  cout <<"Input passed: array of size : " << arraylen << " and target sum: " << target <<endl;
  printArray(a,arraylen);
  cout <<"\n Indices are: " << endl;
  for(int i=0;i<arraylen;i++) {
     diff=target-a[i];
       for (int j=i+1; j<=arraylen; j++)
          if(a[i]+a[j] == target)
              cout <<"[" << i <<"," <<j<<"] ";
   }
   cout <<endl;
}

int main() {
   int x[] = {0,-3,2,7,11,15,5,-11,0,4,9,12,14,22};
   int y[] = {0,12,2,7,11,15,5,-11,0,-7,9,-3,14,22};

   int sum=9;
   int sum2=11;

   int arraylen=sizeof(x)/sizeof(x[0]);

   printIndex(x,arraylen,9);
   printIndex(y,arraylen,9);
   printIndex(x,arraylen,sum2);
   printIndex(x,arraylen,-2);
   printIndex(x,arraylen,-11);
   printIndex(x,arraylen,0);
   printIndex(y,arraylen,0);
}
