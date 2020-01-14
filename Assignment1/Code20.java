import java.util.LinkedList;
import java.util.Scanner;

/**
 * Code20
 */
public class Code20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int c = in.nextInt();
            list.add(c);
        }
        int x = in.nextInt();
        int left = 0, right = n - 1, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int curr = list.get(mid);
            if (curr < x) {
                right = mid - 1;
            } else if (curr == x) {
                ans = mid;
                break;
            } else
                left = mid + 1;
        }
        System.out.println(ans);
        in.close();
    }
}