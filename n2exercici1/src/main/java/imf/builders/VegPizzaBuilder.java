package imf.builders;

import imf.pizza.Pizza;

public class VegPizzaBuilder implements PizzaBuilder{
    private Pizza.Builder pizzaBuilder;

    public VegPizzaBuilder() {
        this.pizzaBuilder = new Pizza.Builder();
    }

    @Override
    public PizzaBuilder setSize(String size) {
        pizzaBuilder.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        pizzaBuilder.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        pizzaBuilder.addTopping(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return pizzaBuilder.build();
    }
}
