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

    public int getThirdFromLast(){
        try {
            // System.out.println("Start");
            if (Head == null) {
                return -1;
            } else {
                Node firstPtr = Head;
                Node secondPtr = Head;
                if (secondPtr == null)
                    return -1;
                // System.out.println(secondPtr.getVal());
                secondPtr = secondPtr.getNext();
                if (secondPtr == null)
                    return -1;
                // System.out.println(secondPtr.getVal());
                secondPtr = secondPtr.getNext();
                if (secondPtr == null)
                    return -1;
                // System.out.println(secondPtr.getVal());
                secondPtr = secondPtr.getNext();
                while (secondPtr != null) {
                    // System.out.println(secondPtr.getVal());
                    secondPtr = secondPtr.getNext();
                    firstPtr = firstPtr.getNext();
                }
                return firstPtr.getVal();
            }
        } catch (NoSuchMethodError e) {
            // TODO: handle exception
            System.out.println("From Point abb");
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("From Point a");
            System.out.println("Excetion " + e.getMessage());
            e.printStackTrace();
        }
        return -1;
    }
}

/**
 * Code1
 */
public class Code3 {

    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = in.nextInt();
        int arr[] = new int[n];
        MyList L = new MyList();
        for (int i = 0; i < arr.length; i++) {
            int val;
            val = in.nextInt();
            L.insertAtTail(val);
        }
        // System.out.println("InpEnd");
        try {
            // System.out.println("InpEnd");
            System.out.println(L.getThirdFromLast());

        } catch (NoSuchMethodError e) {
            // TODO: handle exception
            System.out.println("From Point bb" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("From Point b");
            e.printStackTrace();
        }
        in.close();
    }
}