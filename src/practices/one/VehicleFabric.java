package practices.one;

import practices.one.enums.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehicleFabric {
    //Bizim bir fabrikamız var ve bu fabrikada hem otomobil, hem kamyonet hem de motorsiklet ve bisiklet üretilmektedir.
    //Bu üretim esnasında bizim temel işlevleri yönetebileceğimiz bir yapı kurgulanmak istenmektedir. Bu kurgu için öncelikli olarak
    //çıktı değerleri ve üretim aşamasında bizim ürettiğimiz tipteki taşıtlar için temel fonksiyoneliteler olması gerekmektedir.
    //

    //Enumlar
    //MotorDurumu => Motorlu, Motorsuz
    //LastikSayisi => Tek Teker, İki teker, 3 teker, 4 Teker, 6 Teker, 8 Teker, 10 teker
    //AracBoyutu => Uzun, Kısa
    //Renk => Siyah, Beyaz, Kırmızı, Mavi, Gri, Yeşil
    //YakitTuru => Benzin, Dizel, LPG, NO
    //VitesTuru => Otomatik, Manuel

    //Interfaceler

    //Taşıt Interface'i
    //void motorDurumu(MotorDurumu);
    //void uretimYili(Integer);
    //void lastikSayisi(LastikSayisi);
    //void setModel(String);
    //void setRenk(Renk);
    //void setVitesTuru(VitesTuru);

    //Yakıt Interface'i
    //void setYakitTuru(YakitTuru);
    //void setDepoHacmi(Integer);

    //Abstract Araç Class
    //abstract setBoyut(AracBoyut);
    //void calistir();
    //void durdur();

    static List<Car> cars;
    static List<Bicycle> bicycles;
    static List<Motorcycle> motorcycles;
    static List<Van> vans;

    static List<Car> soldCars;
    static List<Bicycle> soldBicycles;
    static List<Motorcycle> soldMotorcycles;
    static List<Van> soldVans;

    VehicleFabric() {
        cars = new ArrayList<>();
        bicycles = new ArrayList<>();
        motorcycles = new ArrayList<>();
        vans = new ArrayList<>();
        soldBicycles = new ArrayList<>();
        soldMotorcycles = new ArrayList<>();
        soldCars = new ArrayList<>();
        soldVans = new ArrayList<>();
        System.out.println("Vehicle Fabric is started to product...");
    }

    public void productCar(int count) {
        for (int i = 0; i < count; i++) {
            Car car = new Car();
            car.setFuelTankVolume(30);
            car.setColour(Colour.BLACK);
            car.setEngineType(EngineType.HAS_ENGINE);
            car.setGearType(GearType.MANUEL);
            car.setModel("Anadolu");
            car.setProductionYear(2023);
            car.setTireCount(TireCount.FOUR_TIRE);
            car.setFuelType(FuelType.DIESEL);
            cars.add(car);
        }
    }

    public void productMotorcycles(int count) {
        for (int i = 0; i < count; i++) {
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.setFuelTankVolume(10);
            motorcycle.setColour(Colour.RED);
            motorcycle.setEngineType(EngineType.HAS_ENGINE);
            motorcycle.setGearType(GearType.MANUEL);
            motorcycle.setModel("Yamaka");
            motorcycle.setProductionYear(2023);
            motorcycle.setTireCount(TireCount.THREE_TIRE);
            motorcycle.setFuelType(FuelType.ELECTRIC);
            motorcycles.add(motorcycle);
        }
    }

    public void productVans(int count) {
        for (int i = 0; i < count; i++) {
            Van van = new Van();
            van.setFuelTankVolume(80);
            van.setColour(Colour.WHITE);
            van.setEngineType(EngineType.HAS_ENGINE);
            van.setGearType(GearType.OTOMATIC);
            van.setModel("Serçedes");
            van.setProductionYear(2020);
            van.setTireCount(TireCount.EIGHT_TIRE);
            van.setFuelType(FuelType.GASOLINE);
            vans.add(van);
        }
    }

    public void productBicycles(int count) {
        for (int i = 0; i < count; i++) {
            Bicycle bicycle = new Bicycle();
            bicycle.setColour(Colour.GREEN);
            bicycle.setEngineType(EngineType.NO_ENGINE);
            bicycle.setGearType(GearType.MANUEL);
            bicycle.setModel("Yayanki");
            bicycle.setProductionYear(2024);
            bicycle.setTireCount(TireCount.ONE_TIRE);
            bicycles.add(bicycle);
        }
    }

    public <T> List<T> sell(List<T> list, int count) {
        List<T> soldList = new ArrayList<>();
        if (list == null || count > list.size()) {
            return soldList;
        }

        for (int i = 0; i < count; i++) {
            T element = list.get(list.size() - 1);
            soldList.add(element);
            list.remove(list.size() - 1);
        }
        return soldList;
    }

    public <T> void add(List<T> list, List<T> sold) {
        list.addAll(sold);
    }

    public <T> void addAndPrintAll(List<T> list, List<T> sold, String printWords) {
        list.addAll(sold);
        print(list, printWords);
    }

    public <T> void print(List<T> list, String printWords) {
        System.out.println(printWords + list.size());
    }

    public void printAll() {
        System.out.println("Cars: " + cars.size());
        System.out.println("Motorcycles: " + motorcycles.size());
        System.out.println("Vans: " + vans.size());
        System.out.println("Bicycles: " + bicycles.size());
    }

}
