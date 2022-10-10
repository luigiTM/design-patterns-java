package creational.abstractfactory.furniture.coffeetable.impl;

import creational.abstractfactory.furniture.coffeetable.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public int width() {
        return 0;
    }

}
