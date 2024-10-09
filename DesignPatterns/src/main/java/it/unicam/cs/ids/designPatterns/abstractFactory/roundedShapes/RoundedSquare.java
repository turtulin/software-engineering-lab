package it.unicam.cs.ids.designPatterns.abstractFactory.roundedShapes;

import it.unicam.cs.ids.designPatterns.abstractFactory.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rounded Square");
    }
}
