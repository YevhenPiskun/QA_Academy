package com.playtika.homework.hw4_1;

public class Circle extends AbstractFactoryCircle {

    private double radius;
    private static final double pi = 3.1415;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
