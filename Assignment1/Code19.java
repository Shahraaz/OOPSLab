import java.util.LinkedList;
import java.util.Scanner;

/**
 * Code19
 */
public class Code19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            list.add(c);
        }
        for (int i = 0; i + 1 < n; i += 2) {
            int a = list.get(i);
            int b = list.get(i + 1);
            System.out.println(list);
            list.remove(i + 1);
            list.remove(i);
            System.out.println(list);
            list.add(i, b);
            list.add(i + 1, a);
            System.out.println(list);
        }
        System.out.println(list);
        in.close();
    }
}