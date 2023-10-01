package java8.functional;

@FunctionalInterface
interface Animal {
    void eat();
}

@FunctionalInterface
interface Dog extends Animal {
}

public class FunctionalInterfaceInheritance {
}
