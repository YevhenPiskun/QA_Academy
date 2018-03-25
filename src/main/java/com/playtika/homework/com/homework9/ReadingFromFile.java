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

    public Path getPath() throws IOException {
        System.out.println("Введите путь к файлу: ");
        String line = reader.readLine();
        Path path = Paths.get(line);
        return path.toAbsolutePath();
    }

}
