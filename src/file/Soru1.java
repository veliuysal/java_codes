package file;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1 {
    //Telefon rehberi uyglaması: Kişiler isminde bir dizimiz olsun bunun  içerisinde sadece sayı girilebilecek ve o sayının
    //5 ile başlayabilmesi gerekmektedir. 10 hane olacak şekilde girilmiş olması gerekmektedir. Bir de girilen telefon numarası
    // mükerrrer kayıt olmayacaktır. Bu dizimiz en fazla 10 telefon numarası tutabilecektir. Bu dizideki eleman sayısı 10'a ulaştıktan sonra
    //kullanıcıdan veri girişi olmayacak ve bu telefon numaraları indekslerine karşılk gelecek şekilde ekrana yazdırılacaktır.


    public static void main(String[] args) {
        int[] kisiler=new int[10];
        Scanner scanner=new Scanner(System.in);
        int index=0;
        while (index<10){
            System.out.println("Telefon Numarasını Giriniz:");
            String telefonNumarasi=scanner.next();
            if(telefonNumarasiCorrectFormat(telefonNumarasi, kisiler, index)){
                kisiler[index++]= Integer.parseInt(telefonNumarasi);
            }else
                System.out.println("Yanlış Formatta Telefon Numarası girdiniz.");
        }
        System.out.println(Arrays.toString(kisiler));
    }

    public static boolean telefonNumarasiCorrectFormat(String telefonNumarasi, int[] kisiler, int index){
        if(telefonNumarasi.startsWith("5") && checkExpLengthCorrect(telefonNumarasi,10)
                && isDigit(telefonNumarasi) && isNotRepeat(kisiler, telefonNumarasi, index))
            return true;
        return false;
    }

    private static boolean isNotRepeat(int[] kisiler, String telefonNumarasi, int index) {
      if(index>0){
          for(int i=0; i< index; i++){
              if (String.valueOf(kisiler[i]).equals(telefonNumarasi)) {
                  return false;
              }
          }
      }
      return true;
    }

    public static boolean isDigit(String exp){
        for(int i=0;i<exp.length();i++){
         if(!Character.isDigit(exp.charAt(i)))
             return false;
        }
        return true;
    }

    public static boolean checkExpLengthCorrect(String exp, int length){
        if(exp.length()==length)
            return  true;
        return false;
    }

}
