package com.playtika.homework.com.homework7;

import java.io.*;

public class FileFindPhrase {
    private String path;

    public FileFindPhrase(String path) {
        this.path = path;
    }

    public void find(String phrase) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader(path));
        String stringLine;
        while ((stringLine = lnr.readLine()) != null) {
            if (stringLine.contains(phrase)) {
                System.out.printf("%d: %s %n", lnr.getLineNumber(), stringLine);
            }
        }
        lnr.close();
    }

}
