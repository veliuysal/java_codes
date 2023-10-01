package java8;

@FunctionalInterface
interface LambdaEvenOdd {
    String intKind(int number);
}

public class LambdaExpressionOddEvenExample {
    public static void main(String[] args) {
        LambdaEvenOdd lambda1 =
                (int number) -> {
                    if (number % 2 == 0) return "even";
                    else return "odd";

                };
        // iki islemde ayni isi yapmaktadir.
        LambdaEvenOdd lambda2 =
                (int number) -> {
                    if (number % 2 == 0) {
                        return "even";
                    } else {
                        return "odd";
                    }
                };

        System.out.println(lambda1.intKind(20));
        System.out.println(lambda1.intKind(21));

    }
}
