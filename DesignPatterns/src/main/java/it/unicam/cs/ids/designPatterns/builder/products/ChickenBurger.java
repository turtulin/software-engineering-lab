package it.unicam.cs.ids.designPatterns.builder.products;

import it.unicam.cs.ids.designPatterns.builder.Burger;
import it.unicam.cs.ids.designPatterns.builder.Packing;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
