package practices.one;

import practices.one.abstracts.AbstractVehicle;
import practices.one.enums.VehicleDimension;
import practices.one.interfaces.IVehicle;

public class Bicycle extends AbstractVehicle {

    @Override
    protected void assignVehicleDimension() {
        System.out.println("Empty Method...");
    }

    @Override
    public void run() {
        System.out.println("This method not use in Bicycle...");
    }

    @Override
    public void stop() {
        System.out.println("This method not use in Bicycle...");
    }
}
