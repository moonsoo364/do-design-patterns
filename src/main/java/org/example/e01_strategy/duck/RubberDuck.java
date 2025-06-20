package org.example.e01_strategy.duck;

import org.example.e01_strategy.fly.FlyBehavior;
import org.example.e01_strategy.fly.FlyNoWay;
import org.example.e01_strategy.quack.QuackBehavior;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior =  () -> System.out.println("Squeak");
    }

    public RubberDuck (FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm a rubber duckie");
    }
}
