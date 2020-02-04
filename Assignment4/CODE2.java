/**
 * parentClass
 */
class parentClass {
    int i;

    parentClass() {
        i = 0;
    }

    public void printNum() {
        System.out.println("i " + i);
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }
}

/**
 * childClass
 */
class childClass extends parentClass{
    int j;
    childClass() {
        j = 0;
    }

    /**
     * @param j the j to set
     */
    public void setJ(int j) {
        this.j = j;
    }
    
    public void printNum() {
        System.out.println("j " + j);
    }
}

/**
 * CODE2
 */
public class CODE2 {

    public static void main(String[] args) {
        childClass C = new childClass();
        C.setJ(5);
        C.setI(5);
        C.printNum();
    }
}