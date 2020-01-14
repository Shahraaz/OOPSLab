/**
 * Code17
 */
public class Code17 {

    public static void main(String[] args) {
        MyQueue Q = new MyQueue();
        Q.push(1);
        Q.push(2);
        Q.push(3);
        System.out.println(Q.peek());
        System.out.println(Q.pop());
        Q.push(4);
        System.out.println(Q.pop());
        System.out.println(Q.pop());
    }
}