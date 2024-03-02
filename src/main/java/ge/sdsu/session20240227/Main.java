package ge.sdsu.session20240227;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int length = 5;
        int[] intArray = new int[length]; // will initialize all values to 0 (because of its type)
        int[] intArray1 = new int[]{1, 2, 3, 4};
        int[] intArray2 = {5, 6, 7, 8};


        String s1 = "a" + "b" + "c";
        s1 += "d";
        String s2 = "abc";
        String s3 = "abc";
        System.out.println(s2.intern() == s3);

        String firstName = "George";
        String lastName = "Smith";
        System.out.println("Hello " + "\t"
                + firstName + "\t" + lastName);
        System.out.println("Hello " + "\r"
                + firstName + "\r" + lastName);
        methodA(2, 2);
        double result = methodB(2, 2);
        double result1 = methodB(2.2, 2);
//        int result1 = methodB(2 ,2);
        Integer integer = 10;
        float v = integer.floatValue(); // Wrapper classes come with methods, not available to primitives
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        final int z = 10;
//        z = 11;
//        z += 11;
        int[] x = new int[z];
        int y = 10;
        for (int i = 0; i < z; i++) {
            x[i] = y;
            y += 10;
        }

        for (int num : x) {
            System.out.println(num);
        }

        /*

        int[] x = {1...n}

        for(int i=0; i < x.length - 1; i++){
           if x[i] > x[i+1]
              swap(x[i], x[i+1])
        }

        int temp = x[i];
        x[i] = x[i+1];
        x[i+1] = temp;
         */

//        Character.isDigit();
//        Character.isAlphabetic()
//        Character.isLetter();


        String s = "hello";
//        System.out.println(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))){
                System.out.print(s.charAt(i));
            }
        }

        File file = new File("C:\\Users\\Instructor\\Desktop\\CS160-Lab\\src\\main\\java\\ge\\sdsu\\session20240227\\hello.txt");
//        File file = new File("C:\\Users\\Instructor"); // Access denied
//        File file1 = new File("src/main/java/ge/sdsu/session20240227/hello.txt");

        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public static void methodA(double x, int y) {
        System.out.println("x: " + x + " y: " + y);
    }

    public static double methodB(double x, int y) {
        return x + y;
    }

    public static double methodC(float x, int y) {
        return x + y;
    }
}
