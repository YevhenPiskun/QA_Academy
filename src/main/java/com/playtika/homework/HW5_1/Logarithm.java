package com.playtika.homework.HW5_1;

public class Logarithm implements Calculable {
    public double resultFor(double firstNum, double secondNum) {
        return Math.log(secondNum) / Math.log(firstNum);
    }
}
