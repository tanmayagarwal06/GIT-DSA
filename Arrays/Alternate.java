package Arrays;

import java.util.*;

public class Alternate {
    

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        // Step 1: Separate positives and negatives
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0) pos.add(A.get(i));
            else neg.add(A.get(i));
        }

        // Step 2: Merge them back
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, 0)); // initialize with size n

        if (pos.size() < neg.size()) {
            // Fill alternately until positives run out
            for (int i = 0; i < pos.size(); i++) {
                res.set(2 * i, pos.get(i));
                res.set(2 * i + 1, neg.get(i));
            }
            // Add remaining negatives
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                res.set(index++, neg.get(i));
            }
        } else {
            // Fill alternately until negatives run out
            for (int i = 0; i < neg.size(); i++) {
                res.set(2 * i, pos.get(i));
                res.set(2 * i + 1, neg.get(i));
            }
            // Add remaining positives
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                res.set(index++, pos.get(i));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            A.add(s.nextInt());  // use add() instead of []
        }

        ArrayList<Integer> ans = RearrangebySign(A, n);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
