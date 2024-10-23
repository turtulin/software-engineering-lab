package it.unicam.cs.ids.designPatterns.builder.products;

import it.unicam.cs.ids.designPatterns.builder.Burger;
import it.unicam.cs.ids.designPatterns.builder.Packing;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return 45.5f;
    }
}
