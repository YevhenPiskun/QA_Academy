package com.playtika.homework.hw4_1;

import java.io.IOException;

public class Triangle extends AbstractShape {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSquare() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public void createShape() throws IOException {

    }
}
