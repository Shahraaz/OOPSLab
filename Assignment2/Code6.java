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
 * MyStack
 */
class MyStack extends MyList {
    int Size;

    MyStack() {
        Size = 0;
    }

    public void push(int val) {
        if (Head == null) {
            Head = new Node(val);
        } else {
            Node temp = new Node(val);
            temp.setNext(Head);
            Head = temp;
        }
        Size++;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return Size;
    }

    public int top() {
        if (Head == null) {
            System.out.println("Empty");
            return -1;
        } else {
            // System.out.println(toString(Head.getVal()));
        }
        return Head.getVal();
    }

    public void pop() {
        if (Head == null) {
            ;
        } else {
            Head = Head.getNext();
            Size--;
        }
    }

}

/**
 * Code6
 */
public class Code6 {

    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.next();
        MyStack st = new MyStack();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                st.push((int) str.charAt(i));
            } else {
                char a = '$';
                if (str.charAt(i) == '}') {
                    a = '{';
                } else if (str.charAt(i) == ']') {
                    a = '[';
                } else if (str.charAt(i) == ')') {
                    a = '(';
                }
                if (st.getSize() == 0) {
                    System.out.println("not balanced a\n");
                    return;
                }
                if (st.top() == (int) a) {
                    st.pop();
                } else {
                    System.out.println("not balanced b\n");
                    return;
                }
            }
        }

        if (st.getSize() > 0) {
            System.out.println("not balanced ab\n" + st);
        } else
            System.out.println("Balanced");
    }
}