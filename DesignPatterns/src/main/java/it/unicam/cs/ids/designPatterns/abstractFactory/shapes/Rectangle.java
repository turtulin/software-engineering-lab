package it.unicam.cs.ids.designPatterns.abstractFactory.shapes;

import it.unicam.cs.ids.designPatterns.abstractFactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
