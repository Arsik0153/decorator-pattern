package com.company;

public class WithCheeseDecorator extends BasePizzaDecorator{
    public WithCheeseDecorator(Pizza wrappee) {
        super(wrappee);
        System.out.println("With cheese");
    }

    public int getCost(){
        return this.wrappee.getCost() + 500;
    }
}
