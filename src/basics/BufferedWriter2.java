package basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter2 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dosya2.txt"))) {
            writer.write("Merhaba, Dünya!");
            writer.newLine();
            writer.write("Bu bir örnek dosya.");
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
