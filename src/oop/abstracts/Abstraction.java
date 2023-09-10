package oop.abstracts;

abstract class MotorBike {
    abstract void brake();
}

class SportsBike extends MotorBike {

    @Override
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}

class MountainBike extends  MotorBike {
    @Override
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        MountainBike m1= new MountainBike();
        SportsBike m2 = new SportsBike();

        m1.brake();
        m2.brake();
    }

}
