package basics;

import java.io.File;
import java.io.IOException;

public class FileDirectoryExample {
    public static void main(String[] args) throws IOException {
        File directory = new File("myDir");
        boolean bool = directory.mkdir();
        System.out.println(bool); // is create?

        File file = new File(directory,"file");
        bool = file.createNewFile();
        System.out.println(bool); // is basics.file  create?

        System.out.println("directory.delete(): "+directory.delete());  // not delete because folder is not empty
        System.out.println("basics.file.delete(): "+file.delete());
        System.out.println("directory.delete(): "+ directory.delete());
    }
}
