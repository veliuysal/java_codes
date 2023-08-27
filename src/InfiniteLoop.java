import paket.Example;

import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args ) {
        Scanner sc=new Scanner(System.in);
        int toplam=0;
        int deger;/*
        do {
            System.out.print("Bir sayı giriniz: ");
            deger = sc.nextInt();
            if(deger == 0 )
                break;
            toplam += deger;
        }while (true);*/
        if(args.length ==0)
        return;
        
        for(;;){
            System.out.print("Bir sayı giriniz: ");
            deger = sc.nextInt();
            if(deger == 0 )
                break;
            toplam += deger;
        }
        System.out.println("Girilen sayıların toplamı: "+ toplam);
    }
    public static void cakmaMain(int[] args){
        Example example=new Example();
    }
}
