package factoryMethod.example2.factory;

import factoryMethod.example2.logistics.Plane;
import factoryMethod.example2.logistics.Transport;

public class AirLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
