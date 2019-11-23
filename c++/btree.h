#include <stdio.h>
#include <iostream>
struct node {
  int a;
  int* nextptr;
public:
  node(int x) {
    a=x;
    nextptr = null;
  }
  int& getNode() {
    return &this;
  }
};
