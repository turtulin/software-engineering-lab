package main;

import main.shape.Shape;
import main.shape.Square;

public class SquareFactory extends ShapeFactory{
    @Override
    public Shape getShape() {
        return new Square();
    }
}
