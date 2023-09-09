package oop.polymorphism;

class Animal1 {
    int size = 8;

    public void feetSize() {
        System.out.println("Animal feetSize: " + size);
    }
}

class Dog1 extends Animal1 {

    int size = 4;

    @Override
    public void feetSize() {
        System.out.println("Dog feetSize: " + size);
    }

    public void gender() {
        System.out.println("man");
    }
}

class Terrier extends Dog1 {

    @Override
    public void feetSize() {
        System.out.println("Terrier feetSize: " + size);
    }

    @Override
    public void gender() {
        System.out.println("female");
    }
}

public class OverrideExample {

    public static void main(String[] args) {

        Animal1 animal = new Animal1();
        animal.feetSize();
        System.out.println(animal.size);
        //local variable
        //temp type Animal
        //object type Animal

        Animal1 dogAnimal = new Dog1();
        dogAnimal.feetSize();
        System.out.println(dogAnimal.size);
        //local variable
        //temp type Animal
        //object type Dog

        //Note : the instance variable can not be override
        Dog1 dog = new Dog1();
        dog.feetSize();
        System.out.println(dog.size);
        dog.gender();

        dog = new Terrier();
        dog.feetSize();
        System.out.println(dog.size);
        dog.gender();

    }
}
