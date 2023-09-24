package practices.one;

import practices.one.abstracts.AbstractVehicle;
import practices.one.enums.FuelType;
import practices.one.enums.VehicleDimension;
import practices.one.interfaces.IFuel;
import practices.one.interfaces.IVehicle;

public class Motorcycle extends AbstractVehicle implements IFuel {
    private FuelType fuelType;
    private Integer fuelTankVolume;

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void setFuelTankVolume(Integer volume) {
        this.fuelTankVolume = volume;
    }

    @Override
    protected void assignVehicleDimension() {
        setDimension(VehicleDimension.SHORT);
    }
}
