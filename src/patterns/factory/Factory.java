package patterns.factory;

interface Car {
    void name();

    void price(int price);
}

class Porsche implements Car {

    @Override
    public void name() {
        System.out.println("Car's name is: Porsche");
    }

    @Override
    public void price(int price) {
        System.out.println("Porsche's price: " + price);
    }
}

class Bmw implements Car {

    @Override
    public void name() {
        System.out.println("Car's name is: BMW");
    }

    @Override
    public void price(int price) {
        System.out.println("BMW's price: " + price);
    }
}

class CarFactory{

    public static Car createCar(Class aClass) throws InstantiationException, IllegalAccessException {
        return (Car) aClass.newInstance();
    }
}

public class Factory {

    public static void main(String[] args) {
        try {
            Bmw bmw = (Bmw) CarFactory.createCar(Bmw.class);
            bmw.name();
            bmw.price(50000);

            Porsche porsche = (Porsche) CarFactory.createCar(Porsche.class);
            porsche.name();
            porsche.price(100000);
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
