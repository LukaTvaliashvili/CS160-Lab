package ge.sdsu.session20240306;

public class Example4 {

    public static void main(String[] args) {
//        System.out.println(calculateLength(null)); //NullPointerException
        System.out.println(calculateLength1(null));
    }

    public static int calculateLength(String input){
        return input.length();
    }

    public static int calculateLength1(String input){
        if (input == null){
            throw new RuntimeException("input has value of null"); // just for the sake of example
        }
        return input.length();
    }
}
