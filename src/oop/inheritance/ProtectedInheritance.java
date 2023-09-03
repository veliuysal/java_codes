package oop.inheritance;

class Animal2 {
    protected String name;

    protected void display(){
        System.out.println("I am an animal.");
    }
}

class Dog2 extends Animal2 {

   public void getInfo() {
       System.out.println("My name is "+ name);
   }
}

public class ProtectedInheritance {

    public static void main(String[] args) {

        Dog2 labrador = new Dog2();
        labrador.name = "Rocky";
        labrador.display();
        labrador.getInfo();
    }
}
