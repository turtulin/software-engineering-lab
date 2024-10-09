package it.unicam.cs.ids.designPatterns.factoryMethod.shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
