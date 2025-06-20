package org.example.e01_strategy.duck;

import org.example.e01_strategy.fly.FlyNoWay;
import org.example.e01_strategy.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
