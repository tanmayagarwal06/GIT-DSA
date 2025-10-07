package Hashmap;

import java.util.*;



public class ArrayIntersection {
    
    public static void Intersection(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> freq = new HashMap<>();
         for (int i = 0; i < arr1.length; i++) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        }

        // Step 2: Traverse arr2
        for (int i = 0; i < arr2.length; i++) {
            if (freq.containsKey(arr2[i]) && freq.get(arr2[i]) > 0) {
                System.out.println(arr2[i] + " ");
                freq.put(arr2[i], freq.get(arr2[i]) - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for(int i = 0; i < n; i++){
            arr1[i] = s.nextInt();

        }

        for(int j = 0; j < n; j++){
            arr2[j] = s.nextInt();
        }

        Intersection(arr1, arr2);



    }
}
