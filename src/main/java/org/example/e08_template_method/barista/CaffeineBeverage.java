package org.example.e08_template_method.barista;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() { System.out.println("Boiling water"); }

    void pourInCup() { System.out.println("Pouring into cup"); }
}
