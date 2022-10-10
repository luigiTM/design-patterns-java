package creational.abstractfactory.factory.impl;

import creational.abstractfactory.factory.FurnitureFactory;
import creational.abstractfactory.furniture.chair.Chair;
import creational.abstractfactory.furniture.chair.impl.VictorianChair;
import creational.abstractfactory.furniture.coffeetable.CoffeeTable;
import creational.abstractfactory.furniture.coffeetable.impl.VictorianCoffeeTable;
import creational.abstractfactory.furniture.sofa.Sofa;
import creational.abstractfactory.furniture.sofa.impl.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

}
