package java8;


@FunctionalInterface
interface LambdaExpressionMultipleParameters {
    void plus(int number1, int number2);
}

public class LambdaExpressionMoreParameters {
    public static void main(String[] args) {
        LambdaExpressionMultipleParameters lambda1 = (number1, number2) -> System.out.println("Plus is: " + number1 + number2);
        LambdaExpressionMultipleParameters lambda2 = (int number1, int number2) -> System.out.println("Plus is: " + number1 + number2);
        LambdaExpressionMultipleParameters lambda3 = (int number1, int number2) ->{
            System.out.println("Plus is : " + number1 + number2);
        };
        lambda2.plus(3, 5);

    }
}
