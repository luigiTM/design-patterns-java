package creational.prototype.shape.impl;

import creational.prototype.shape.Shape;

public class Circle extends Shape {

    private int radius;

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

}
