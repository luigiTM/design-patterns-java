package abstractfactory.factory.impl;

import abstractfactory.factory.FurnitureFactory;
import abstractfactory.furniture.chair.Chair;
import abstractfactory.furniture.chair.impl.ArtDecoChair;
import abstractfactory.furniture.coffeetable.CoffeeTable;
import abstractfactory.furniture.coffeetable.impl.ArtDecoCoffeeTable;
import abstractfactory.furniture.sofa.Sofa;
import abstractfactory.furniture.sofa.impl.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

}
