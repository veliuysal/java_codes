import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("dosya.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
