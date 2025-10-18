package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class SumpairZero {
    
    public static int Pair(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int count = 0;

        for(int i : freq.keySet()){
            int neg = -i;

            if (i == 0) {
                int f = freq.get(i);
                count += (f * (f - 1))/2;
                

            }
            else if (freq.containsKey(neg)) {
                count += freq.get(i) * freq.get(neg);
                freq.put(neg, 0);
            }
        }
        return count;
        
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        Pair(arr);
    }
}
