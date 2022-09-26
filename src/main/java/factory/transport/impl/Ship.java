package factory.transport.impl;

import factory.transport.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }

}
