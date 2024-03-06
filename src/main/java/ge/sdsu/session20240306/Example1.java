package ge.sdsu.session20240306;

public class Example1 {

    public static void main(String[] args){

        divide(10, 2);

//        divide(10, 0);
    try {
        divide(10, 0);
    }catch (RuntimeException e){
        System.out.println(e.getMessage());
    }
        System.out.println("Execution continues...");

    }

    public static int divide(int a, int b){
        return a / b;
    }
}
