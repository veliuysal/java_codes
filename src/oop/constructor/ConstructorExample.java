package oop.constructor;

public class ConstructorExample {

    private String name;

    ConstructorExample() {
        System.out.println("Consturctor Called...");
        name = "BilgeAdam";
    }

    public static void main(String[] args) {
        ConstructorExample example= new ConstructorExample();
        System.out.println("The name is "+ example.name);
    }

}
