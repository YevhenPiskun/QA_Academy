package com.playtika.homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        char arrSymbolsOfLine[] = line.toCharArray();
        int[] arrSymbols = new int[256];
        for (int i = 0; i < arrSymbolsOfLine.length; i++) {
            arrSymbols[(int)arrSymbolsOfLine[i]]++;
        }
        System.out.println("Символ - Количество:");
        for (int j = 0; j < arrSymbols.length; j++) {
            if (arrSymbols[j] != 0) {
                System.out.println((char) j + " " + arrSymbols[j]);
            }
        }

    }
}
