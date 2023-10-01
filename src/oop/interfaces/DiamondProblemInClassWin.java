package oop.interfaces;


interface BaseInterface{
    default public void message(){
        System.out.println("BaseInterface message..");
    }
}

class BaseClass{
    public void message(){
        System.out.println("BaseClass message..");
    }
}


public class DiamondProblemInClassWin extends BaseClass implements BaseInterface{

    public static void main(String[] args) {
        new DiamondProblemInClassWin().message();
        // print BaseClass message..
        // cunku class win kurali vardir.
        // Yani ayni isimde 1'den fazla method varsa class'da bulunan method tercih edilir.
    }
}