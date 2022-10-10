package creational.prototype.impl;

import creational.prototype.Shape;

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
