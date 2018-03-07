package com.playtika.homework.HW5_1;

public class WrongEnteringException extends Exception {
    WrongEnteringException() {
        super("Неправильный формат ввода");
    }
}
