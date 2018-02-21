package com.playtika.homework.hw4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Оберіть фігуру:");
        System.out.println("1. Квадрат");
        System.out.println("2. Прямокутник");
        System.out.println("3. Коло");
        System.out.println("4. Трикутник");
        System.out.println("5. Вихід");
        String line = reader.readLine();
        switch (Integer.parseInt(line)){
            case 1:

        }
    }
}
