package org.example.e03_decorator.pizza;

public class Olives extends ToppingDecorator{

    public Olives (Pizza pizza){
        this.pizza = pizza;
    }


    @Override
    public String getDescription() {
        return this.pizza + ", Olives";
    }

    @Override
    public double cost() {
        return pizza.cost() + 0.30;
    }
}
