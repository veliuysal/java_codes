package oop;

public class Insan {
    //bir insan objesi oluşturalım. Bu obje içerisinde insana ait ad,soyad, boy, kilo özelliklerini barındırsın
    // Daha sonra başka bir class içerisinden bu insan objesini kullanalım ve herkes kendi değerleriyle içerisini doldursun
    // Bu doldurma işleminden sonra yürüme ve konuşma fonksiyonlarını ekleyelim. Bu fonksiyonlar içerisinde
    // sadece ne fonksiyonu olduğunu ekrana yazsın. Bir tane de ismi kendiniTanit olan fonksiyona sahip olsun.
    //Bu fonksiyonu çağırdığımızda ekrana daha önce girmiş olduğumuz verileri yazdırsın.
    String ad, soyad;
    int boy, kilo;

    public void yurume() {
        System.out.println("Yürüme Fonksiyonu");
    }

    public void  konusma() {
        System.out.println("Konuşma Fonksiyonu");
    }

    public void kendiniTanit() {
        System.out.println("Kendini Tanıt. Adım: "+ad+" Soyadım: "+soyad+ " Boyum: "+boy+" Kilom: "+kilo);
    }
}
