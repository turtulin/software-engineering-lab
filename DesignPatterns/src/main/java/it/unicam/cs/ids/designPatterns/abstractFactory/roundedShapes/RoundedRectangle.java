package it.unicam.cs.ids.designPatterns.abstractFactory.roundedShapes;

import it.unicam.cs.ids.designPatterns.abstractFactory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rounded Rectangle");
    }
}
