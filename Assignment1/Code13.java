import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Code13
 */
public class Code13 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> Q = new LinkedList<Integer>();
        int n = input.nextInt(), faultCnt = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            System.out.println(x + " " + Q);
            if (Q.contains(x)) {
                Q.remove(x);
                Q.add(x);
                continue;
            }
            faultCnt++;
            if (Q.size() == 3)
                Q.remove();
            Q.add(x);
        }
        System.out.println(faultCnt);
        input.close();
    }
}