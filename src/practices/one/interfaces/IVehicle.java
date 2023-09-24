package practices.one.interfaces;

import practices.one.enums.Colour;
import practices.one.enums.EngineType;
import practices.one.enums.GearType;
import practices.one.enums.TireCount;

public interface IVehicle {

    void assignAttribute(EngineType engineType, Integer year, TireCount tireCount, String model, Colour colour, GearType gearType);

    void run();

    void stop();
}
