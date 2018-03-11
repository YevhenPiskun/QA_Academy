package com.playtika.homework.com.homework8;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        //String line = "C:/Games/test2.txt";
        ReadFromFile rff = new ReadFromFile(args[0]);
        Map<String, Integer> map = new TreeMap<>();
        try {
            map = rff.calculateWords();
        } catch (NoSuchFileException e) {
            System.out.println("File not found");
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
