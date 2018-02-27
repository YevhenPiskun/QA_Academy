package com.playtika.homework.HW5_1;

public class Root implements Calculable {
    public void calculate(double firstNum, double secondNum) {
        System.out.println(Math.pow(secondNum, 1 / firstNum));
    }
}
