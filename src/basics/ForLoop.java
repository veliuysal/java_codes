package basics;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int ekranGirdisi=scanner.nextInt();
        int sayac=0;
      /*  for(; ekranGirdisi>1;ekranGirdisi--){
            if(ekranGirdisi % 2 ==0)
                sayac++;
        }*/
        for(int index=ekranGirdisi;index>1;index--){
            if(index % 2 ==0)
                sayac++;
        }
        System.out.println("Verdiğiniz sayı aralığındaki çift sayı adeti: "+sayac);
    }
    // sayı tut oyunu için ekrandan bir sayı istenecektir. Sayı tut oyununda ilk aşamada kullanıcının klavyeden bir sayı girmesi istenir.
    // daha sonra bu girilen sayının başka bir kullanıcı tarafından tahmin edilmesi istenir. tahmin edecek kullanıcının 3 hakkı olacak
    // bu hakları bitince ekrana "Hakkınız bitti" yazdırılacak.
    // Bu hakları içerisinde eğer sayıyı bilirse "Doğru tahmin" yazısı ekrana yazdırılacaktır.
}
