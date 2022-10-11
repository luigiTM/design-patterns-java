package structural.adapter.square;

import structural.adapter.round.RoundPeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }

}
