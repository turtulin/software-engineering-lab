package it.unicam.cs.ids.designPatterns.bridge;

public class Rosso implements Colore {
    @Override
    public void applicaColore() {
        System.out.println("Colore Rosso");
    }
}
