package it.unicam.cs.ids.designPatterns.bridge;

public class Quadrato extends Forma {
    private int lato;

    public Quadrato(int lato, Colore colore) {
        super(colore);
        this.lato = lato;
    }

    @Override
    void disegna() {
        System.out.println("Disegna quadrato");
        colore.applicaColore();
    }
}
