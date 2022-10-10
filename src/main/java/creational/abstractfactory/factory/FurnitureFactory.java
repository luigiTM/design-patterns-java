package creational.abstractfactory.factory;

import creational.abstractfactory.furniture.chair.Chair;
import creational.abstractfactory.furniture.coffeetable.CoffeeTable;
import creational.abstractfactory.furniture.sofa.Sofa;

public interface FurnitureFactory {

    Chair createChair();

    CoffeeTable createCoffeeTable();

    Sofa createSofa();

}
