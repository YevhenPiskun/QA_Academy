package com.playtika.homework.com.homework8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadFromFile {
    private String filePath;

    public ReadFromFile(String filePath) {
        this.filePath = filePath;
    }

    public Map<String, Integer> calculateWords() throws IOException {
        List<String> stringList = Files.readAllLines(Paths.get(filePath));
        List<String> wordsList = createListOfWords(stringList);
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < wordsList.size() - 1; i++) {
            if (!map.containsKey(wordsList.get(i))) {
                map.put(wordsList.get(i), 1);
            } else {
                map.put(wordsList.get(i), map.get(wordsList.get(i)) + 1);
            }
        }
        return map;
    }

    private ArrayList<String> createListOfWords(List<String> lines) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < lines.size() - 1; i++) {
            String arrayOfWords[] = lines.get(i).split("[ ,.:!_?)\"(\\-]");
            for (int k = 0; k < arrayOfWords.length - 1; k++) {
                if (!arrayOfWords[k].equals("")) {
                    words.add(arrayOfWords[k].toLowerCase());
                }
            }
        }
        return words;
    }

}
