package java8.functional;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // MathOperation arayüzünü kullanarak lambda ifadesi oluşturuyoruz
        MathOperation addition = (a, b) -> a + b;

        // MathOperation arayüzünü kullanarak lambda ifadesi oluşturuyoruz
        MathOperation subtraction = (a, b) -> a - b;

        // MathOperation arayüzünü kullanarak lambda ifadesi oluşturuyoruz
        MathOperation multiplication = (a, b) -> a * b;

        // MathOperation arayüzünü kullanarak lambda ifadesi oluşturuyoruz
        MathOperation division = (a, b) -> a / b;

        // Lambda ifadesini kullanarak işlem yapma
        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }
}
