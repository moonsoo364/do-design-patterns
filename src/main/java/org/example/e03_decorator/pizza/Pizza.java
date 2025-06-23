package org.example.e03_decorator.pizza;

public abstract class Pizza {
    String description = "Basic Pizza";

    public String getDescription() { return description; }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription();
    }

}
