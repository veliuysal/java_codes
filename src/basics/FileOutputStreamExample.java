package basics;

import java.io.*;
import java.util.Arrays;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {

        byte[] data = {0x0A, 0x0B};

        File binaryFile = new File("binary.vuf");
        FileOutputStream fos = new FileOutputStream(binaryFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(data);
        bos.close();

        data = new byte[(int) binaryFile.length()];
        FileInputStream fis = new FileInputStream(binaryFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bis.read(data, 0, data.length);
        bis.close();
        System.out.println(Arrays.toString(data));

    }
}
