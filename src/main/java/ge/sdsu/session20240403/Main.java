package ge.sdsu.session20240403;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(17);
        stack.push(22);
        stack.push(33);
        System.out.println(stack);
        Integer lastPopped = stack.pop();
        System.out.println(lastPopped); // 33
        System.out.println(stack); //[12, 17, 22]
        System.out.println(stack.peek()); // 22

        System.out.println("======Queue======");

        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(17);
        queue.add(22);
        queue.add(33);
        System.out.println(queue); // [12, 17, 22, 33]
        queue.remove();
        System.out.println(queue); // [17, 22, 33]
        System.out.println(queue.peek()); // 17

        Deque<Integer> deque = new ArrayDeque<>();


    }

}
