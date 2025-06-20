package org.example.e01_strategy.duck;

import org.example.e01_strategy.fly.FlyNoWay;
import org.example.e01_strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck (){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    @Override
    void display() {
        System.out.println("I'm a duck Decoy");
    }
}
