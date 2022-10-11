package structural.adapter;

import structural.adapter.round.RoundHole;
import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;
import structural.adapter.square.SquarePegAdapter;

public class AdapterMain {

    public static void main(String[] args){

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        roundHole.fits(roundPeg);

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        roundHole.fits(smallSquarePegAdapter);
        roundHole.fits(largeSquarePegAdapter);

    }

}
