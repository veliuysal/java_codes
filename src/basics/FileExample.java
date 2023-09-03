package basics;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("text.txt");

        System.out.println(file.exists());//has a basics.file ? true or false

        try {
            if(!file.exists()) {
                file.createNewFile();
            }
           /* System.out.println(basics.file.getAbsolutePath());
            System.out.println(basics.file.isFile());
            System.out.println(basics.file.canRead());
            System.out.println(basics.file.canWrite());
            System.out.println(basics.file.canExecute());
            System.out.println(basics.file.getName());
            System.out.println(basics.file.getCanonicalPath());
            System.out.println(basics.file.delete());
            System.out.println(basics.file.length());*/
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
            file.mkdir();

        } catch (IOException e) {
            e.printStackTrace();
        }
       // System.out.println(basics.file.exists());
    }

}

