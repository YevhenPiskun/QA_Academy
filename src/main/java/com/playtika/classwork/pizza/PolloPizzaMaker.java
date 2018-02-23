package com.playtika.classwork.pizza;

public class PolloPizzaMaker extends PizzaMaker {

    @Override
    protected Pizza createPizza() {
        return new Pizza("Pollo pizza");
    }

    @Override
    protected void bake() {
        System.out.println("Baking for 20 minutes...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

    @Override
    protected void addIngredients() {
        System.out.println("Added chicken, cheese, tomatos");
    }
}
