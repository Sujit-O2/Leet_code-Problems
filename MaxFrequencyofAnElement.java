import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyofAnElement { }

class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> original = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            original.put(num, original.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            for (int step = -k; step <= k; step++) {
                int newVal = num + step;
                freq.put(newVal, freq.getOrDefault(newVal, 0) + 1);
            }
        }

        for (int val : freq.keySet()) {
            int reachable = freq.get(val);
            int already = original.getOrDefault(val, 0);
            int possible = already + Math.min(numOperations, reachable - already);
            max = Math.max(max, possible);
        }

        return max;
    }
}
