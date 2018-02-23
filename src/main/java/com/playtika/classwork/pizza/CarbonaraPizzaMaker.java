package com.playtika.classwork.pizza;

public class CarbonaraPizzaMaker extends PizzaMaker {
    @Override
    protected Pizza createPizza() {
        return new Pizza("Carbonara pizza");
    }

    @Override
    protected void bake() {
        System.out.println("Baking for 10 minutes...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    @Override
    protected void addIngredients() {
        System.out.println("Added cheese, tomatos, eggs, bacon");
    }
}
