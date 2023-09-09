package oop.polymorphism;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTime {

    public static void main(String[] args) {
        MathOperations ops = new MathOperations();
        int result1 = ops.add(2, 3);
        double result2 = ops.add(2.5, 3.7);
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
    }
}
