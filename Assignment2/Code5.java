import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Node
 */
class Node {

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        next = null;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @param val the val to set
     */
    public void setVal(int val) {
        this.val = val;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @return the val
     */
    public int getVal() {
        return val;
    }
}

/**
 * MyList
 */
class MyList {

    Node Head;

    MyList() {
        // System.out.println("In List Const");
        Head = null;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        Head = head;
    }

    /**
     * @return the head
     */
    public Node getHead() {
        return Head;
    }

    public void insertAtTail(int val) {
        if (Head == null) {
            Head = new Node(val);
        } else {
            Node head = Head;
            while (head.getNext() != null) {
                head = head.getNext();
            }
            head.setNext(new Node(val));
        }
    }

    public int getMiddle() {
        if (Head == null) {
            return -1;
        } else {
            Node rabbit = Head;
            Node tortoise = Head;
            while (rabbit != null) {
                rabbit = rabbit.getNext();
                if (rabbit != null) {
                    rabbit = rabbit.getNext();
                } else
                    break;
                tortoise = tortoise.getNext();
            }
            return tortoise.getVal();
        }
    }

    public String toString() {
        String ret = "";
        Node curr = Head;
        while (curr != null) {
            ret += curr.getVal() + " ";
            curr = curr.getNext();
        }
        return ret;
    }

}

/**
 * MyQueue
 */
class MyQueue extends MyList {

    int Size;

    MyQueue() {
        // System.out.println("In Q Const");
        Size = 0;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return Size;
    }

    public void push(int val) {
        Size++;
        insertAtTail(val);
    }

    public int top() {
        if (Head == null) {
            return 0;
        } else
            return Head.getVal();
    }

    public void pop() {
        if (Head == null) {
            ;
        } else {
            Size--;
            Head = Head.getNext();
        }
    }

}

/**
 * Code4
 */
public class Code5 {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = in.nextInt();
        // int arr[] = new int[n];
        MyQueue inp = new MyQueue();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            inp.push(x);
        }
        System.out.println("Before Reversing" + inp);
        MyQueue res = new MyQueue();
        for (int i = 0; i < n; i++) {
            MyQueue auxilary = new MyQueue();
            while (inp.getSize() > 1) {
                auxilary.push(inp.top());
                inp.pop();
            }
            res.push(inp.top());
            inp.pop();
            while (auxilary.getSize() > 0) {
                inp.push(auxilary.top());
                auxilary.pop();
            }
        }
        System.out.println("After Reversing " + res);
        // System.out.println(L.getMiddle());
        in.close();
    }
}