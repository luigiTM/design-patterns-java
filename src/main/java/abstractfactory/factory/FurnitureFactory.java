package abstractfactory.factory;

import abstractfactory.furniture.chair.Chair;
import abstractfactory.furniture.coffeetable.CoffeeTable;
import abstractfactory.furniture.sofa.Sofa;

public interface FurnitureFactory {

    Chair createChair();

    CoffeeTable createCoffeeTable();

    Sofa createSofa();

}
