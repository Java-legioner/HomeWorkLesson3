package com.company;

public class Circle {

    int radius = 7;
    int diameter = 14;



    public void lengthCircle(){
        double lengthCircle = 2 * Math.PI * radius;
        System.out.println("Довжина кола = " + lengthCircle);
    }

    public void areaCircle(){
        double areaCircle = Math.PI  * ((diameter/2) * (diameter/2));
        System.out.println("Площа кола = " + areaCircle);
    }
}
