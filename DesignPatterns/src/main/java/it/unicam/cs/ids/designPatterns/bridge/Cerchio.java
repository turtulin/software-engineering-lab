package it.unicam.cs.ids.designPatterns.bridge;

public class Cerchio extends Forma {
    private int raggio;

    public Cerchio(int raggio, Colore colore) {
        super(colore);
        this.raggio = raggio;
    }

    @Override
    void disegna() {
        System.out.println("Cerchio disegna!");
        colore.applicaColore();
    }
}
