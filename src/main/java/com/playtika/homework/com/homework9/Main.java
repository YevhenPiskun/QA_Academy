package com.playtika.homework.com.homework9;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadingFromFile readingFromFile = new ReadingFromFile();
        StreamMethods sm = new StreamMethods();
        List<Employee> list = readingFromFile.createListOfEmployees(readingFromFile.readFromFile());
        sm.getCountOfFemale(list);
        sm.getCountOfMenWithSalaryMoreThen10000(list);
    }
}
