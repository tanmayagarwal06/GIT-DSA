package Arrays.BinarySearch.BinarySearchonanswer;

import java.util.Scanner;

public class Kokoeatingbanana {

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        // find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        // Binary Search
        while (low < high) {
            int mid = low + (high - low) / 2;
            long hours = 0;

            for (int pile : piles) {
                hours += (pile + mid - 1) / mid; // ceil division
            }

            if (hours <= h) {
                high = mid;       // try smaller speed
            } else {
                low = mid + 1;    // speed too slow
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int length = s.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }

        int h = s.nextInt();

        int result = minEatingSpeed(arr, h);
        System.out.println(result);

        s.close();
    }
}
