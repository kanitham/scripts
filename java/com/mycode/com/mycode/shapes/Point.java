package com.mycode.shapes;
public class Point {
    static int x;
    static int y;
    
    public Point() {
        x=0;
        y=0;
    }
    public Point(int a, int b) {
        x = a;
        y = b;
    }
    public static String getPoint() {
        String pt =  new String();
        pt = "(" + x + "," + y + ")";
        return pt;
    }

}