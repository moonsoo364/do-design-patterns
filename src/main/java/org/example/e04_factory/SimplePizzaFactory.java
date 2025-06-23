package org.example.e04_factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese": {
                return new CheesePizza();
            }
            case "pepperoni": {
                return new PepperoniPizza();
            }
            case "clam": {
                return new ClamPizza();
            }
            case "veggie": {
                return new VeggiePizza();
            } default: {
                return new CheesePizza();
            }
        }
    }
}
