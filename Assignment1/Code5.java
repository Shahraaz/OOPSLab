import java.util.*;

public class Code5 {
    public static void main(String[] args) {
        Integer n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            arr[i] = x;
        }
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        input.close();
    }
}
