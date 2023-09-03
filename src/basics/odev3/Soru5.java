package basics.odev3;

import java.util.Arrays;

public class Soru5 {
    public static void main(String[] args) {
        int[] dizi1 = {1, 2, 3, 4, 5, 6};
        int[] dizi2 = {2, 5, 7, 8, 9, 10};
        int boyut = dizi1.length + dizi2.length;
        int index = 0;
        int[] tumu = new int[boyut];
        int b= dizi1.length > dizi2.length ? dizi2.length : dizi1.length;
        int[] ayni= new int[b];
       for(int i=0;i<dizi1.length;i++){
           tumu[index++] = dizi1[i];
       }
       for(int i=0; i< dizi2.length; i++){
           tumu[index++] = dizi2[i];
       }
        System.out.println(Arrays.toString(tumu));

       index=0;
       for (int i=0; i< dizi1.length; i++){
           for(int j=0; j< dizi2.length;j++ ){
               if(dizi1[i] == dizi2[j]){
                   ayni[index++]=dizi1[i];
               }
           }
       }
        System.out.println(Arrays.toString(ayni));

       int ayniSayisi=0;
       for(int i=0; i<ayni.length; i++){
           if(ayni[i] !=0){
               ayniSayisi++;
           }
       }
        System.out.println("Aynı olanların sayisi: "+ ayniSayisi);

       int[] ayniDizi=new int[ayniSayisi];
       for(int i=0; i<ayniSayisi; i++){
           ayniDizi[i] = ayni[i];
       }

        System.out.println(Arrays.toString(ayniDizi));
       int sifirSayisi=0;
       for(int i=0; i< tumu.length; i++){
           for(int j=0; j<ayniDizi.length;j++){
               if(tumu[i] == ayniDizi[j]){
                   tumu[i]=0;
                   sifirSayisi++;
               }
           }
       }
       int[] farkli=new int[tumu.length - sifirSayisi];
       index=0;
       for(int i=0; i< tumu.length ; i++){
           if(tumu[i] != 0 ){
               farkli[index++] = tumu[i];
           }
       }

        System.out.println(Arrays.toString(farkli));
    }
}
