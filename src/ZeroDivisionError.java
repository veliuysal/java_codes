public class ZeroDivisionError {
    public static void main(String[] args) {
        int a=20, b=0;
        try {
            System.out.println("Result: " + a / b);
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}
