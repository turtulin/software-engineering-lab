package it.unicam.cs.ids.designPatterns.factoryMethod;

import it.unicam.cs.ids.designPatterns.factoryMethod.shapes.Shape;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();

        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();

        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();
    }
}
