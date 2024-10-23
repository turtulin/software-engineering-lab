package it.unicam.cs.ids.designPatterns.builder;

public abstract class Burger implements Item {
    @Override
    public String name() {
        return "";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
