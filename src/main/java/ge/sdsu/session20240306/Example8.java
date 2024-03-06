package ge.sdsu.session20240306;

import java.io.*;

public class Example8 {

    public static void main(String[] args) {
        String path = "file.txt";
        BufferedReader reader = null;
        String line;

        try {
            reader = new BufferedReader(new FileReader(path));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }  finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
