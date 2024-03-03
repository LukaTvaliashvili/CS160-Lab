package ge.sdsu.session20240302;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Methods
        Array
        OOP briefly

         */

        int x = 5;
        int y = 3;

        for (int i = 0; i < 3; i++) {
            x = x++ + ++y;
        }

        // i = 0  x = 5, (incremented to 6) y = 4, final value of x = 9
        // i = 1 x = 9   (due to post-increment x = 10), y = 5. final value of x = 14
        // i = 2 x = 14 (due to post-increment x = 15), y = 6 final value of x = 20
//        System.out.println("Final value of x: " + x);

        int a = 2;
        int b = 3;
        int c = 4;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a = ++b + c++;
            }
            a = a + b--;
        }

//        System.out.println("Final value of a: " + a);
//        System.out.println("Final value of b: " + b);
//        System.out.println("Final value of c: " + c);


        int length = 3;
        int[] array = new int[length]; // [0, 0, 0]
        Object[] arr = new Object[length]; // [null, null, null]

        int[] array1 = new int[]{1, 3, 6}; // size = 3
        int[] array2 = {2, 5, 6, 7};

        System.out.println(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int num : array1) {
            System.out.print(num + " ");
        }

        System.out.println();
        int index = 0;
        while (index < array1.length) {
            System.out.print(array1[index] + " ");
            index++;
        }

        System.out.println();

        int z = 10;
        do {
            System.out.println(z);
        } while (z < 10);

        System.out.println("Hello " + "\n" + "Online " + "\t" + "Class");

        Scanner scanner = new Scanner(System.in);

        /*
         int -> Integer
         double -> Double

         Wrapper types come with built-in methods, that are not available to primitives
        */

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        printElements(2, 3.2);
        printElements(2, 3);
        printElements((int) 2.2, 3);

        int m = 5;
        int n = 0;
        try {
//            int result = division(m, n);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("David");
        }

        String hello = "hello";
        System.out.println(hello.replace("l", "s"));
//        hello.replaceAll()


    }

    public static void printElements(int num1, double num2) {
        System.out.println(num1 + " " + num2);
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

}
