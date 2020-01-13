import java.util.Scanner;

/**
 * Code16
 */
public class Code16 {
    public static String reverse(String str) {
        StringBuilder temp = new StringBuilder(str);
        // System.out.println(temp);
        temp = temp.reverse();
        // System.out.println(temp);
        return new String(temp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String revStr = reverse(str);
        // System.out.println(str + " " + revStr);
        if (str.equals(revStr))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        input.close();
    }
}