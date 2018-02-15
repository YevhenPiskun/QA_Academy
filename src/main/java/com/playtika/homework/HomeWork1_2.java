package com.playtika.homework;

public class HomeWork1_2 {
    public static void main(String args[]){
        digest(26543);
    }

    //Все отлично, но можно было бы обойтись одной переменной
    //а выводить остаток от деления этой переменой на 10
    /*
         int num = number;
         System.out.println(num % 10);
         num /= 10; //или num = num / 10;
         System.out.println(num % 10);         
         num /= 10; 
         System.out.println(num % 10);
         //и так далее
    */
    public static void digest(int number){
        int firstNumber = number%10;
        System.out.println(firstNumber);
        int secondNumber = number/10%10;
        System.out.println(secondNumber);
        int thirdNumber = number/100%10;
        System.out.println(thirdNumber);
        int fourthNumber = number/1000%10;
        System.out.println(fourthNumber);
        int fifthNumber = number/10000%10;
        System.out.println(fifthNumber);
    }
}
