package factoryMethod.example2.factory;

import factoryMethod.example2.logistics.Transport;

public abstract class Logistics {

//    void planDelivery() {
//        Transport transport = createTransport();
//    }

    public abstract Transport createTransport();
}
