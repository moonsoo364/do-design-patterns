package org.example.e04_factory.pizzafm;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen lams from Chesapeake Bay");
    }

    void cut() { System.out.println("Cutting the pizza into square slices"); }
}
