package basics;

public class HandlingException {
    public static void main(String[] args) {
        int number1=5;
        try{
            System.out.println(number1/0);
            System.out.println("not work");
        }catch (ArithmeticException e){
            System.out.println("catch ArithmeticException");
            System.out.println(number1/0);
        }
       finally {
            int number2 =number1 * 4;
            System.out.println("number1 * 4 = "+number2);
        }

    }
}
