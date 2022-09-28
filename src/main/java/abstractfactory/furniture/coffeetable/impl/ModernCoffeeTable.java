package abstractfactory.furniture.coffeetable.impl;

import abstractfactory.furniture.coffeetable.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public int width() {
        return 0;
    }

}
