package creational.prototype;

public abstract class Shape {

    private int x;
    private int y;
    private String color;


    public Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone();
}
