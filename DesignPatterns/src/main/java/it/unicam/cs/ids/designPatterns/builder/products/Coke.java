package it.unicam.cs.ids.designPatterns.builder.products;

import it.unicam.cs.ids.designPatterns.builder.ColdDrink;
import it.unicam.cs.ids.designPatterns.builder.Packing;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return super.name();
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float price() {
        return super.price();
    }
}
