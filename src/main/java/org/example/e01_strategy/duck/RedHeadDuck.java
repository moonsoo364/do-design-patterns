package org.example.e01_strategy.duck;

import org.example.e01_strategy.fly.FlyWithWings;
import org.example.e01_strategy.quack.Quack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
