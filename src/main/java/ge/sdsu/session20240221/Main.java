package ge.sdsu.session20240221;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    Abstract classes vs Interfaces

    OOP - Abstraction, Encapsulation, Inheritance, Polymorphism
     */

    public static void main(String[] args) {
        Vehicle vehicle = new Sedan();
        vehicle.hello();

        IHello hello = new Hello();
        hello.hello();

        List<Integer> list = new ArrayList<>();
    }
}
