package com.playtika.homework.com.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter phrase or regular expression: ");
        String phrase = reader.readLine();
        System.out.println("Enter file path: ");
        String file = reader.readLine();
        StringChecker sc = new StringChecker();
        FileFindPhrase ffp = new FileFindPhrase(file, phrase);
        boolean isRegExp = sc.checkStringOnRegExp(phrase);
        try {
            if (isRegExp) {
                ffp.findByRegExp();
            } else {
                ffp.findByString();
            }
        } catch (SecurityException e) {
            System.out.println("Нет доступа к файлу");
        } finally {
            reader.close();
        }
    }
}

