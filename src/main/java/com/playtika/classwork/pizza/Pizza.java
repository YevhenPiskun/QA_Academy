package com.playtika.classwork.pizza;

public class Pizza {

    private String name;
    private boolean eaten = false;

    Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        if (eaten) {
            return;
        }
        eaten = true;
        System.out.printf("Pizza %s is delicious!", name);
    }

    public boolean isEaten() {
        return eaten;
    }


}
