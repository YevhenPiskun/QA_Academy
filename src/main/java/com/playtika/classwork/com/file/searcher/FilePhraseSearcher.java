package com.playtika.classwork.com.file.searcher;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FilePhraseSearcher extends SimpleFileVisitor<Path> {

    private final String phrase;
    private final PrintStream printWriter;

    public FilePhraseSearcher(String phrase, PrintStream printWriter) {
        this.phrase = phrase;
        this.printWriter = printWriter;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        try
                (LineNumberReader reader = new LineNumberReader(Files.newBufferedReader(file))) {
            String line;
            boolean notPrinted = true;
            while ((line = reader.readLine()) != null) {
                if (line.contains(phrase)) {
                    if (notPrinted) {
                        printWriter.println(file.toAbsolutePath());
                        notPrinted = false;
                    }
                    printWriter.printf("/t%d:%s", reader.getLineNumber(), line);
                }
            }
        }
        return FileVisitResult.CONTINUE;
    }


}