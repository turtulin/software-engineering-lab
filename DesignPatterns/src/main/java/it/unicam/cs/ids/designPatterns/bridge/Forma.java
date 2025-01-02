package it.unicam.cs.ids.designPatterns.bridge;

abstract class Forma {
    protected Colore colore;
    public Forma(Colore colore) {
        this.colore = colore;
    }
    abstract void disegna();
}
