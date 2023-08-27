public class SwitchCase {
    public static void main(String[] args) {
        //80 alan öğrenci "Pekiyi", 70 alan öğrenci "İyi", 60 alan öğrenci "Fena Değil" , 50 alan öğrenci "geçer not"
        // ve aşağısındaki bir not ise "Kaldı" olarak ekran açıktı verecektir.
        int not=70;
        switch (not){
            case 80:
                System.out.println("Pekiyi");
                break;
            case 70:
                System.out.println("iyi");
                break;
            case 60:
                System.out.println("Fena Değil");
                break;
            case 50:
                System.out.println("Geçer Not");
                break;
            default:
                System.out.println("Kaldı");
        }

        //if-else if- else

        // elimizde 1den 100 e kadar sayılar vardır. ilk önce Bu sayıların kaç olduklarını ekrana yazdırılır.
        //Daha sonra bu sayılardan 7'e bölünenler sayılar için ise ekrana "7'e tam bölünür" ifadesi yazdırılır ve diğer.
        //sayılarla ilgili yapacağımız 2 ile çarpma işlemine tabi tutulmazlar. 2 ile çarpma işlemi yapılan sayılar içinse ekrana
        // çarpma sonuçları yazdırılır.
    }
}
