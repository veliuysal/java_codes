package basics.iki;

public class AritmetikOperator {
    public static void main(String[] args) {
        int number1=25, number2 = 3, number3=17;
        String websiteName = "Web Sitemiz: ", websiteUri = "www.bilgeadam.com";

        // Stringlerde Ekleme Operatörünü Kullanırsak:
        System.out.println("Merhaba!\n"+(websiteName + websiteUri));


        // Ekleme ve Çıkarma Operatörleri:
        System.out.println("A + B = "+ (number1 + number2));
        System.out.println("A - C = "+(number1 - number3));

        // Çarpma ve Bölme Operatörleri:
        System.out.println("A * B = "+ (number1 * number2));
        System.out.println("A / 4 = "+ (number1 / 4));

        // Mod Alma Operatörü:
        System.out.println("C % B = "+(number3 % number2));

    }
}
