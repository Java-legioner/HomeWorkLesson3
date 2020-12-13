package com.company;

public class Rectangle {

    private int width;
    private int height;


    Rectangle(){
        this.width = 14;
        this.height = 7;
    }

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void square(){
        int square = getWidth() * getHeight();
        System.out.println("Площа прямокутника = " + square);
    }

    public void perimeter(){
        int perimeter = (getWidth() + getHeight()) * 2;
        System.out.println("Периметр прямокутника = " + perimeter);
    }

    @Override
    public String toString() {
        return "Width: " + width + ", Height: " + height ;

    }
}
