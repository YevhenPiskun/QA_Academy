package com.playtika.homework.HW5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите выражение через пробел: ");
        String line = reader.readLine();
        String[] arr = line.split(" ");
        double a = 0;
        double b = 0;
        String operation = null;
        if (arr.length == 3) {
            a = Double.parseDouble(arr[0]);
            b = Double.parseDouble(arr[2]);
            operation = arr[1];
        }
        System.out.println("Результат: ");

        Calculate calc = new Calculate();

        if (operation.equals("+")) {
            calc.setOperation(new Addition());
            calc.operation(a, b);
        } else if (operation.equals("-")) {
            calc.setOperation(new Subtraction());
            calc.operation(a, b);
        } else if (operation.equals("*")) {
            calc.setOperation(new Multiplication());
            calc.operation(a, b);
        } else if (operation.equals("/")) {
            calc.setOperation(new Division());
            calc.operation(a, b);
        } else if (operation.equals("^")) {
            calc.setOperation(new Degree());
            calc.operation(a, b);
        } else if (operation.equals("log")) {
            calc.setOperation(new Logarithm());
            calc.operation(a, b);
        } else if (operation.equals("sqrt")) {
            calc.setOperation(new Root());
            calc.operation(a, b);
        } else {
            System.out.println("Введена не поддерживаемая операция");
        }

    }
}
