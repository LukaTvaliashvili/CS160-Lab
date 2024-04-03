package ge.sdsu.session20240403;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
            tail = node;
            size++;
            return;
        }

        Node temp = head;
        head = node;
        head.next = temp;
        size++;
    }

    public void addLast(int value) {

    }

    public boolean addElementAt(int index, int value) {

        return true;
    }

    public int removeFirst() {
        int value = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int removeLast() {
        return 1;
    }

    public int remove(int index) {
        return 1;
    }

    public Node get(int index) {
        Node node = head;
        if (index == 0) {
            return node;
        }

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
