package factory.logistics.impl;

import factory.logistics.Logistics;
import factory.transport.Transport;
import factory.transport.impl.Truck;

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
