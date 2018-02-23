package com.playtika.classwork.pizza;

public class PizzaMachine {
    public Pizza order(Button button) {
        PizzaMaker pizzaMaker = null;
        switch (button) {
            case ONE:
                pizzaMaker = new PolloPizzaMaker();
                break;
            case TWO:
                pizzaMaker = new FourCheesesPizzaMaker();
                break;
            case THREE:
                pizzaMaker = new CarbonaraPizzaMaker();
                break;
            case FOUR:
                pizzaMaker = new PepperoniPizzaMaker();
        }
        return pizzaMaker.cook();
    }
}
