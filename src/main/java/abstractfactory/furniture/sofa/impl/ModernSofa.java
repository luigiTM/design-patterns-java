package abstractfactory.furniture.sofa.impl;

import abstractfactory.furniture.sofa.Sofa;

public class ModernSofa implements Sofa {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public int numberOfSeats() {
        return 0;
    }

}