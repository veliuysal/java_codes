package oop;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        //metodu çağır
    }
    ///
}

public class GarbageCollector1 {
    public static void main(String[] args) {
        Animal animal = new Animal("donkey");
        animal=null;
    }
}
