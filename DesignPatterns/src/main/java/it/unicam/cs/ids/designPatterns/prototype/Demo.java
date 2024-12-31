package it.unicam.cs.ids.designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 20;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
        System.out.println(circle);
        System.out.println(anotherCircle);
        System.out.println(rectangle);

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i) + " " + shapesCopy.get(i));
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + " shapes are different objects " + shapesCopy.get(i));
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + " and they are identical " + shapesCopy.get(i));
                } else {
                    System.out.println(i + " but they are not identical " + shapesCopy.get(i));
                }
            } else {
                System.out.println(i + " shape objects are the same " + shapesCopy.get(i));
            }
        }
    }
}
