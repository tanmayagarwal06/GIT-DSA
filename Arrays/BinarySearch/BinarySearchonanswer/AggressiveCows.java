package Arrays.BinarySearch.BinarySearchonanswer;

import java.util.*;

public class AggressiveCows {

    // Function to check if we can place cows with minimum distance = dist
    private static boolean canPlaceCows(int[] stalls, int cows, int dist) {
        int count = 1;              // first cow placed at first stall
        int lastPlaced = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= dist) {
                count++;
                lastPlaced = stalls[i];
            }
            if (count >= cows) return true;
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);        // mandatory

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, cows, mid)) {
                ans = mid;          // possible, try bigger
                low = mid + 1;
            } else {
                high = mid - 1;     // not possible, try smaller
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10};
        int cows = 4;

        System.out.println(aggressiveCows(stalls, cows));
    }
}
