package imf.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    public Pizza(String size, String dough, List<String> toppings) {
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

    @Override
    public String toString() {
        return "Pizza\n" +
                "size: " + size + "\n" +
                "dough: " + dough + "\n" +
                "toppings: " + toppings;
    }
}
