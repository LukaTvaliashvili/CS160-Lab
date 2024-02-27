package ge.sdsu.session20240213;

public class Prompt {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        rearrange1(arr);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    public static void rearrange1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void rearrange(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = 0;
                arr[num] = temp;
                num++;
            }
        }
    }

    /*

    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.


    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]

    Example 2:

    Input: nums = [0]
    Output: [0]


   Your task is to design and implement a set of Java classes to represent these different types of shapes using
   Object-Oriented Programming principles. Utilize polymorphism to manage interactions and calculations that are common
   among different types of shapes.

   Consider the following requirements:

   Each shape should have a unique identifier and appropriate properties to represent its dimensions and characteristics.
   Different types of shapes have specific attributes and calculations:
       Circles: Have a radius and can calculate area and circumference.
       Rectangles: Have a length, width, and can calculate area and perimeter.
       Triangles: Have three side lengths and can calculate area and perimeter.
   All shapes should be capable of displaying their properties and performing calculations.
   Implement appropriate methods for each type of shape to calculate its specific properties.
   Create a ShapeManager class to manage a collection of shapes. The ShapeManager class should have methods to add shapes,
   remove shapes, and display information about all the shapes in the collection.

     */
}
