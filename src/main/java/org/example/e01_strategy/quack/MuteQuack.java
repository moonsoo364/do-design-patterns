package org.example.e01_strategy.quack;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
