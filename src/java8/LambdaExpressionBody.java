package java8;

@FunctionalInterface
interface ExampleInterface {
    int exampleMethod(int a);
}

@FunctionalInterface
interface ExampleInterface2 {
    int exampleMethod(int a, int b);
}

public class LambdaExpressionBody {
    public static void main(String[] args) {
        ExampleInterface exampleInterface = param1 -> param1 * 2;
        ExampleInterface2 exampleInterface2 = (param1, param2) -> param1+ param2;
        ExampleInterface2 exampleInterface2_1 = (int param1, int param2) -> param1+ param2;
    }
}
