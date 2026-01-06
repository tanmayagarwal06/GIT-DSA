 package Arrays.BinarySearch.Binarysearchonmatrix;

import java.util.Scanner;

public class SearchinMatrix {

    public boolean searchMatrix(int matrix[][],int target){
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = n * m - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            int row = mid/m;
            int coloum = mid%m;

            int midvalue = matrix[row][coloum];

            if (midvalue == target) {
                return true;
            }
            else if (midvalue < target) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int matrix[][] = new int[n][m];

        
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        SearchinMatrix obj = new SearchinMatrix();
        int target = s.nextInt();
        System.out.println(obj.searchMatrix(matrix, target));


    }
    
}