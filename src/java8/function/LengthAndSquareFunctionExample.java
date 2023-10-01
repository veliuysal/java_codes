package java8.function;

import java.util.function.Function;

public class LengthAndSquareFunctionExample {
    public static void main(String[] args) {
        // Metin dizgisini alıp uzunluğunu hesaplayan bir Function
        Function<String, Integer> calculateLength = String::length;

        // Uzunluğu alınan metin dizgisini alıp karesini hesaplayan bir Function
        Function<Integer, Integer> square = number -> number * number;

        // İki Function'ı birleştir ve ardışık olarak uygula
        Function<String, Integer> combinedFunction = calculateLength.andThen(square);

        String text = "Java Programming";
        int result = combinedFunction.apply(text);

        System.out.println("Result: " + result);
    }
}
