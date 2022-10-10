package creational.factory.transport.impl;

import creational.factory.transport.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by land");
    }

}
