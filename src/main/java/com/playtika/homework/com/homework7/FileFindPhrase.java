package com.playtika.homework.com.homework7;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

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

    public void findByString() {
        try (LineNumberReader lnr = new LineNumberReader(Files.newBufferedReader(Paths.get(filePath).toAbsolutePath()))) {
            String stringLine;
            while ((stringLine = lnr.readLine()) != null) {
                if (stringLine.contains(phrase)) {
                    System.out.printf("%d: %s %n", lnr.getLineNumber(), stringLine);
                }
            }
            lnr.close();
        } catch (IOException e) {
            System.out.println("Файл не удалось считать");
        }
    }

    public void findByRegExp() {
        try (LineNumberReader lnr = new LineNumberReader(Files.newBufferedReader(Paths.get(filePath).toAbsolutePath()))) {
            String stringLine;
            Pattern pattern = Pattern.compile(phrase);
            while ((stringLine = lnr.readLine()) != null) {
                if (pattern.matcher(stringLine).find()) {
                    System.out.printf("%d: %s %n", lnr.getLineNumber(), stringLine);
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не удалось считать");
        }
    }
}
