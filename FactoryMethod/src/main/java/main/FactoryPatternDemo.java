package main;

import main.shape.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args){
        RectangleFactory rectangleFactory = new RectangleFactory();
        Shape shape = rectangleFactory.getShape();
        shape.draw();
        CircleFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getShape();
        circle.draw();
        SquareFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.getShape();
        square.draw();
    }
}
