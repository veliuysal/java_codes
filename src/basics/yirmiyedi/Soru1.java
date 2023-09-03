package basics.yirmiyedi;

import java.util.Locale;

public class Soru1 {
    //Girilen bir cümlede yine girilen bir harften kaç adet olduğunu bulan program.
    public static void main(String[] args) {
        String cumle="BilgeAdam Java Dersine Hoşgeldiniz";
        char harf=' ';
        int harfSayisi=0;
        String newCumle=cumle.toLowerCase(Locale.ROOT);
        for(int i=0; i<newCumle.length(); i++){
            if(newCumle.charAt(i) == harf)
                harfSayisi++;
        }
        System.out.println("'" + cumle + "' Cümlesinde "+harfSayisi+" adet '"+harf+"' harfi bulunmaktadır.");
    }
}
