package ge.sdsu.session20240227.classes;

public class A {

    /*
    Access Modifier  Class  Package  Subclass  Global
    public           yes      yes      yes       yes
    protected        yes      yes      yes        X
    default          yes      yes       X         X
    private          yes       X        X         X

     */

    private int x;
    private int y;

    public static String color;

    static {
        color = "Yellow";
        System.out.println("static initializer block");
    }

    {
        x = 10;
        y = 11;
        System.out.println("Initializer block");
    }

    public A(){
        System.out.println("Constructor");
    }

    public A(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Constructor");
    }

    public A(int x){
        this(x, 0);
    }

    // this vs this()
}
