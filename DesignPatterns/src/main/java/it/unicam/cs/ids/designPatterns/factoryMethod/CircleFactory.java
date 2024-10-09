package it.unicam.cs.ids.designPatterns.factoryMethod;

import it.unicam.cs.ids.designPatterns.factoryMethod.shapes.Circle;
import it.unicam.cs.ids.designPatterns.factoryMethod.shapes.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
