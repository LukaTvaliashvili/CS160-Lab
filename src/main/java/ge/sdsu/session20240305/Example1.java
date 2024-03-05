package ge.sdsu.session20240305;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        int result1 = divide(5, 2);
//        int result2 = divide(5, 0);


        String path = "file.txt";
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File file = new File(path);

        try{
            complexFileProcessing1(file);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

//        calcLength(null);

        try{
            complexFileProcessing1(file);
            Thread.sleep(1000);
        }catch (IOException e){
            System.out.println(e.getMessage());
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        try{
            complexFileProcessing1(file);
            Thread.sleep(1000);
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

    public static void complexFileProcessing(File file) {
        try {
            Scanner scanner = new Scanner(file);
            // complex file processing
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void complexFileProcessing1(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        // complex file processing
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int divide1(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int calcLength(String input) {
      return input.length();
    }


    public static void multithreadingOperation() throws InterruptedException {

    }

}
