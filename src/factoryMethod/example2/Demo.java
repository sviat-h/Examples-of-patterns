package factoryMethod.example2;

import factoryMethod.example2.factory.*;
import factoryMethod.example2.logistics.Transport;

public class Demo {
    public static void main(String[] args) {
        Logistics logistics = createTransportBySpecification("train");
        Transport transport = logistics.createTransport();

        transport.deliver();
    }

    private static Logistics createTransportBySpecification(String specification) {
        if (specification.equalsIgnoreCase("truck")) {
            return new RoadLogistics();
        } else if (specification.equalsIgnoreCase("ship")) {
            return new SeaLogistics();
        } else if (specification.equalsIgnoreCase("plane")) {
            return new AirLogistics();
        } else if(specification.equalsIgnoreCase("train")){
            return new RailwayLogistics();
        }
        else {
            throw new RuntimeException(specification + "is unknown specification.");
        }
    }
}
