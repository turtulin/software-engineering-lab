package it.unicam.cs.ids.designPatterns.builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle packing";
    }
}
