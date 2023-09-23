package generics;

public class GenericsVarArgs {

    public static <T> void printArray(T... items){
        for(T element: items)
            System.out.print(element+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("String Dizisi:");
        printArray("Merhaba", "Dunya", "Java");

        System.out.println("Integer Dizisi:");
        printArray(1, 2, 3, 4, 5);

        System.out.println("Double Dizisi:");
        printArray(3.14, 1.618, 2.718);

    }
}
