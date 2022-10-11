package creational.prototype.shape.impl;

import creational.prototype.shape.Shape;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

}
