package ge.sdsu.session20240220;

import java.util.LinkedList;
import java.util.List;

public class Main {



    /*

    Abstraction - achieved through abstract classes and interfaces

    Abstract classes vs Interfaces



     */

    public static void main(String[] args) {
        Test test = new Test();
        ITest test1 = new Test();
        test1.hello(); // hello from Test
        List<Integer> list = new LinkedList<>();
    }
}
