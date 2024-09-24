package imf.builders;

import imf.pizza.Pizza;

public class HawaiianPizzaBuilder implements PizzaBuilder{
    private final PizzaBuilderImpl pizzaBuilder;

    public HawaiianPizzaBuilder() {
        this.pizzaBuilder = new PizzaBuilderImpl();
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
        pizzaBuilder.addTopping("Pineapple");
        return pizzaBuilder.build();
    }
}
