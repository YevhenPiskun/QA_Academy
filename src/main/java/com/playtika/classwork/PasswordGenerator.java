package com.playtika.classwork;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
Всегда при генерации пароль начинается с какого либо символа из набора SYMBOL!
**/
public class PasswordGenerator {

    private static final int LOW_BOUND = 8;
    private static final int HIGH_BOUND = 20;
    private static final String SYMBOL = "!@#$%^&*";
    private static final String NUMBER = "0123456789";
    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

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

        String[] array = {LETTERS, NUMBER, SYMBOL};  //массив наборов символов
        int bound = 3;
        int countOfNumbers = 0;
        Random random = new Random();
        //лучше использовать StringBuilder
        String password = "";
        //используй char а не String для одного символа
        String previousSymbol = "";
        while (password.length() != passwordLength) {
            int setOfSymbols = random.nextInt(bound);   //случайный выбор набора символов
            String nextSymbol = returnRandomSymbolFromArray(array[setOfSymbols]);
            if (nextSymbol.equals(previousSymbol)) {     //проверка на совпадение текущего символа с предыдущим
                continue;
            } else {
                //Магическое число 2
                if (setOfSymbols == 2) {     //проверка на то, что выпал символ из 2-го набора символов
                    //дорогая операция! StringBuilder нужен
                    password = password.concat(nextSymbol);
                    bound = 2;
                } else {
                    //Магическое число 1
                    if (setOfSymbols == 1) {   //проверка на то, что выпал символ из 1-го набора символов
                        countOfNumbers++;
                        if (countOfNumbers == 3) {   //проверка на то, что символ из 1-го набора уже выпал 3 раза
                            bound = 1;
                        }
                    }
                    //дорогая операция! StringBuilder нужен
                    password = password.concat(nextSymbol);
                    previousSymbol = nextSymbol;
                }

            }
        }

        System.out.println(password);

    }

    private static String returnRandomSymbolFromArray(String line) {      //метод возвращает случайный символ из строки
        //Не нужно каждый раз создавать Random, не оптимально!
        //Создай его один раз как статическое поля класса.
        Random random = new Random();
        int choice = random.nextInt(line.length());
        //charAt будет лечше
        return line.substring(choice, choice + 1);
    }


}
