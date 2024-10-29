package it.unicam.cs.ids.designPatterns.prototype;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle) || !super.equals(o)) return false;
        return rectangle.width == width && rectangle.height == height;
    }
}
