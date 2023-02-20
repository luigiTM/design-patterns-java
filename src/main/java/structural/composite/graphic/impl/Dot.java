package structural.composite.graphic.impl;

import structural.composite.graphic.Graphic;

public class Dot implements Graphic {

    private int x;
    private int y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        //Draw line at x and y
    }

}
