package com.playtika.homework.HW5_1;

public class Root implements Calculable {
    public double resultFor(double firstNum, double secondNum) {
        return Math.pow(secondNum, 1 / firstNum);
    }
}
