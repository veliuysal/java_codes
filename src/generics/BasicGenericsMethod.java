package generics;

public class BasicGenericsMethod {

    public static void main(String[] args) {
        Integer number = 42;
        String lesson = "Java";

        print(number);
        print(lesson);
    }

    public static <T> void print(T data) {
        System.out.println("Printable Data: " + data);
    }
}
