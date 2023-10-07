package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethod {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        System.out.println(nestedList);

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream) // Her iç liste için Stream oluşturup birleştirme
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Çıktı: [1, 2, 3, 4, 5, 6, 7, 8]

    }
}
