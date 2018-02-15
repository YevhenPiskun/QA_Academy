package com.playtika.homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork3_3 {
    public static void main(String[] args) throws IOException {       
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter your name: ");
            String fio = reader.readLine();
            Pattern patternFio = Pattern.compile("[a-zA-Z- ]+");
            if (patternFio.matcher(fio).matches()) {
                break;
            }
            System.out.println("Name is incorrect");
            System.out.println();
        }
        while (true) {
            System.out.println("Enter your mobile phone: ");
            String phone = reader.readLine();
            Pattern patternPhone = Pattern.compile("^((\\+380)([0-9]{9}))$");
            if (patternPhone.matcher(phone).matches()) {
                break;
            }
            System.out.println("Phone is incorrect");
            System.out.println();
        }
        while (true) {
            System.out.println("Enter your email: ");
            String email = reader.readLine();
            Pattern patternEmail = Pattern.compile("^(([a-zA-Z0-9_-]+)([@]{1})([a-zA-Z-_ ]+)([.]{1,2})([a-zA-Z-_ ]+))$");
            if (patternEmail.matcher(email).matches()) {
                break;
            }
            System.out.println("Email is incorrect");
            System.out.println();
        }

    }
}
