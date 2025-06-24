package org.example.e04_factory.pizzaaf.pizza;

import org.example.e04_factory.pizzaaf.cheese.Cheese;
import org.example.e04_factory.pizzaaf.cheese.MozzarellaCheese;
import org.example.e04_factory.pizzaaf.clams.Clams;
import org.example.e04_factory.pizzaaf.clams.FrozenClams;
import org.example.e04_factory.pizzaaf.dough.Dough;
import org.example.e04_factory.pizzaaf.dough.ThickCrustDough;
import org.example.e04_factory.pizzaaf.pepperoni.Pepperoni;
import org.example.e04_factory.pizzaaf.pepperoni.SlicedPepperoni;
import org.example.e04_factory.pizzaaf.sauce.PlumTomatoSauce;
import org.example.e04_factory.pizzaaf.sauce.Sauce;
import org.example.e04_factory.pizzaaf.veggies.BlackOlives;
import org.example.e04_factory.pizzaaf.veggies.Eggplant;
import org.example.e04_factory.pizzaaf.veggies.Spinach;
import org.example.e04_factory.pizzaaf.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
