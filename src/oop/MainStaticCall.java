package oop;

public class MainStaticCall {

    static void myStaticMethod() {
        System.out.println("Statik metot çağrıldı. Obje Oluşturulmadı.");
    }

    public void myPublicMethod() {
        System.out.println("Sadece Obje içerisinden çağrılabilir.");
    }

    public static void main(String[] args) {
        myStaticMethod();

        MainStaticCall myObj= new MainStaticCall();
        myObj.myPublicMethod();
    }
}
