package iki;

public class ArrayIndexOutofBound {
    public static void main(String[] args) {
        int[] arr=new int[5];
        try {
            arr[5] = 10;
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("6. elemana erişimde hata var");
        }
        //System.out.println("6. elemana erişim: "+ arr[5]);

    }
    public void Deneme(){

    }
}

