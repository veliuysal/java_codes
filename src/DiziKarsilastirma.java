import java.util.Arrays;

public class DiziKarsilastirma {
    public static void main(String[] args) {
        int[] dizi1 = {2, 3, 4, 5, 6, 7, 8};
        int[] dizi2 = {4, 6, 7, 8, 0, 12, 34, 45, 67, 42};
        int[] ortakOlanlar = ortaklariBul(dizi1, dizi2);
        System.out.println(Arrays.toString(ortakOlanlar));
    }

    public static int[] ortaklariBul(int[] dizi1, int[] dizi2) {
        int maxLength = 0;
        if (dizi1.length > dizi2.length)
            maxLength = dizi2.length;
        else maxLength = dizi1.length;

        int[] ortakElemanlar = new int[maxLength];
        int index=0;
        //
        //Burası...
        //
        return ortakElemanlar;
    }
}
