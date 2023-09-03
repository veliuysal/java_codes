package oop.constructor;

public class ParameterizedConstructor {

    // Bizim bir nesnemiz olsun. Bu nesne bizim gerçek hayattaki şişeleri yazılımsal olarak kullanmamıza yardımcı olur.
    // Şişenin kapasitesi, şişe Tipi, markası isminde özelliklere sahiptir. Bu özellikleri kullanarak constructorlar yazmamız gerekmektedir.
    // Biz bir şişe örneği oluşturmak istediğimizde bir kaç yönteme sahip olmamız bekleniyor.
    // 1. sadece kapasitesi üzerinden ilerleyerek bizim bir class oluşturup daha sonra diğer özellikleri ekleme imkanı
    //2. kapasitesi ve şişe tipine göre bir yeni class oluşturup daha sonra bu şişenin markası eklenebiliyor.
    //3. tüm özelliklerini şişe objesi oluşturulurken atayabildiğimiz bir durumda mevcuttur.

    int capacity;
    String bottleType;
    String brand;

    ParameterizedConstructor(int capacity) {
        this.capacity = capacity;
    }

    ParameterizedConstructor(int capacity, String bottleType) {
        this.capacity = capacity;
        this.bottleType = bottleType;
    }

    ParameterizedConstructor(int capacity, String bottleType, String brand) {
        this.capacity = capacity;
        this.bottleType = bottleType;
        this.brand = brand;
    }

    public static void main(String[] args) {

        ParameterizedConstructor example1 = new ParameterizedConstructor(1000);
        example1.bottleType = "Pet";
        example1.brand = "Erikli";

        ParameterizedConstructor example2 = new ParameterizedConstructor(300, "Cam");
        example2.brand = "Erikli";

        ParameterizedConstructor example3 = new ParameterizedConstructor(500, "Pet", "Saka");

        printInfo(example1);
        printInfo(example2);
        printInfo(example3);
    }

    public static void printInfo(ParameterizedConstructor example){
        System.out.println("Example: "+ example.brand+" markasının "+example.capacity+" kapasiteli "+example.bottleType+" şişesidir.");
    }

}
