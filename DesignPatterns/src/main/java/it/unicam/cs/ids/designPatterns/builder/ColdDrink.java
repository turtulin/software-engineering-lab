package it.unicam.cs.ids.designPatterns.builder;

public abstract class ColdDrink implements Item {
    @Override
    public String name() {
        return "";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 0;
    }
}
