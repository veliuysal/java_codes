package java8;

@FunctionalInterface
interface FuncInterface{
    void eat();
}

class Cat {
}

public class LambdaExpressionClassExample {
    public static void main(String[] args) {
        FuncInterface lambda01 = () -> new Cat();
        lambda01.eat();
    }
}
