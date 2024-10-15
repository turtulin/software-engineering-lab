package it.unicam.cs.ids.designPatterns.builder;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
