package it.unicam.cs.ids.designPatterns.abstractFactory;

import it.unicam.cs.ids.designPatterns.abstractFactory.roundedShapes.RoundedRectangle;
import it.unicam.cs.ids.designPatterns.abstractFactory.roundedShapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equals("rounded square")) {
            return new RoundedSquare();
        } else if (shapeType.equals("rounded rectangle")) {
            return new RoundedRectangle();
        }
        return null;
    }
}
