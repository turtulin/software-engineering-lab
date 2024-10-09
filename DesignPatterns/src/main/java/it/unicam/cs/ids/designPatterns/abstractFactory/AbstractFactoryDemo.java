package it.unicam.cs.ids.designPatterns.abstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape shape3 = roundedShapeFactory.getShape("rounded square");
        shape3.draw();

        Shape shape4 = roundedShapeFactory.getShape("rounded rectangle");
        shape4.draw();
    }
}
