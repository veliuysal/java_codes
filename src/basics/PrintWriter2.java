package basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter2 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("dosya.txt")) {
            writer.println("Merhaba, Dünya!");
            writer.printf("Sayı: %.2f,%n Metin: %.3s, Boolean: %b  ", 42.0, "OpenAI", true);
            System.out.printf("Sayı: %.2f, Metin: %.3s    %n", 42.0, "OpenAI");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
