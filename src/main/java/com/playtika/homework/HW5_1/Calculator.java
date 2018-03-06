package com.playtika.homework.HW5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
     * В этом методе нужно обрабатывать исключения WrongOperationException и WrongEnteringException и
     * в catch выводить в консоль соответсвующую ошибку. Программа не должна падать по стектрейсу.
     * <p>
     * Порождаться же исключения должны в отдельном классе, к примеру Calculator, который принимает параметры,
     * строку оператора и выводить результат.
     **/
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
        System.out.print("= ");
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(a, b, operation));
    }

    public double calculate(double val1, double val2, String operator) throws WrongOperationException {
        Calculable operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }

        return operation.resultFor(val1, val2);
    }

    private Calculable getOperationFor(String operator) throws WrongOperationException {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("+".equals(operator)) {
            return new Addition();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)) {
            return new Degree();
        } else if ("log".equals(operator)) {
            return new Logarithm();
        } else if ("sqrt".equals(operator)) {
            return new Root();
        } else if ("*".equals(operator)) {
            return new Multiplication();
        } else throw new WrongOperationException("You enter wrong operation");
    }
}
