package creational.factory.transport.impl;

import creational.factory.transport.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by sea");
    }

}
