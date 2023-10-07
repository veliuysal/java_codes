package java8.parallels;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelCountExample {
    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();

        Stream<Integer> parallelStream = stream.parallel();

        LocalDateTime startingTime= LocalDateTime.now();

        System.out.println(parallelStream.count());

        LocalDateTime finishTime= LocalDateTime.now();

        Stream<Integer> stream2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();

        LocalDateTime startingTime2= LocalDateTime.now();
        System.out.println(stream2.count());

        LocalDateTime finishTime2= LocalDateTime.now();

        System.out.println("Starting time: "+startingTime+" finish Time: "+finishTime+" Starting Time 2: "+startingTime2+" finish Time 2 : "+finishTime2);
    }
}
