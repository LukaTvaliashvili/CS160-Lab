package ge.sdsu.session20240403;

public class CustomStack {

    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;
    private int pointer = -1;

    public CustomStack(){
//        this.data = new int[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY);
    }

    public CustomStack(int capacity){
        this.data = new int[capacity];
    }

    public int push(int value) throws Exception{
        if (isFull()){
            throw new Exception("Stack is already full");
        }
        pointer++;
        data[pointer] = value;
        // data[++pointer] = value;
        return value;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        int value = data[pointer];
        pointer--;
        return value;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty, cannot peek");
        }
        return data[pointer];
    }

    public boolean isFull(){
        return pointer == data.length - 1;
    }

    public boolean isEmpty(){
        return pointer == -1;
    }

    public void display(){
        for (int i = 0; i <= pointer; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println("END");
    }
}
