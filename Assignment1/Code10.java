import java.util.Scanner;

/**
 * Code10
 */
public class Code10 {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int mat1[][] = new int[n][];
        for (int i = 0; i < mat1.length; i++) {
            mat1[i] = new int[n];
            for (int j = 0; j < mat1.length; j++)
                mat1[i][j] = in.nextInt();
        }
        int mat2[][] = new int[n][];
        for (int i = 0; i < mat1.length; i++) {
            mat2[i] = new int[n];
            for (int j = 0; j < mat1.length; j++)
                mat2[i][j] = in.nextInt();
        }
        int res[][] = new int[n][];
        for (int i = 0; i < mat1.length; i++) {
            res[i] = new int[n];
            for (int j = 0; j < mat1.length; j++) {
                res[i][j] = 0;
                for (int k = 0; k < n; k++) 
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
        System.out.println("Result");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println("");
        }
        in.close();
    }
}
