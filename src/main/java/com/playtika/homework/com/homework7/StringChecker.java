package com.playtika.homework.com.homework7;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringChecker {
    public boolean checkStringOnRegExp(String line) {
        try {
            Pattern pattern = Pattern.compile(line);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
