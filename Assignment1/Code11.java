import java.util.Arrays;
import java.util.Scanner;

/**
 * Code11
 */
public class Code11 {
    public static String sortString(String input) {
        char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutation(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = sortString(in.next());
        printPermutation(s, "");
        in.close();
    }
}