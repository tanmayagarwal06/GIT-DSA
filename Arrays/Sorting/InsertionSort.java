package Arrays.Sorting;

import java.util.Scanner;

public class InsertionSort {

    /*
     * insertion sort works from right to left
     * if the number to left is smaller than right then it okay
     * if not then the number is swapped from right side
     * Dry Run
     * 3 1 0
     * if 1 > 3
     * swap 1 and 3
     * 0 > 3 and 0 > 1
     * swap 0 with 3 then with 1
     */

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for(int i = 1; i < n; i++){      // Insertion sort
            int key = arr[i];            // variable at right side
            int pos = i - 1;

            while (pos >= 0 && arr[pos] > key) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = key;

    }

    for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
    }
}
}
