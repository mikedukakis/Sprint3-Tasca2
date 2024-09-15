package imf.pizzamaster;

import imf.builders.PizzaBuilder;
import imf.pizza.Pizza;

import java.util.List;

public class PizzaMaster {
    private PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza createPizza(String size, String dough, List<String> toppings) {
        pizzaBuilder.setSize(size).setDough(dough);
        for (String topping : toppings) {
            pizzaBuilder.addTopping(topping);
        }
        return pizzaBuilder.build();
    }
}
