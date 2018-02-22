package com.playtika.homework.hw4_1;

public class Rectangle extends AbstractShape {

    private double top;
    private double side;

    Rectangle(double top, double side) {
        this.top = top;
        this.side = side;
    }

    public double getSquare() {
        return top * side;
    }

    public double getPerimeter() {
        return top * 2 + side * 2;
    }
}
