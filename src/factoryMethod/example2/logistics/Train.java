package factoryMethod.example2.logistics;

public class Train implements Transport {
    @Override
    public void deliver() {
        System.out.println("The train delivers goods by rail.");
    }
}
