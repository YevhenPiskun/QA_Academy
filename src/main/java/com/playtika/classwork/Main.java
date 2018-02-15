package com.playtika.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Цена одного килограма конфет: ");
        String konfet = reader.readLine();
        System.out.println("Цена одного килограма печенья: ");
        String pechen = reader.readLine();
        double konfetInt = Double.parseDouble(konfet);
        double pechenInt = Double.parseDouble(pechen);
        double pokupka1 = 0.3 * konfetInt + 0.4 * pechenInt;
        double pokupka2 = (2 * pechenInt + 1.8 * konfetInt) * 3;
        System.out.println("Покупка 1: " + pokupka1);
        System.out.println("Покупка 2: " + pokupka2);

    }
}
