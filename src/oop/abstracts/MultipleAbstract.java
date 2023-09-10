package oop.abstracts;

abstract class Engine {

    public static String engine="Engine";

    abstract void engineMethod();
}

abstract class LandEngine extends Engine {
    public static void example(){
        System.out.println("This is a Static Example In Abstract Class");
    }
}

class CarEngine extends LandEngine {

    @Override
    void engineMethod() {

    }
}

public class MultipleAbstract {
    public static void main(String[] args) {
        LandEngine.example();
        String name = Engine.engine;
    }
}
