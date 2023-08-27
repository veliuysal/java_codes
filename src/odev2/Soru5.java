package odev2;

import java.util.Arrays;

public class Soru5 {
    public static void main(String[] args) {
        int[] matematik = new int[20];
        int[] fizik = new int[20];
        int[] kimya = new int[20];
        for(int index=0; index < 20; index++){
            //Matematik Dersi
            if(index>=10)
                matematik[index] = index -9;
            else
                matematik[index] = index + 1;
            //Fizik Dersi
            if(index >= 10)
                fizik[index] = 20 - index;
            else
                fizik[index] = 10 - index;
            //Kimya Dersi
            kimya[index] = index % 3;
        }
        System.out.println(Arrays.toString(matematik));
        System.out.println(Arrays.toString(fizik));
        System.out.println(Arrays.toString(kimya));
        int[] ogrenci = new int[20];
        for(int index=0; index<20; index++){
            ogrenci[index] = (matematik[index] + fizik[index] + kimya[index]) / 3;
        }
        System.out.println(Arrays.toString(ogrenci));
        int birinci, ikinci, ucuncu;
        int tutucu=0;
        //Birinci bulma işlemi
        for(int index=1; index < 20; index++ ){
            if(ogrenci[tutucu] < ogrenci[index])
                tutucu = index;
        }
        birinci = tutucu;
        System.out.println("1. index: "+birinci);

        tutucu = 0;
        //2. sayı
        for(int index=1; index < 20; index++ ){
            if(index != birinci && ogrenci[tutucu] < ogrenci[index])
                tutucu = index;
        }
        ikinci = tutucu;
        System.out.println("2. index: "+ ikinci);

        tutucu = 0;
        //3. sayı
        for(int index=1; index < 20; index++ ){
            if(index != birinci && index !=ikinci && ogrenci[tutucu] < ogrenci[index])
                tutucu = index;
        }
        ucuncu = tutucu;
        System.out.println("3. index: "+ ucuncu);
    }
}
