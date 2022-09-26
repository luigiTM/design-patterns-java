package factory.logistics;

import factory.transport.Transport;

public interface Logistics {

    void planDelivery();

    abstract void createTransport();

}
