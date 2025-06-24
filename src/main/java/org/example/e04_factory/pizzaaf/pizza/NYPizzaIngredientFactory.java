package org.example.e04_factory.pizzaaf.pizza;

import org.example.e04_factory.pizzaaf.cheese.Cheese;
import org.example.e04_factory.pizzaaf.cheese.ReggianoCheese;
import org.example.e04_factory.pizzaaf.clams.Clams;
import org.example.e04_factory.pizzaaf.clams.FreshClams;
import org.example.e04_factory.pizzaaf.dough.Dough;
import org.example.e04_factory.pizzaaf.dough.ThinCrustDough;
import org.example.e04_factory.pizzaaf.pepperoni.Pepperoni;
import org.example.e04_factory.pizzaaf.pepperoni.SlicedPepperoni;
import org.example.e04_factory.pizzaaf.sauce.MarinaraSauce;
import org.example.e04_factory.pizzaaf.sauce.Sauce;
import org.example.e04_factory.pizzaaf.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
