package oop.interfaces;


interface StaticMethodInterface {
    public static void staticMethod(){
        System.out.println("Static method.");
    }

    private static void privateStaticMethod(){
        System.out.println("private static method.");
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        StaticMethodInterface.staticMethod();
    }
}
