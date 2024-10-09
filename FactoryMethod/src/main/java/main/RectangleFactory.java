package main;

import main.shape.*;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
