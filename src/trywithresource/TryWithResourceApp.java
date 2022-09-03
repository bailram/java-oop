package trywithresource;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceApp {
    public static void main(String[] args) {
        // tanpa try with resource
        System.out.println("tanpa try with resource");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("README.md"));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error saat membaca data : " + throwable.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error saat menutup file : " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }

        System.out.println();
        System.out.println("menggunakan try with resource");
        // menggunakan try with resource
        try (BufferedReader reader1 = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader1.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error saat membaca data : " + throwable.getMessage());
        }
    }
}
