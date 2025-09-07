package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencySearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(freq);

        s.close(); // ✅ Always good to close Scanner
    }
}
