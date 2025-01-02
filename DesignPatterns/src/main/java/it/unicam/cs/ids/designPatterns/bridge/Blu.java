package it.unicam.cs.ids.designPatterns.bridge;

public class Blu implements Colore {
    @Override
    public void applicaColore() {
        System.out.println("Blu colore");
    }
}
