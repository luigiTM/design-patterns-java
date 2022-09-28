package abstractfactory.furniture.chair.impl;

import abstractfactory.furniture.chair.Chair;

public class ModernChair implements Chair {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {

    }

}
