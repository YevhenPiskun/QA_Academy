package com.playtika.homework.com.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadingFromFile {

    public static List<Employee> listOfEmployee;
    public static List<String> listOfString;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private Path getPath() throws IOException {
        System.out.println("Введите путь к файлу: ");
        String line = reader.readLine();
        Path path = Paths.get(line);
        return path.toAbsolutePath();
    }

    public List<String> readFromFile() throws IOException {
        listOfString = Files.readAllLines(getPath());
        return listOfString;
    }

    public List<Employee> createListOfEmployees(List<String> list) {
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(";");
        }
        return listOfEmployee;
    }

}
