package org.example.e03_decorator.pizza;

public class ThickcrustPizza extends Pizza {
    public ThickcrustPizza() { description = "Thick crust pizza, with tomato sauce"; }
    @Override
    public double cost() {
        return 7.99;
    }
}
