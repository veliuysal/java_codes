package oop.polymorphism;

class MathOperations {

    double add(int a, double b) {
        System.out.println("1");
        return a + b;
    }

    double add(double a, int b) {
        System.out.println("2");
        return (a + b);
    }
}

public class CompileTime {

    public static void main(String[] args) {
        MathOperations ops = new MathOperations();
        double result1 = ops.add(2, 3.0);
        double result2 = ops.add(2.0, 3);
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
    }
}
