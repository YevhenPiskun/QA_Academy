package com.playtika.homework.HW5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /**
    В этом методе нужно обрабатывать исключения WrongOperationException и WrongEnteringException и
    в catch выводить в консоль соответсвующую ошибку. Программа не должна падать по стектрейсу.
    
    Порождаться же исключения должны в отдельном классе, к примеру Calculator, который принимает параметры,
    строку оператора и выводить результат.
    
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
        System.out.println("Результат: ");
        try {
            if (operation.equals("+")) {
                //зачем нам интерфейс, если ты вызваешь метод калькуляции через конкретный класс????
                new Addition().resultFor(a, b);
            } else if (operation.equals("-")) {
                //зачем нам интерфейс, если ты вызваешь метод калькуляции через конкретный класс????
                new Subtraction().resultFor(a, b);
            } else if (operation.equals("*")) {
                //зачем нам интерфейс, если ты вызваешь метод калькуляции через конкретный класс????
                new Multiplication().resultFor(a, b);
            } else if (operation.equals("/")) {
                //зачем нам интерфейс, если ты вызваешь метод калькуляции через конкретный класс????
                new Division().resultFor(a, b);
            } else if (operation.equals("^")) {
                //зачем нам интерфейс, если ты вызваешь метод калькуляции через конкретный класс????
                new Degree().resultFor(a, b);
            } else if (operation.equals("log")) {
                //зачем нам интерфейс, если ты вызваешь метод калькуляции через конкретный класс????
                new Logarithm().resultFor(a, b);
            } else if (operation.equals("sqrt")) {
                //зачем нам интерфейс, если ты вызваешь метод калькуляции через конкретный класс????
                new Root().resultFor(a, b);
            } else {
                throw new WrongOperationException("You enter wrong operation");
            }
        } catch (NullPointerException e) {
            throw new WrongEnteringException("You enter wrong expression");
        }

    }

    public double calculate(double val1, double val2, String operator){
        Calculable calc = 
    }
}
