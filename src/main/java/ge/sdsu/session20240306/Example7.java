package ge.sdsu.session20240306;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {

        String path = "file.txt";

        try {
            Scanner scanner = new Scanner(new File(path));
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
