package Arrays.Sorting;

import java.util.Scanner;

public class SelectionSort {
    
    /*
     * find the smallest term
     * swap it with the term at the place it has to be
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt(); 
        }

        for (int i = 0; i < n; i++) {
            int minindex = i;

             for(int j = i+1; j< n; j++){

                if (arr[j] < arr[minindex]) {
                    minindex = j;
            }
        }

        int temp = arr[minindex];
        arr[minindex] = arr[i];
        arr[i] = temp;

       
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }
    }

}
