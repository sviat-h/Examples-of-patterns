package factoryMethod.example2.logistics;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("The truck delivers the goods by road.");
    }
}
