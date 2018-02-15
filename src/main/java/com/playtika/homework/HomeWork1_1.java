package com.playtika.homework;

public class HomeWork1_1 {
    public static void main(String args[]){
        System.out.printf("Long  x + (y - 100) * z/n = %d %n", equationLong(3, 5, 4, 2));
        System.out.printf("Int  (x - (50 + y * z) * n) + x = %d %n", equationInt(4, 6, 12, 10));
        System.out.printf("Float  x * (y / (z-1) + 555) - n = %f %n", equationFloat(2.4f, 3.3f, 4.134f, 3f));
        System.out.printf("Double  -x / y + z * (n+1) = %f %n", equationDouble(-56.0, 45.3, -5.62, 32.0 ));
    }
    public static long equationLong(int x, int y, int z, int n){
        long result = x + (y - 100) * z/n;
        return result;
    }
    public static int equationInt(int x, int y, int z, int n){
        int result = (x - (50 + y * z) * n) + x;
        return result;
    }
    public static float equationFloat(float x, float y, float z, float n){
        float result = x * (y / (z-1) + 555) - n;
        return result;
    }
    public static double equationDouble(double x, double y, double z, double n){
        double result = -x / y + z * (n+1);
        return result;
    }
}
