import java.util.Scanner;
import java.util.Stack;

/**
 * Code12
 */
public class Code12 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> SortedInput = new Stack<Integer>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            final int x = input.nextInt();
            Stack<Integer> buffer = new Stack<Integer>();
            while (SortedInput.size() > 0 && SortedInput.peek() > x)
                buffer.push(SortedInput.pop());
            SortedInput.push(x);
            while (!buffer.empty())
                SortedInput.push(buffer.pop());
        }
        while (!SortedInput.empty()) 
            System.out.println(SortedInput.pop());
        input.close();
    }
}