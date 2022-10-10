package creational.abstractfactory.factory.impl;

import creational.abstractfactory.factory.FurnitureFactory;
import creational.abstractfactory.furniture.chair.Chair;
import creational.abstractfactory.furniture.chair.impl.ModernChair;
import creational.abstractfactory.furniture.coffeetable.CoffeeTable;
import creational.abstractfactory.furniture.coffeetable.impl.ModernCoffeeTable;
import creational.abstractfactory.furniture.sofa.Sofa;
import creational.abstractfactory.furniture.sofa.impl.ModernSofa;

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
