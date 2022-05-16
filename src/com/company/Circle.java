package com.company;

public class Circle {
    private final static double Pi=Math.PI;
    private static double r;


 public static double area(double r1){
        r=r1;
       return Pi*(r*r);
    }
    public static double circumference(/*-- double t -- eger oz-ozuncho radius bergibiz kelse*/){
     return Pi*2*r;/*-- return Pi*2*t --*/
    }

}
