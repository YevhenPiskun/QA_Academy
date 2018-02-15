package com.playtika.homework;

public class HomeWork1_3 {
    public static void main(String args[]){
        System.out.printf("Длина вектора (x, y, z) = %f %n", dlinaVectora(2, 3, 4.5));
    }

    public static double dlinaVectora(double x, double y, double z){
        double result = Math.sqrt(x*x + y*y + z*z);
        return result;
    }
}
