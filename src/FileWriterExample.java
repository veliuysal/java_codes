import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
       /* FileWriter fileWriter=null;
        try{
           fileWriter =new FileWriter("Deneme.txt");
            fileWriter.write("Veli UYSAL");
            fileWriter.flush();
        }catch (IOException e){
            System.out.println("Hata");
        }finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            }catch (IOException e){
                System.out.println("Finally Hata");
            }
        }*/
        String name="Veli";
        try(FileWriter fileWriter=new FileWriter("Deneme2.txt", "UYSAL".equals(name))){
            fileWriter.write(name);
            fileWriter.flush();
        }catch (IOException e){
            System.out.println("Hata");
        }
    }
}
