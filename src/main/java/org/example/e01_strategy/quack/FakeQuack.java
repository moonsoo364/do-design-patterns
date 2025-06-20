package org.example.e01_strategy.quack;

public class FakeQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
