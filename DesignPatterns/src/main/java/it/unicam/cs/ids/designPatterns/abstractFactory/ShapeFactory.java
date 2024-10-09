package it.unicam.cs.ids.designPatterns.abstractFactory;

import it.unicam.cs.ids.designPatterns.abstractFactory.shapes.Rectangle;
import it.unicam.cs.ids.designPatterns.abstractFactory.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equals("square")) {
            return new Square();
        } else if (shapeType.equals("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
