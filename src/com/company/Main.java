package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle firstRectangle = new Rectangle();

        Rectangle secondRectangle = new Rectangle(22, 11);

        System.out.println(firstRectangle);
        firstRectangle.square();
        firstRectangle.perimeter();

        System.out.println(secondRectangle);
        secondRectangle.square();
        secondRectangle.perimeter();


        Circle circle = new Circle();
        circle.lengthCircle();
        circle.areaCircle();


    }
}
