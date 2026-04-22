import java.util.*;

class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            suffix[i] = set.size();
        }
        set.clear();
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            int prefixCount = set.size();

            int suffixCount = (i == n - 1) ? 0 : suffix[i + 1];

            diff[i] = prefixCount - suffixCount;
        }

        return diff;
    }
}