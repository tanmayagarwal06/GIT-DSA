package Arrays;
import java.util.*;

public class SpiralMatrix {


    /*
     * Dry Run
    top=0, bottom=2, left=0, right=2
    result = []
    Step 1: left→right
    [1,2,3] → result = [1,2,3], top=1
    Step 2: top→bottom
    [6,9] → result = [1,2,3,6,9], right=1
    Step 3: right→left
    [8,7] → result = [1,2,3,6,9,8,7], bottom=1
    Step 4: bottom→top
    [4] → result = [1,2,3,6,9,8,7,4], left=1
    Next iteration:
    top=1, bottom=1, left=1, right=1
    Step 1: left→right
    [5] → result = [1,2,3,6,9,8,7,4,5], top=2
    Loop ends.
     */

    public static void spiralPrint(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println(); // Empty matrix case
            return;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // rows
            int m = sc.nextInt(); // columns
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            spiralPrint(matrix);
        }

        sc.close();
    }
}
