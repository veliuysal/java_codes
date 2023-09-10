package oop.wrapper;

public class WrapperFunctions {
    public static void main(String[] args) {
        System.out.println("------Integer-------");
        Integer integer1 = Integer.valueOf("50");//String --> Wrapper
        System.out.println(integer1);
        
        System.out.println("------Boolean-------");
        Boolean boolean1 = Boolean.valueOf("falsE");
        Boolean boolean2 = Boolean.valueOf(true);
        Boolean boolean3 = Boolean.valueOf("TruE");
        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(boolean3);

        System.out.println("------Float-------");
        Float float1 = Float.valueOf("4.4"); //String -> wrapper
        System.out.println(float1);

        System.out.println("------Short&Byte value of Integer-------");
        //xxxValue
        Integer integer2 = new Integer(150);
        int int1 = integer2.shortValue(); //wrapper -> primitive
        byte byte1 = integer2.byteValue();
        System.out.println(int1);
        System.out.println(byte1);

        System.out.println("------parseInt method of Integer-------");
        //parsexxx
        int int2 = Integer.parseInt("120"); // string -> primitive
    }
}
