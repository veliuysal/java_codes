package basics;

public class NarrowingCast {
    public static void main(String[] args) {
        double doubleNumber= 9.78d;
        int intNumber =  (int) doubleNumber;

        System.out.println(doubleNumber);
        System.out.println(intNumber);
    }

    //Bir double değişkenimiz var. Bu değişkenin değeri 178.56 olsun. Bu değişken ile birlikte biz narrowing casting
    // (int veri tipine sahip bir değişkene) işlemi ve int değişkeni 14 ile çarpıp sonucuda bir float tipindeki değişkene atayalım.
    // Daha sonra bu float değişkeni 3.67 ile bölelim ve çıkan sonucu int veri tipine sahip değişkene atayalım.

    //Bu değişkeni 27 ile çarpıp kendisine atayalım, daha sonra aynı değişkene 35 sayısını ekleyip kendisine atayalım.
    // 3'e bölüp tekrar kendisine atayalım ve çıkan sonucu da double bir veri tipine dönüştürelim.


    //gelen sonucu ile bizim daha önceki çıktımız olan (3.67'e bölüp int veritipine atama yaptığımız) değişken ile
    // karşılaştırma işlemi yaplım.
    //çıkan sonuç büyük ise "Sonuç büyüktür" değilse "Sonuç Küçüktür" ve eşitse "Sonuçlar Eşittir" çıktısını yazdıralım.

    //int degisken=36, double değişken 45.7, float değişken 97.42. Bu değişkenlerimizi sırasıyla 10'dan büyük müdür şeklinde
    // karşılaştıralım
    //Bu karşılaştırmaları tek bir kontrol ile yapalım ve hepsi 10'dan büyükse "Bu değişkenler 10'dan büyüktür" yazdıralım.
    //Daha sonra bu değişkenleri 40 ile kıyaslayalım ve bu değişkenlerden en az bir tanesi küçükse "En az bir değişken 40'dan küçüktür"
    // yazdıralım


}
