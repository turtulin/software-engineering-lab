package it.unicam.cs.ids.designPatterns.bridge;

public class Demo {
    public static void main(String[] args) {
        Colore rosso = new Rosso();
        Colore blu = new Blu();
        Colore verde = new Verde();

        Forma cerchioRosso = new Cerchio(5, rosso);
        Forma cerchioBlu = new Cerchio(2, blu);
        Forma quadratoBlu = new Quadrato(4, blu);
        Forma cerchioVerde = new Cerchio(7, verde);

        cerchioRosso.disegna();
        quadratoBlu.disegna();
        cerchioVerde.disegna();
        cerchioBlu.disegna();
    }
}
