#include <stdio.h>
#include<stdlib.h> 
#include<graphics.h>
void swap1(int* a, int* b) {
   int temp=*a;
   printf("Address of x:%d, y:%d, temp:%d\n",a,b,&temp);
   *a=*b;
   *b=temp;
   printf("Address of x:%d, y:%d, temp:%d\n",a,b,&temp);
}

void swap2(int &a, int &b) {
   int temp=a;
   printf("Address of x:%d, y:%d, temp:%d\n",&a,&b,&temp);
   a=b;
   b=temp;
   printf("Address of x:%d, y:%d, temp:%d\n",&a,&b,&temp);
}


void swap3(int a, int b) {
  printf("Before the XOR swapping, the value of x=%d and y=%d\n", a,b);
  a = a ^ b;
  b = b ^ a;
  a = a ^ b;
  printf("After the swap call the value of x=%d and y=%d\n", a,b);
}

//sum of first n numbers
int sum(int n){
  printf("%d",n);
  if(n>0){
   printf("%s", "+");
   return (n + sum(n-1));
  }
}

long power(long n, long m) {
  printf("%d",n);
  if(m==0 )
   return 1;
  else {
     printf("%s"," * ");
     return n*power(n,m-1);
   }
}


int showCircle()
{
    int gd = DETECT, gm;
    initgraph(&gd, &gm, NULL);

    circle(50, 50, 30);

    delay(500000);
    closegraph();
    return 0;
}

int main() {
  int x=10;
  int y=20;
  //printf("Address of x:%d, y:%d\n",&x,&y);
  //printf("Value of   x:%d, y:%d\n",*&x,*&y);
  printf("Before the swapping, the value of x=%d and y=%d\n", x,y);
  swap1(&x,&y);
  printf("After the swap call the value of x=%d and y=%d\n", x,y);
//  printf("Address of x:%d, y:%d\n",&x,&y);
//  printf("Value of   x:%d, y:%d\n",*&x,*&y);
  printf("Before the swapping, the value of x=%d and y=%d\n", x,y);
  swap2(x,y);
  printf("After the swap call the value of x=%d and y=%d\n", x,y);

  swap3(x,y);

  //printf("Sum of the first 20 numbers: \n", sum(20));
  printf("5 to the power of 25: %l \n", power(5,5));
  showCircle();
}
