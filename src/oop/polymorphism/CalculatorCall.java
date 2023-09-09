package oop.polymorphism;

class Calculator {

    //Toplama İşlemleri
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }

    double sum(double a, double b, double c) {
        return a + b + c;
    }

    //Çıkarma İşlemleri
    int sub(int a, int b) {
        return a - b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    //Çarpma İşlemleri
    int mul(int a, int b) {
        return a * b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    //Bölme İşlemleri
    int div(int a, int b) {
        return a / b;
    }

    double div(double a, double b) {
        return a / b;
    }
}

public class CalculatorCall {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //Toplama İşlemi
        int toplamInt2 = calculator.sum(1, 2);
        int toplamInt3 = calculator.sum(1, 2, 3);
        double toplamDouble2 = calculator.sum(1.3, 2.7);
        double toplamDouble3 = calculator.sum(1.3, 2.7, 5.0);
        System.out.println("Int Toplam 2 parametre:" + toplamInt2);
        System.out.println("Int Toplam 3 parametre:" + toplamInt3);
        System.out.println("Double Toplam 2 parametre: " + toplamDouble2);
        System.out.println("Double Toplam 3 parametre: " + toplamDouble3);

        //Çıkarma İşlemi
        int cikarmaInt = calculator.sub(7, 3);
        double cikarmaDouble = calculator.sub(5.6, 3.4);
        System.out.println("Int Çıkarma: " + cikarmaInt);
        System.out.println("Double Çıkarma: " + cikarmaDouble);

        //Çarpma İşlemi
        int carpmaInt = calculator.mul(2, 3);
        double carpmaDouble = calculator.mul(3.2, 5.1);
        System.out.println("Int Çarpma: " + carpmaInt);
        System.out.println("Double Çarpma: " + carpmaDouble);

        //Bölme İşlemi
        int bolmeInt = calculator.div(5, 2);
        double bolmeDouble = calculator.div(5.4, 2.1);
        System.out.println("Int Bölme: " + bolmeInt);
        System.out.println("Double Bölme: " + bolmeDouble);

    }
}
