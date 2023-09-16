package oop.finals;

class FinalDemo {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

public class MethodBasedFinal extends FinalDemo{

    /*public final void display(){
        System.out.println("The final method is overriden.");
    }*/

    public static void main(String[] args) {
        MethodBasedFinal obj = new MethodBasedFinal();
        obj.display();
    }
}
