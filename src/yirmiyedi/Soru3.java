package yirmiyedi;

public class Soru3 {
    public static void main(String[] args) {
        //5 elemanlı bir dizimiz var. Bu dizinin elemanlarının karesini alarak yeni bir dizi oluşturalım.
        // İlk dizinin elemanlarının 3'e bölünmesiyle de yeni bir dizi elde edelim.
        //Daha sonra ise bu 3 dizinin elemanlarını aşağıdaki formüle göre işleme tabi tutalım(Aynı indexler üzerinde)
        //x= ilk dizi, y=ikinci dizi, z=üçüncü dizi
        //2x+3y-9z işleminin sonucunu ekrana yazdıran bir program.
        int[] dizi1 = {2, 56, 65, 3, 7};
        int[] dizi2 = new int[5];
        int[] dizi3 = new int[5];
        for(int i=0; i<5;i++){
            dizi2[i] = dizi1[i] * dizi1[i];
            dizi3[i] = dizi1[i] / 3;
        }
        int[] sonuclar = new int[5];
        for(int i=0; i<5;i++){
            System.out.println(i + "index değerleri: "+dizi1[i] +","+dizi2[i]+","+dizi3[i]);
            int sonuc = (2 * dizi1[i]) + (3 * dizi2[i]) - (9 * dizi3[i]);
            sonuclar[i]=sonuc;
            System.out.println(i+" index değeri: "+ sonuc);
        }
        enBuyuk(sonuclar);
        enKucuk(sonuclar);
    }

    public static void enBuyuk(int[] sonuclar){
        int buyuk=sonuclar[0];
        for(int i =1 ;i<sonuclar.length; i++){
            if(buyuk<sonuclar[i])
                buyuk=sonuclar[i];
        }
        System.out.println("En büyük Değer: "+buyuk);
    }

    public static void enKucuk(int[] sonuclar){
        int kucuk=sonuclar[0];
        for(int i=1; i<sonuclar.length;i++){
            if(kucuk>sonuclar[i])
                kucuk=sonuclar[i];
        }
        System.out.println("En Küçük Değer: "+kucuk);
    }
}
