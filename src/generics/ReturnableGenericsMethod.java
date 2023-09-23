package generics;

public class ReturnableGenericsMethod {
    //Gönderdiğimiz verinin başına "Gelen Değer: " ekleyen ve döndüren bir metotu generics method olarak yazalım.
    public static void main(String[] args) {
        String str="Bilge Adam";
        String returnedStr= print(str);
        System.out.println(returnedStr);

        int intValue=5;
        int returnedInt = print(intValue);
        System.out.println(returnedInt);

    }

    public static <T> T print(T data) {
        return   data;
    }
}
