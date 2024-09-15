package imf;

import imf.builders.HawaiianPizzaBuilder;
import imf.builders.PizzaBuilder;
import imf.builders.VegPizzaBuilder;
import imf.pizza.Pizza;
import imf.pizzamaster.PizzaMaster;

import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaMaster hawaiianMaster = new PizzaMaster(hawaiianBuilder);
        List<String> toppingsHawaiian = Arrays.asList("Extra Cheese", "Pepper");
        Pizza hawPizza = hawaiianMaster.createPizza("Large", "Thin crust", toppingsHawaiian);
        System.out.println(hawPizza);

        PizzaBuilder vegBuilder = new VegPizzaBuilder();
        PizzaMaster vegMaster = new PizzaMaster(vegBuilder);
        List<String> toppingsVeg = Arrays.asList("Olives", "Pepper", "Rocket");
        Pizza vegPizza = vegMaster.createPizza("Medium", "Thick crust", toppingsVeg);
        System.out.println(vegPizza);

    }
}

