package org.example.e01_strategy.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
