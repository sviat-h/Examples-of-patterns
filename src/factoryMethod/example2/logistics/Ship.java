package factoryMethod.example2.logistics;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("The ship delivers the goods by sea.");
    }
}
