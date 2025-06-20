package org.example.e01_strategy.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
