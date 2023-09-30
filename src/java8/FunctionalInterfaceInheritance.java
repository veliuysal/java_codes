package java8;

@FunctionalInterface
interface Animal {
    void eat();
}

@FunctionalInterface
interface Dog extends Animal {
}

public class FunctionalInterfaceInheritance {
}
