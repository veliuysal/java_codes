import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("text.txt");

        System.out.println(file.exists());//has a file ? true or false

        try {
            if(!file.exists()) {
                file.createNewFile();
            }
           /* System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
            System.out.println(file.getName());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.delete());
            System.out.println(file.length());*/
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
            file.mkdir();

        } catch (IOException e) {
            e.printStackTrace();
        }
       // System.out.println(file.exists());
    }

}

