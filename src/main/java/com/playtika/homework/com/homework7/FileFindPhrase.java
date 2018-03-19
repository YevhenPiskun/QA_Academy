package com.playtika.homework.com.homework7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class FileFindPhrase {
    private final String filePath;
    private final String phrase;

    public FileFindPhrase(String filePath, String phrase) {
        this.filePath = filePath;
        this.phrase = phrase;
    }

    public void findByString() throws IOException {
        Path path = Paths.get(filePath);
        Path pathAbsolute = path.toAbsolutePath();
        LineNumberReader lnr = new LineNumberReader(Files.newBufferedReader(pathAbsolute));
        String stringLine;
        while ((stringLine = lnr.readLine()) != null) {
            if (stringLine.contains(phrase)) {
                System.out.printf("%d: %s %n", lnr.getLineNumber(), stringLine);
            }
        }
        lnr.close();
    }

    public void findByRegExp() throws IOException {
        Path path = Paths.get(filePath);
        Path pathAbsolute = path.toAbsolutePath();
        LineNumberReader lnr = new LineNumberReader(Files.newBufferedReader(pathAbsolute));
        String stringLine;
        Pattern pattern = Pattern.compile(phrase);
        while ((stringLine = lnr.readLine()) != null) {
            if (pattern.matcher(stringLine).find()) {
                System.out.printf("%d: %s %n", lnr.getLineNumber(), stringLine);
            }
        }
        lnr.close();
    }

}
