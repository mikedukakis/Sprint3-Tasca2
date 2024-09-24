package imf.builders;

import imf.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilderImpl implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}
