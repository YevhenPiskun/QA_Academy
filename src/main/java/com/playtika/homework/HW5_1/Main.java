package com.playtika.homework.HW5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число: ");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Введите операцию: ");
        String operation = reader.readLine();
        System.out.println("Результат: ");

        Calculate calc = new Calculate();

        if (operation.equals("+")) {
            calc.setOperation(new Addition());
            calc.operation(a, b);
        } else if (operation.equals("-")) {
            calc.setOperation(new Subtraction());
            calc.operation(a, b);
        } else {
            System.out.println("Введена не поддерживаемая операция");
        }

    }
}
