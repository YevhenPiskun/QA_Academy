package com.playtika.classwork.pizza;

public class PepperoniPizzaMaker extends PizzaMaker {

    @Override
    protected Pizza createPizza() {
        return new Pizza("Pepperoni pizza");
    }
    @Override
    protected void bake() {
        System.out.println("baking for 15 minutes...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}

    }
    @Override
    protected void addIngredients() {
        System.out.println("Sosidg, tomatos, paprika, cheese");
    }
}
