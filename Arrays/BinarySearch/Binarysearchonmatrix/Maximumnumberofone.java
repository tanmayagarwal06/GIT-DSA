package Arrays.BinarySearch.Binarysearchonmatrix;

import java.util.Scanner;

public class Maximumnumberofone {
    public int  Bruterowwithmax1s(int matrix[][], int n, int m){
        int countmax = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int countones = 0;

            for(int j = 0; j < m; j++){
                 countones += matrix[i][j];
            }
            if (countones > countmax) {
                countmax = countones;
                index = i;
            }
        } 
        return index;     
    }

    public int rowwithmax1s(int matrix[][], int n, int m){
        int countmax = 0;
        int index = -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int matrix[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = s.nextInt();
            }
        }

         Maximumnumberofone obj = new Maximumnumberofone();
        int ans = obj.Bruterowwithmax1s(matrix, n, m);

        System.out.println(ans);
    }
}
