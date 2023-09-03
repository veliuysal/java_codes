package basics;

public class StringReturnMethod {
    public static void main(String[] args) {
        //bir string dönüş değerine sahip metodumuz(birlestir) var. Bu metoda parametre olarak String username almaktadır.
        // alınan username parametresi "Merhaba "+ username +"! Hoş geldin" şekli,nde birleştirme işlemine tabi tutulur.
        //daha sonra bu birleştirme işlemi return ile döndürülür.
        // Bu birlestir ismindeki metodumuzun dönüş değerini de bir String değişkene atayalım.
        // Alt satırda ise bu değişkeni System.out.println ile ekrana yazdıralım.
        String deger = birlestir("BilgeAdam");
        int toplam = toplama(3,2);
        System.out.println(toplam);
        System.out.println(deger);
        cagir();
    }

    public static int toplama(int sayi1, int sayi2) {
        int topla=sayi1+ sayi2;
        topla +=1;
        cagir();
        return 4;
    }

    public static String birlestir(String username){
        return "Merhaba "+username+"! Hoş geldin.";
    }
    private static void cagir(){

    }
}


