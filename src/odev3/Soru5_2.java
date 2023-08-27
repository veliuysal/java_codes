package odev3;

import java.util.Arrays;

public class Soru5_2 {
    public static void main(String[] args) {
        int[] dizi1 = {1, 2, 3, 4, 5, 6};
        int[] dizi2 = {2, 5, 7, 8, 9, 10};
        boolean var=false;
        int[] farkli=new int[dizi1.length+ dizi2.length];
        int index=0;
        for(int i=0; i< dizi1.length; i++){
            for(int j=0;j< dizi2.length;j++){
                if(dizi1[i] == dizi2[j])
                    var = true;
            }
            if(!var){
                farkli[index++]=dizi1[i];
            }
            var = false;
        }
        System.out.println(Arrays.toString(farkli));
        for(int i=0; i< dizi2.length; i++){
            for(int j=0;j< dizi1.length;j++){
                if(dizi2[i] == dizi1[j])
                    var = true;
            }
            if(!var){
                farkli[index++]=dizi2[i];
            }
            var=false;
        }
        System.out.println(Arrays.toString(farkli));
        int[] sonuc=new int[index];
        for(int i=0;i<index;i++){
            sonuc[i]=farkli[i];
        }
        System.out.println(Arrays.toString(sonuc));

    }
}
