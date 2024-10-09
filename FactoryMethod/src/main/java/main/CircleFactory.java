package main;

import main.shape.Circle;
import main.shape.Shape;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
