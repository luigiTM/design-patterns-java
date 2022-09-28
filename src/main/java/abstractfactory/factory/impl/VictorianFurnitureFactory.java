package abstractfactory.factory.impl;

import abstractfactory.factory.FurnitureFactory;
import abstractfactory.furniture.chair.Chair;
import abstractfactory.furniture.chair.impl.VictorianChair;
import abstractfactory.furniture.coffeetable.CoffeeTable;
import abstractfactory.furniture.coffeetable.impl.VictorianCoffeeTable;
import abstractfactory.furniture.sofa.Sofa;
import abstractfactory.furniture.sofa.impl.VictorianSofa;

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
