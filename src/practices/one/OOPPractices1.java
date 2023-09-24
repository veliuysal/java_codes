package practices.one;

public class OOPPractices1 {
    //Bizim bir fabrikamız var ve bu fabrikada hem otomobil, hem kamyonet hem de motorsiklet ve bisiklet üretilmektedir.
    //Bu üretim esnasında bizim temel işlevleri yönetebileceğimiz bir yapı kurgulanmak istenmektedir. Bu kurgu için öncelikli olarak
    //çıktı değerleri ve üretim aşamasında bizim ürettiğimiz tipteki taşıtlar için temel fonksiyoneliteler olması gerekmektedir.
    //

    //Enumlar
    //MotorDurumu => Motorlu, Motorsuz
    //LastikSayisi => Tek Teker, İki teker, 3 teker, 4 Teker, 6 Teker, 8 Teker, 10 teker
    //AracBoyutu => Uzun, Kısa
    //Renk => Siyah, Beyaz, Kırmızı, Mavi, Gri, Yeşil
    //YakitTuru => Benzin, Dizel, LPG, NO
    //VitesTuru => Otomatik, Manuel

    //Interfaceler

    //Taşıt Interface'i
    //void motorDurumu(MotorDurumu);
    //void uretimYili(Integer);
    //void lastikSayisi(LastikSayisi);
    //void setModel(String);
    //void setRenk(Renk);
    //void setVitesTuru(VitesTuru);

    //Yakıt Interface'i
    //void setYakitTuru(YakitTuru);
    //void setDepoHacmi(Integer);

    //Abstract Araç Class
    //abstract setBoyut(AracBoyut);
    //void calistir();
    //void durdur();
}
