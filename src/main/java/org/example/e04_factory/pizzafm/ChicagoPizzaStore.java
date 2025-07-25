package org.example.e04_factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
