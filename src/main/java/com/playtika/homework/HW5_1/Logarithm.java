package com.playtika.homework.HW5_1;

public class Logarithm implements Calculable {
    public void calculate(double firstNum, double secondNum) {
        System.out.println(Math.log(secondNum) / Math.log(firstNum));
    }
}
