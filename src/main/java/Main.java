import creational.factory.logistics.Logistics;
import creational.factory.logistics.impl.RoadLogistics;
import creational.factory.logistics.impl.SeaLogistics;

public class Main {

    public static void main(String[] args){
        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();

        roadLogistics.createTransport();
        seaLogistics.createTransport();

        roadLogistics.planDelivery();
        seaLogistics.planDelivery();
    }

}
