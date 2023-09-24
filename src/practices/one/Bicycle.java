package practices.one;

public class Bicycle extends Vehicle {

    @Override
    public void run() {
        System.out.println("This method not use in Bicycle...");
    }

    @Override
    public void stop() {
        System.out.println("This method not use in Bicycle...");
    }
}
