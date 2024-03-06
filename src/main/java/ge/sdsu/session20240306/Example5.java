package ge.sdsu.session20240306;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        String path = "text.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            Thread.sleep(3000);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        try {
            Scanner scanner = new Scanner(file);
            Thread.sleep(3000);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException | InterruptedException  e) {
            System.out.println(e.getMessage());
        }


        try {
            Scanner scanner = new Scanner(file);
            Thread.sleep(3000);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // the code below is unreachable, because we handle "broader" exception
//        catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
