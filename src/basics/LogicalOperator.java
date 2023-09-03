package basics;

public class LogicalOperator {
    public static void main(String[] args) {
        String username="veliuysal";
        int password=123456;

        System.out.println(username.equals("veliuysal"));
        System.out.println(username.equals("veli"));
        System.out.println(password == 123456);
        System.out.println(password == 0123456);

        // Koşullar yapısını anlatırken if-else kavramına daha detaylı değineceğiz.
        if(username.equals("veliuysal") && password==123456) {
            System.out.println("Giriş Başarılı");
        }

    }
}
