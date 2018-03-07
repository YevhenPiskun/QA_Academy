package com.playtika.homework.HW5_1;

public class WrongOperationException extends Exception {
    WrongOperationException() {
        super("Такая операция не поддерживается");
    }
}
