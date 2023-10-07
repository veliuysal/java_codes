package java8.parallels;

import java8.supplier.LocalDateTimeStream;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SimpleExample {
    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();

        Stream<Integer> parallelStream = stream.parallel();

        LocalDateTime startingTime= LocalDateTime.now();

        System.out.println(parallelStream.count());

        LocalDateTime finishTime= LocalDateTime.now();

        Stream<Integer> stream2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
        System.out.println(stream2.count());

        LocalDateTime finishTime2= LocalDateTime.now();

        System.out.println("Starting time: "+startingTime+" finish Time: "+finishTime+" finish Time 2 : "+finishTime2);
        //System.out.println("Total Time Difference: "+ (finishTime.getNano() - startingTime.getNano()));

    }
}
