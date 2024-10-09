package it.unicam.cs.ids.designPatterns.factoryMethod;

import it.unicam.cs.ids.designPatterns.factoryMethod.shapes.Rectangle;
import it.unicam.cs.ids.designPatterns.factoryMethod.shapes.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
