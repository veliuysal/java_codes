package oop.wrapper;

public class BoxingExample {
    public static void main(String[] args) {
        Integer autoboxing = 100; //100 -> primitive int tipindedir.

        //BOXING
        Integer boxing = new Integer(100);
        Integer boxing2 = Integer.valueOf(100);

        //AUTOUNBOXING
        Integer number = 100; // autoboxing
        int autoUnBoxing = number; //auto unboxing

        //UNBOXING
        int unboxing = number.intValue();
    }
}
