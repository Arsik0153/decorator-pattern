package com.company;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = new BasePizza();

        BasePizzaDecorator pizza = new BasePizzaDecorator(basePizza);
        pizza = new WithCheeseDecorator(pizza);
        pizza = new WithTomatoesDecorator(pizza);

        System.out.println("Total price: " + pizza.getCost());
    }
}
-