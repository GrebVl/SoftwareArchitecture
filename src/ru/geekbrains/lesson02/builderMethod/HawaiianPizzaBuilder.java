package ru.geekbrains.lesson02.builderMethod;

/** "ConcreteBuilder" */

public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Ham + pineapple");
    }
}
