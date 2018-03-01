package com.playtika.homework.hw4_1;

import java.io.IOException;

public class Circle extends AbstractShape {

    private static final double pi = 3.1415;
    private double radius;

    Circle() throws IOException {
        createShape();
    }

    private double getRadius() {
        return radius;
    }

    public double getSquare() {
        return pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }

    public void createShape() throws IOException {

        System.out.print("Введіть радіус кола: ");
        String radiusLine = Main.reader.readLine();
        setRadius(Double.parseDouble(radiusLine));
        System.out.printf("Коло з радіусом %f має площу %f %n", getRadius(), getSquare());
        System.out.printf("Коло з радіусом %f має периметр %f %n", getRadius(), getPerimeter());
        ;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }
}
