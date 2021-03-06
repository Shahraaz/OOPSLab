import java.util.Scanner;
import java.util.Stack;

/**
 * Element
 */
class Element {
    public int type, index;

    public Element(int type, int index) {
        this.type = type;
        this.index = index;
    }
}

/**
 * Code18
 */
public class Code18 {

    public static void main(String[] args) {
        Stack<Element> Braces = new Stack<Element>();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (curr == '(') {
                Braces.push(new Element(0, i));
            } else if (curr == '[') {
                Braces.push(new Element(1, i));
            } else if (curr == '{') {
                Braces.push(new Element(2, i));
            } else if (curr == ')') {
                if (Braces.size() > 0) {
                    Element top = Braces.pop();
                    if (top.type == 0) {
                        System.out.println("() found at indexes " + top.index + " " + i);
                    } else {
                        System.out.println("Invalid");
                        break;
                    }
                } else {
                    System.out.println("Invalid");
                    break;
                }
            } else if (curr == ']') {
                if (Braces.size() > 0) {
                    Element top = Braces.pop();
                    if (top.type == 1) {
                        System.out.println("[] found at indexes " + top.index + " " + i);
                    } else {
                        System.out.println("Invalid");
                        break;
                    }
                } else {
                    System.out.println("Invalid");
                    break;
                }
            } else if (curr == '}') {
                if (Braces.size() > 0) {
                    Element top = Braces.pop();
                    if (top.type == 2) {
                        System.out.println("{} found at indexes " + top.index + " " + i);
                    } else {
                        System.out.println("Invalid");
                        break;
                    }
                } else {
                    System.out.println("Invalid");
                    break;
                }
            }
        }
        if (Braces.size() > 0) {
            System.out.println("Invalid");
            in.close();
        }
    }
}