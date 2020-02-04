
/**
 * Pair
 */
class Pair {
    int x, y;
    Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.println("x " + x);
        System.out.println("y " + y);
    }
}

/**
 * StackRules
 */
abstract class StackRules {
    abstract boolean isEmpty();
    abstract void push(Pair a);
    abstract Pair pop();    
}

/**
 * Stack
 */
class Stack extends StackRules{
    Pair arr[];
    int size ,top;
    Stack() {
        arr = new Pair[100];
        size = 0;
        top = -1;
    }    
    @Override
    boolean isEmpty() {
        // TODO Auto-generated method stub
        return size == 0;
    }
    @Override
    void push(Pair a) {
        // TODO Auto-generated method stub
        arr[size++] = a;
        top++;
        return;
    }
    @Override
    Pair pop() {
        if(isEmpty())
            return null;
        size--;
        return arr[top--];
    }
}

/**
 * CODE4
 */
public class CODE4 {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(new Pair(1,2));
        st.push(new Pair(2,3));
        st.pop().print();
    }
}