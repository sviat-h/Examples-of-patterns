package factoryMethod.example2.factory;

import factoryMethod.example2.logistics.Train;
import factoryMethod.example2.logistics.Transport;

public class RailwayLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
