package ru.geekbrains.lesson02.builderMethod;

/** A customer ordering a pizza. */

public class BulderExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println(pizza.toString());
    }
}
