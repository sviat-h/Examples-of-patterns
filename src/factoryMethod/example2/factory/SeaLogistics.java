package factoryMethod.example2.factory;

import factoryMethod.example2.logistics.Ship;
import factoryMethod.example2.logistics.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
