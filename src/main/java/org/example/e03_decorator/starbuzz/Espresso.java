package org.example.e03_decorator.starbuzz;

import java.beans.Expression;

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
