package ge.sdsu.session20240305;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        String path = "file.txt";
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }


        System.out.println("Hello");
        // System.exit() - prevents finally from being executed
    }
}
