package com.playtika.homework;

public class HomeWork2_3 {

    public static void main(String[] args) {
        int index = 8;
        System.out.println(fibo(index));
    }

    private static int fibo(int count) {
        int result;
        if (count == 1 || count == 2) {
            return 1;
        } else {
            result = fibo(count - 1) + fibo(count - 2);
            return result;
        }
    }
}
