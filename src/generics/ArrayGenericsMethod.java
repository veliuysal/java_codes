package generics;

public class ArrayGenericsMethod {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};

        System.out.print("Integer array:");
        print(intArray);

        System.out.print("Double array:");
        print(doubleArray);

        System.out.print("String array:");
        print(stringArray);

    }

    public static <T> void print(T[] array) {
        for (T element : array) {
            System.out.print(" " + element);
        }
        System.out.println();
    }
}
