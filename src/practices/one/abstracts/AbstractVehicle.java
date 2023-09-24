package practices.one.abstracts;

import practices.one.enums.VehicleDimension;

public abstract class AbstractVehicle {
    abstract void setVehicleDimension(VehicleDimension dimension);

    void run() {
        System.out.println("Vehicle is starting...");
    }

    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}
