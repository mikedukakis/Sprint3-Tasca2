package imf.builders;

import imf.pizza.Pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}
