package basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        try{
            FileReader fw=new FileReader("basics.file.txt");
            throwsExample();
        }catch (IOException e){
            e.printStackTrace();

        }

    }
    public static  void throwsExample() throws IOException {
        FileReader fw=new FileReader("basics.file.txt");

    }

}
