package ge.sdsu.session20240305;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String path = "file.txt";
        BufferedReader reader = null;

        try {
            String line;
            reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        // try with resources
        try(BufferedReader reader1 = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader1.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
