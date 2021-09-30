package com.company;

public class WithTomatoesDecorator extends BasePizzaDecorator{
    public WithTomatoesDecorator(Pizza wrappee) {
        super(wrappee);
        System.out.println("With tomatoes");
    }

    public int getCost(){
        return wrappee.getCost() + 300;
    }
}
