package practices.one;

import java.util.List;

public class CallVehicleFabric {

    public static void main(String[] args) {
        VehicleFabric vehicleFabric = new VehicleFabric();
        vehicleFabric.productCar(100);
        vehicleFabric.productVans(15);
        vehicleFabric.productMotorcycles(500);
        vehicleFabric.productBicycles(5);

        vehicleFabric.printAll();

        List<Car> soldCars = vehicleFabric.sell(VehicleFabric.cars, 20);
        List<Motorcycle> soldMotorcycles = vehicleFabric.sell(VehicleFabric.motorcycles, 300);
        List<Van> soldVans = vehicleFabric.sell(VehicleFabric.vans, 15);
        List<Bicycle> soldBicycles = vehicleFabric.sell(VehicleFabric.bicycles, 3);

        System.out.println("----------------------------------------");

        vehicleFabric.printAll();

        System.out.println("*********************************************");
        vehicleFabric.add(VehicleFabric.soldBicycles, soldBicycles);
        vehicleFabric.add(VehicleFabric.soldMotorcycles, soldMotorcycles);

        vehicleFabric.print(VehicleFabric.soldMotorcycles, "Sold Motorcycles Size: ");
        vehicleFabric.print(VehicleFabric.soldBicycles, "Sold Bicycles Size: ");

        vehicleFabric.addAndPrintAll(VehicleFabric.soldCars, soldCars, "Sold Cars Size: ");
        vehicleFabric.addAndPrintAll(VehicleFabric.soldVans, soldVans, "Sold Vans Size: ");
    }
}
