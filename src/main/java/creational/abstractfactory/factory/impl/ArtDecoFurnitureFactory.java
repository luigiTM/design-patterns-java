package creational.abstractfactory.factory.impl;

import creational.abstractfactory.factory.FurnitureFactory;
import creational.abstractfactory.furniture.chair.Chair;
import creational.abstractfactory.furniture.chair.impl.ArtDecoChair;
import creational.abstractfactory.furniture.coffeetable.CoffeeTable;
import creational.abstractfactory.furniture.coffeetable.impl.ArtDecoCoffeeTable;
import creational.abstractfactory.furniture.sofa.Sofa;
import creational.abstractfactory.furniture.sofa.impl.ArtDecoSofa;

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
