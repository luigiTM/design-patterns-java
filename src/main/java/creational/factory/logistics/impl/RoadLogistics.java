package creational.factory.logistics.impl;

import creational.factory.transport.Transport;
import creational.factory.transport.impl.Truck;
import creational.factory.logistics.Logistics;

public class RoadLogistics implements Logistics {

    Transport transport;

    @Override
    public void planDelivery() {
        transport.deliver();
    }

    @Override
    public void createTransport() {
        transport = new Truck();
    }

}
