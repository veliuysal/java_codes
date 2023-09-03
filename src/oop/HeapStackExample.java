package oop;

import java.util.Arrays;

public class HeapStackExample {
    public static void main(String[] args) {
        /*int a = 567;
        int b = 10;
        System.out.println("a:"+a+" b:"+ b);
        b = a;
        System.out.println("a:"+a+" b:"+ b);*/

        /*int[] dizi1 = {12, 45, 34, 67, 85};
        int[] dizi2 = {34, 56, 78, 41, 89, 90};
        System.out.println("Dizi1:"+Arrays.toString(dizi1)+ " Dizi2:"+Arrays.toString(dizi2));
        int[] dizi3 = dizi1;
        System.out.println("Dizi1:"+Arrays.toString(dizi1)+ " Dizi2:"+Arrays.toString(dizi2)+" Dizi3:"+Arrays.toString(dizi3));
        dizi1[2] = 32;
        System.out.println("Dizi1:"+Arrays.toString(dizi1)+ " Dizi2:"+Arrays.toString(dizi2)+" Dizi3:"+Arrays.toString(dizi3));
        dizi3 = new int[3];
        dizi3[0]=1;
        dizi3[1]=3;
        dizi3[2]=7;
        System.out.println("Dizi1:"+Arrays.toString(dizi1)+ " Dizi2:"+Arrays.toString(dizi2)+" Dizi3:"+Arrays.toString(dizi3));*/

        String ifade1 = "JAVA";
        String ifade2 = "BilgeAdam";
        System.out.println("İfade1:"+ifade1+" İfade2:"+ifade2);
        String ifade3=ifade2;
        System.out.println("İfade1:"+ifade1+" İfade2:"+ifade2+" İfade3:"+ifade3);
        ifade3=ifade1+" "+ifade2;
        System.out.println("İfade1:"+ifade1+" İfade2:"+ifade2+" İfade3:"+ifade3);
        ifade3=ifade1;
        System.out.println("İfade1:"+ifade1+" İfade2:"+ifade2+" İfade3:"+ifade3);
    }
}
