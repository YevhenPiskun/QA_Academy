package com.playtika.classwork.pizza;

public class UkrainianPizzaMakerFactory implements PizzaMakerFactory {

    public PizzaMaker getPizzaMaker(Button button) {
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
        return pizzaMaker;
    }
}
