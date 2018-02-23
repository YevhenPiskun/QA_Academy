package com.playtika.classwork.pizza;

public class FourCheesesPizzaMaker extends PizzaMaker {
    @Override
    protected Pizza createPizza() {
        return new Pizza("Four cheeses pizza");
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
        System.out.println("Added mozzarella, cheese, parmejano");
    }
}
