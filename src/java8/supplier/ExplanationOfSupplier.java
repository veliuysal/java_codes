package java8.supplier;

import java.util.function.Supplier;

public class ExplanationOfSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World Supplier!..";
        System.out.println(supplier.get());
    }

}
