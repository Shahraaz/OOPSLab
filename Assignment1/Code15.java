import java.util.LinkedList;
import java.util.Scanner;

/**
 * Code15
 */
public class Code15 {

    static boolean isVovel(char c) {
        if (c >= 'a')
            c -= 32;
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        LinkedList<Character> vovels = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (isVovel(curr))
                vovels.add(curr);
        }
        System.out.println(vovels);
        input.close();
    }
}