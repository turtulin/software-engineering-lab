package it.unicam.cs.ids.designPatterns.factoryMethod.shapes;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
