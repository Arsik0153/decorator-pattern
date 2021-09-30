package com.company;

public class BasePizzaDecorator implements Pizza{
    public Pizza wrappee;

    public BasePizzaDecorator(Pizza wrappee) {
        this.wrappee = wrappee;
    }

    public int getCost() {
        return wrappee.getCost();
    }
}
