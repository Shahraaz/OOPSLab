import java.util.Arrays;
import java.util.Scanner;

/**
 * Code1
 */
public class Code1 {

    static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter element to search ");
        int x = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at " + i + " index.");
                return;
            }
        }
        System.out.println("Element Not Found");
        in.close();
    }
}