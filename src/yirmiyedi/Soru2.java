package yirmiyedi;

import javax.sound.midi.Soundbank;

public class Soru2 {
    //Cumleyi tersten yazdırma metodu
    //isPalindrome metoduyla da tersini aldığımız cümlenin karşılaştırılması
    public static void main(String[] args) {
       // String cumle="BilgeAdam Java Dersi";
        String cumle="Ey Nihat Adanada tahin ye";
        System.out.println("Cümle: "+cumle);
        String tersCumle = tersiniGetir(cumle);
        System.out.println("Cümlenin tersi : "+tersCumle);
        if(isPalindrome(cumle,tersCumle))
           System.out.println("Cümle Palindrome");
       else
           System.out.println("Cümle Palindrome değil.");

    }

    private static boolean isPalindrome(String cumle, String tersCumle) {
        return cumle.toLowerCase().equals(tersCumle.toLowerCase());
    }

    public static String tersiniGetir(String cumle){
        String tersCumle="";
        for (int i=cumle.length()-1;i>=0;i--){
            tersCumle += cumle.charAt(i);
        }
        return tersCumle;
    }
}
