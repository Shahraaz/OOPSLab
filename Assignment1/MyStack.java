/**
 * MyStack
 */
public class MyStack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    public MyStack() {
        top = -1;
    }

    boolean isEmpty() {
        return top < 0;
    }

    boolean push(int x) {
        if (top >= (MAX - 1))
            return false;
        a[++top] = x;
        return true;
    }

    int pop() {
        if (top < 0)
            return 0;
        return a[top--];
    }

    int peek() {
        if (top < 0)
            return 0;
        return a[top];
    }
}
