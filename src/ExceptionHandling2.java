import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int number = 5;
      /*  try{
            System.out.println(number/0);
        }catch (Exception e){
            System.out.println("Catch Exception");
        } finally {
            System.out.println("finally block");
        }*/

        try {
            System.out.println(number/0);
            FileReader fileWriter=new FileReader("file.txt");
        }
        catch (ArithmeticException | IOException exception){
            System.out.println("catched ArithmeticException | IOException");
        }
        catch (OutOfMemoryError e){
            System.out.println("catched OutOfMemoryError");
        }
        catch (Exception e){
            System.out.println("catched Exception");
        }

    }
}
