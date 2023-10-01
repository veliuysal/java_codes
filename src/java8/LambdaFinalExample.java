package java8;

@FunctionalInterface
interface LambdaFinal{
    void printMessage(String message);
}

public class LambdaFinalExample {

    public static void main(String[] args) {
        String value1 = "hello";
        String value2 = "java";
        final String value3 = "world";
        LambdaFinal lambda01 = message -> System.out.println(message + ". " + value1 + " "+ value2 + " " + value3);

        lambda01.printMessage("Bilge Adam");
         //value2 = "java8";
        // burada value2 ' ye tekrar deger set etmek istersek,
        // compile error verir, value2 legal degildir.
        // effectively final degildir.

    }
}
