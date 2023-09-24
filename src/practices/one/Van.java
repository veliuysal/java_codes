package practices.one;

import practices.one.enums.FuelType;
import practices.one.interfaces.IFuel;

public class Van extends Vehicle implements IFuel {
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
}
