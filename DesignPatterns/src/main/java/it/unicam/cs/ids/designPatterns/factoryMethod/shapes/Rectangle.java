package it.unicam.cs.ids.designPatterns.factoryMethod.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
