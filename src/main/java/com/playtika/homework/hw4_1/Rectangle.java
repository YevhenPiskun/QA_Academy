package com.playtika.homework.hw4_1;

public class Rectangle extends AbstractFactoryRectangle {

    private double top;
    private double side;

    public double getSquare() {
        return top * side;
    }

    public double getPerimeter() {
        return top * 2 + side * 2;
    }

    public Rectangle createShape() {
        return new Rectangle();
    }
}
