package org.example.e03_decorator.pizza;

public abstract class ToppingDecorator extends Pizza{
    Pizza pizza;
    public abstract String getDescription();
}
