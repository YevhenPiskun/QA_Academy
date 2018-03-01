package com.playtika.homework.HW5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, WrongOperationException, WrongEnteringException {
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
        try {
            if (operation.equals("+")) {
                new Addition().calculate(a, b);
            } else if (operation.equals("-")) {
                new Subtraction().calculate(a, b);
            } else if (operation.equals("*")) {
                new Multiplication().calculate(a, b);
            } else if (operation.equals("/")) {
                new Division().calculate(a, b);
            } else if (operation.equals("^")) {
                new Degree().calculate(a, b);
            } else if (operation.equals("log")) {
                new Logarithm().calculate(a, b);
            } else if (operation.equals("sqrt")) {
                new Root().calculate(a, b);
            } else {
                throw new WrongOperationException("You enter wrong operation");
            }
        } catch (NullPointerException e) {
            throw new WrongEnteringException("You enter wrong expression");
        }

    }
}
