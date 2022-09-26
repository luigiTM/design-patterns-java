package factory.transport.impl;

import factory.transport.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }

}
