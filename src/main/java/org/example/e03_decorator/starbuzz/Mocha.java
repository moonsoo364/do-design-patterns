package org.example.e03_decorator.starbuzz;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){ this.beverage = beverage; }
    public String getDescription() {return beverage.getDescription() + ", mocha"; }
    public double cost(){ return .20 + beverage.cost(); }
}
