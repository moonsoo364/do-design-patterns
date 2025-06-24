package org.example.e04_factory.pizzaaf.pizza;

import org.example.e04_factory.pizzaaf.cheese.Cheese;
import org.example.e04_factory.pizzaaf.clams.Clams;
import org.example.e04_factory.pizzaaf.dough.Dough;
import org.example.e04_factory.pizzaaf.pepperoni.Pepperoni;
import org.example.e04_factory.pizzaaf.sauce.Sauce;
import org.example.e04_factory.pizzaaf.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
