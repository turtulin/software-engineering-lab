package it.unicam.cs.ids.designPatterns.factoryMethod;

import it.unicam.cs.ids.designPatterns.factoryMethod.shapes.Shape;
import it.unicam.cs.ids.designPatterns.factoryMethod.shapes.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
