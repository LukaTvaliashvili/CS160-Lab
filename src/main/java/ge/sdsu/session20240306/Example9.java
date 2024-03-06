package ge.sdsu.session20240306;

import ge.sdsu.session20240124.B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example9 {

    public static void main(String[] args) {
        String path = "file.txt";
        String line;

        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
