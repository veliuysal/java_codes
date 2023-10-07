package java8.streams;

import java.util.regex.Pattern;

public class PatternCompileExample {
    public static void main(String[] args) {
        //public static Pattern compile(String regex)
// public Stream<String> splitAsStream(final CharSequence input)
        Pattern.compile(" ")
                .splitAsStream("java 8 streams")
                .forEach(System.out::println);
    }
}
