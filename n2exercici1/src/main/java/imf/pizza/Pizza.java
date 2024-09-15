package imf.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    private Pizza(String size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public static class Builder {
        private String size;
        private String dough;
        private List<String> toppings = new ArrayList<>();

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(size, dough, toppings);
        }
    }

    @Override
    public String toString() {
        return "Pizza\n" +
                "size: " + size + "\n" +
                "dough: " + dough + "\n" +
                "toppings: " + toppings;
    }
}
