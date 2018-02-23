package com.playtika.classwork.pizza;

public abstract class PizzaMaker {
    public Pizza cook() {
        takeBase();
        addIngredients();
        bake();
        cut();
        pack();
        return createPizza();
    }

    protected abstract Pizza createPizza();

    private void cut(){
        System.out.println("Pizza is cut");
    };

    private void pack() {
        System.out.println("Pizza is packed");
    }

    protected abstract void bake();

    protected abstract void addIngredients();

    private void takeBase() {
        System.out.println("Base is taken");
    }


}
