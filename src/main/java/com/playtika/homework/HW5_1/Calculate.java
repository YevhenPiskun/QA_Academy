package com.playtika.homework.HW5_1;

public class Calculate {
    private Calculable calculable;


    public void setOperation(Calculable calculable) {
        this.calculable = calculable;
    }

    public void operation(double a, double b) {
        calculable.calculate(a, b);
    }

}
