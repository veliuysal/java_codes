package generics;

interface Bottle {
    void setBrand(String brand);

    String getBrand();

    void setCapacity(int capacity);

    int getCapacity();

    void setType(String type);

    String getType();
}

class MainBottle implements Bottle {

    private String brand;
    private int capacity;
    private String type;

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
}

class GlassBottle extends MainBottle {

}

class PetBottle extends MainBottle {

}

class CarboyBottle extends MainBottle {

}

public class BottleGenericsClass<T extends MainBottle> {

    // Şişe isminde bir interface olsun. bu interface içerisinde marka, kapasite, tipi set ve get metodlar bulunsun.
    //bu interface'i implemente eden Cam, Pet ve Damaca isminde 3 class yazalım ve Bu classlarla işlem yapacak bir Generics Class olsun.
    // Bu class içerisinde ise ekrana yazdır metodu bulunsun.

    public void print(T data) {
        System.out.println(data.getBrand() + " - " + data.getType() + " - " + data.getCapacity());
    }

    public static void main(String[] args) {
        GlassBottle glassBottle=new GlassBottle();
        glassBottle.setBrand("Erikli");
        glassBottle.setCapacity(1000);
        glassBottle.setType("Glass");

        BottleGenericsClass<GlassBottle> glass = new BottleGenericsClass<>();
        glass.print(glassBottle);

    }
}
