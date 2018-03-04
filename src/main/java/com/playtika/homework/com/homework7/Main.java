package com.playtika.homework.com.homework7;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку в формате:$ grep 'phrase' path");
        System.out.print("$ grep ");
        String line = reader.readLine();
        String arr[] = line.split(" ");
        if (arr.length == 2){
            FileFindPhrase ffp = new FileFindPhrase(arr[1]);
            try {
                ffp.find(arr[0].substring(1, arr[0].length() - 1));
            } catch (IOException e) {
                System.out.println("File not found");
            }
        } else {
            System.out.println("Неправильный формат ввода");
        }
    }
}
