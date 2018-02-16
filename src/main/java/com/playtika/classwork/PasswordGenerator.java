package com.playtika.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PasswordGenerator {

    private static final int LOW_BOUND = 8;
    private static final int HIGH_BOUND = 20;
    private static final String SYMBOLS = "!@#$%^&*";
    private static final String DIGITS = "0123456789";
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final int SET_OF_SYMBOLS = 2;
    private static final int SET_OF_DIGITS = 1;
    private static final int COUNT_OF_DIGITS = 3;
    private static final int ONE_SET = 1;
    private static final int TWO_SET = 2;
    private static final int THREE_SET = 3;
    private static Random random = new Random();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int passwordLength;
        while (true) {
            System.out.println("Введите длину пароля: ");
            String line = reader.readLine();
            passwordLength = Integer.parseInt(line);
            if (passwordLength >= LOW_BOUND && passwordLength <= HIGH_BOUND) {
                break;

            } else if (passwordLength < LOW_BOUND) {
                System.out.println("Слишком маленький пароль");
                System.out.println();
                continue;

            } else if (passwordLength > HIGH_BOUND) {
                System.out.println("Слишком длинный пароль");
                System.out.println();
                continue;
            }
        }

        String[] array = {LETTERS, DIGITS, SYMBOLS};  //массив наборов символов
        int bound = THREE_SET;
        int countOfDigits = 0;
        StringBuilder password = new StringBuilder("");
        char previousSymbol = ' ';
        while (password.length() != passwordLength) {
            int setOfSymbols = random.nextInt(bound);   //случайный выбор набора символов
            char nextSymbol = returnRandomSymbolFromArray(array[setOfSymbols]);
            if (nextSymbol == previousSymbol) {     //проверка на совпадение текущего символа с предыдущим
                continue;
            } else {
                if (setOfSymbols == SET_OF_SYMBOLS) {     //проверка на то, что выпал символ из набора символов
                    password.append(nextSymbol);
                    bound = TWO_SET;
                } else {
                    if (setOfSymbols == SET_OF_DIGITS) {   //проверка на то, что выпал символ из набора символов
                        countOfDigits++;
                        if (countOfDigits == COUNT_OF_DIGITS) {   //проверка на то, что символ из набора цифр уже выпал 3 раза
                            bound = ONE_SET;
                        }
                    }
                    password.append(nextSymbol);
                    previousSymbol = nextSymbol;
                }

            }
        }

        System.out.println(password);

    }

    private static char returnRandomSymbolFromArray(String line) {      //метод возвращает случайный символ из строки
        int choice = random.nextInt(line.length());
        return line.charAt(choice);
    }

}
