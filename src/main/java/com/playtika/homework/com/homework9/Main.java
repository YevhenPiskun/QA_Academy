package com.playtika.homework.com.homework9;

import com.playtika.homework.com.homework8.ReadFromFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadingFromFile readingFromFile = new ReadingFromFile();
        StreamMethods sm = new StreamMethods();
        sm.getCountOfFemale(readingFromFile.createListOfEmployees(readingFromFile.readFromFile()));
    }
}
