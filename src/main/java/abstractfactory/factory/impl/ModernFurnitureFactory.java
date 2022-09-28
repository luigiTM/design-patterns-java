package abstractfactory.factory.impl;

import abstractfactory.factory.FurnitureFactory;
import abstractfactory.furniture.chair.Chair;
import abstractfactory.furniture.chair.impl.ModernChair;
import abstractfactory.furniture.coffeetable.CoffeeTable;
import abstractfactory.furniture.coffeetable.impl.ModernCoffeeTable;
import abstractfactory.furniture.sofa.Sofa;
import abstractfactory.furniture.sofa.impl.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

}
