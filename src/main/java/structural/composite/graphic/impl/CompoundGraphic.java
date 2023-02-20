package structural.composite.graphic.impl;

import structural.composite.graphic.Graphic;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private List<Graphic> graphics;


    public CompoundGraphic() {
        this.graphics = new ArrayList<>();
    }

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        graphics.forEach(graphic -> graphic.move(x, y));
    }

    @Override
    public void draw() {

    }
}
