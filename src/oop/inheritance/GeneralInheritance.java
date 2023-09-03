package oop.inheritance;

class Animal1 {
    String name;
    int age;
    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void sound() {
        System.out.println("Animal makes a sound");
    }
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal1 {
    String breed;
    public Dog1(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    void fetch() {
        System.out.println("Dog is fetching");
    }
}

class Cat extends Animal1 {
    boolean isLazy;

    public Cat(String name, int age, boolean isLazy) {
        super(name, age);
        this.isLazy = isLazy;
    }

    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    void climb() {
        System.out.println("Cat is climbing");
    }
}

class Bird extends Animal1 {
    String species;

    public Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    void sound() {
        System.out.println("Bird sings");
    }

    void fly() {
        System.out.println("Bird is flying");
    }
}

public class GeneralInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1("Buddy", 3, "Labrador");
        Cat cat = new Cat("Whiskers", 2, true);
        Bird bird = new Bird("Tweety", 1, "Canary");

        dog.sound(); // Output: Dog barks
        dog.eat();   // Output: Animal is eating
        dog.fetch(); // Output: Dog is fetching

        cat.sound(); // Output: Cat meows
        cat.eat();   // Output: Animal is eating
        cat.climb(); // Output: Cat is climbing

        bird.sound(); // Output: Bird sings
        bird.eat();   // Output: Animal is eating
        bird.fly();   // Output: Bird is flying
    }
}
