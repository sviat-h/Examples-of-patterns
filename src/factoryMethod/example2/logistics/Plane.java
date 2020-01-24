package factoryMethod.example2.logistics;

public class Plane implements Transport {
    @Override
    public void deliver() {
        System.out.println("The plane delivers the goods by air.");
    }
}
