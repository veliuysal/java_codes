package generics;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        printArray(1, 2, 3, 4);
        printArray(5, 6);
        printArray(7);
        printArray();
        printArray("Array");
        printArray("Dizi", 3, 4, 5, 6, 5, 65, 5, 6);
    }

    public static void printArray(Integer... array) {
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(String value, Integer... array) {
        System.out.print(value + " : ");
        printArray(array);
    }
    
}
