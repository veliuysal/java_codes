package oop.abstracts;

abstract class Language {
    abstract void nativeLanguage();

    // regular method
    void sameMethod() {
        System.out.println("This is regular method");
    }
}

class English extends Language {

    @Override
    void nativeLanguage() {
        System.out.println("My Native Language is English");
    }
}

class German extends Language {

    @Override
    void nativeLanguage() {
        System.out.println("My Native Language is German");
    }

    @Override
    void sameMethod(){
        System.out.println("Regular method in German Class");
    }
}

public class Example1 {

    public static void main(String[] args) {
        Language english = new English();
        Language german = new German();

        english.nativeLanguage();
        german.nativeLanguage();

        english.sameMethod();
        german.sameMethod();
    }
}
