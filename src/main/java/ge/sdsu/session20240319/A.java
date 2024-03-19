package ge.sdsu.session20240319;

//public class A <M, N>{

public class A<T> {

    public <T> T m1(T a){
        return null;
    }

    public T m2(T a){
        return null;
    }

    public static <T> void smth(T a){
        System.out.println("Hello");
    }
}
