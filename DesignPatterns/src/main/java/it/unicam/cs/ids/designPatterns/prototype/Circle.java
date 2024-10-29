package it.unicam.cs.ids.designPatterns.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle circle) || !super.equals(o)) return false;
        return circle.radius == radius;
    }
}
