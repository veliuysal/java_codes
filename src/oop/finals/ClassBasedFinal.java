package oop.finals;

final class FinalClass {
    public void display() {
        System.out.println("FinalClass -> This is a final method.");
    }
}

//public class ClassBasedFinal extends FinalClass{
public class ClassBasedFinal {

    public void display() {
        System.out.println("ClassBasedFinal -> The final methos is overridden.");
    }

    public static void main(String[] args) {
        ClassBasedFinal obj = new ClassBasedFinal();
        obj.display();
    }
}
