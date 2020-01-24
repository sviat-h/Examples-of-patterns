package factoryMethod.example2.factory;

import factoryMethod.example2.logistics.Transport;
import factoryMethod.example2.logistics.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
