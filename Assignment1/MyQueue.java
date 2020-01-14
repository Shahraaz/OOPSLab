import java.util.LinkedList;

/**
 * Queue
 */
public class MyQueue {

    LinkedList<Integer> list;

    public MyQueue() {
        list = new LinkedList<Integer>();
    }

    public void push(Integer a) {
        list.add(a);
    }

    public int peek() {
        return list.peekFirst();
    }

    public int pop() {
        return list.poll();
    }
}