package com.playtika.homework;

public class HomeWork2_2 {

    public static void main(String[] args) {
        long count = 66464338;
        int max = 0;
        int min = 9;
        while (count != 0) {
            int number = (int) (count % 10);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            count /= 10;
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }

}
