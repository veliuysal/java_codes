package java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CurlyBraceConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer kullanarak her bir sayıyı ikiye bölen işlemi uygula
        Consumer<Integer> divideByTwo = number -> {
            System.out.print(number + " divided by 2 is " + (number / 2));
            System.out.println();
        };

        // Her bir sayıyı işle
        numbers.forEach(divideByTwo);
    }
}
