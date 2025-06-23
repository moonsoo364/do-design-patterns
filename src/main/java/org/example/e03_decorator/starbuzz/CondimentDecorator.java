package org.example.e03_decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}
