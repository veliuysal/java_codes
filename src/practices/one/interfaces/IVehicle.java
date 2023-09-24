package practices.one.interfaces;

import practices.one.enums.Colour;
import practices.one.enums.EngineType;
import practices.one.enums.GearType;
import practices.one.enums.TireCount;

public interface IVehicle {
    void setEngineType(EngineType engineType);

    void setProductionYear(Integer year);

    void setTireCount(TireCount tireCount);

    void setModel(String model);

    void setColour(Colour colour);

    void setGearType(GearType gearType);
}
