import java.util.Arrays;

public class ForeachExample {
    public static void main(String[] args) {
        int[] arr= {12,23,44,56,78};
        for(int i :arr)
            System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }
}
