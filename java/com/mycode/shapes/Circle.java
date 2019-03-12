package com.mycode.shapes;

//import com.mycode.shapes.*;

public class Circle extends Shape {
    int radius;
    float area=0;
    float circum=0;
    Point center = new Point(-2,4);
    static float PI=3.14F;
    public Circle(int a) {
       radius = a;
    }
    static float getArea(int r){
        return PI*r*r;
    }

    static float getPerimeter(int r) {
        return 2*PI*r;
    }
    public void showCircle() {
       System.out.println("Area of the Circle with radius " + radius + "is :" + getArea(radius)); 
       System.out.println("Circumfrance of the Circle with radius " + radius + "is :" + getPerimeter(radius)); 
       //System.out.println("Center of the Circle is :" + center.getPoint()); 
 
    }
    public void showProperties() {
      System.out.println(this.getClass().getSimpleName());

    }
}