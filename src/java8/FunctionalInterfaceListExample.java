package java8;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface NumberListProcessor {
    int process(List<Integer> numbers);
}

public class FunctionalInterfaceListExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        NumberListProcessor sumCalculator = numList -> {
            int sum = 0;
            for (int num : numList) {
                sum += num;
            }
            return sum;
        };

        int totalSum = sumCalculator.process(numbers);
        System.out.println("Total sum: " + totalSum);
    }
}
