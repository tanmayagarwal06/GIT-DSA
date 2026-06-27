package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Maximumlengthhashset {
    public int maximumLength(int[] nums) {

        Map<Long, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put((long) x, freq.getOrDefault((long) x, 0) + 1);
        }

        int ans = 1;

        // Special handling for 1
        if (freq.containsKey(1L)) {
            int ones = freq.get(1L);
            ans = (ones % 2 == 0) ? ones - 1 : ones;
        }

        for (long start : freq.keySet()) {

            if (start == 1L)
                continue;

            long curr = start;
            int len = 0;

            while (freq.getOrDefault(curr, 0) >= 2) {
                len += 2;

                // Prevent overflow when squaring
                if (curr > (long) Math.sqrt(Long.MAX_VALUE))
                    break;

                curr = curr * curr;
            }

            if (freq.getOrDefault(curr, 0) == 1) {
                len++;
            } else if (len > 0) {
                len--;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}
