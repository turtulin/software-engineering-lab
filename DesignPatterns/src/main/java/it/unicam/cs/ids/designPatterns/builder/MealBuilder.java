package it.unicam.cs.ids.designPatterns.builder;

import it.unicam.cs.ids.designPatterns.builder.products.ChickenBurger;
import it.unicam.cs.ids.designPatterns.builder.products.Coke;
import it.unicam.cs.ids.designPatterns.builder.products.Pepsi;
import it.unicam.cs.ids.designPatterns.builder.products.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
