package ge.sdsu.session20240312;

public class Example2 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(2, 0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Apple 2");
    }

    public static int divide(int a, int b){
        return a / b;
    }
}
