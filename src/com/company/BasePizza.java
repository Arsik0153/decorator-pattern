package com.company;

public class BasePizza implements Pizza{
    public BasePizza(){
        System.out.println("Base pizza created");
    }

    public int getCost() {
        return 1000;
    }
}
