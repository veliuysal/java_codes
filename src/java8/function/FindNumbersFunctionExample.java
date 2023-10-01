package java8.function;

import java.util.function.Function;

public class FindNumbersFunctionExample {
    public static void main(String[] args) {
        // Metin dizgisini alıp sayıları çıkaran bir Function tanımla
        Function<String, String> extractNumbers = text -> {
            StringBuilder numbers = new StringBuilder();
            for (char c : text.toCharArray()) {
                if (Character.isDigit(c)) {
                    numbers.append(c +"-");
                }
            }
            return numbers.toString();
        };

        String sentence = "I have 3 apples and 5 oranges.";
        String extractedNumbers = extractNumbers.apply(sentence);

        System.out.println("Extracted numbers: " + extractedNumbers);
    }
}
