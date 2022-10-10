package creational.abstractfactory.furniture.chair.impl;

import creational.abstractfactory.furniture.chair.Chair;

public class ArtDecoChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {

    }

}
