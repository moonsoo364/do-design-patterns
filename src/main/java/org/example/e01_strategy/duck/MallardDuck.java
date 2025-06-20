package org.example.e01_strategy.duck;

import org.example.e01_strategy.fly.FlyWithWings;
import org.example.e01_strategy.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck (){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
