package org.example.e03_decorator.starbuzz;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
