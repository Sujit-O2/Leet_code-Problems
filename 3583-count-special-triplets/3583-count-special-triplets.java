import java.util.*;

class Solution {
    public int specialTriplets(int[] nums) {
        final int MOD = 1000000007;

        int n = nums.length;
        long ans = 0;

        // Count all numbers first
        Map<Integer, Integer> right = new HashMap<>();
        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0) + 1);
        }

        Map<Integer, Integer> left = new HashMap<>();

        for (int j = 0; j < n; j++) {
            int mid = nums[j];

            right.put(mid, right.get(mid) - 1);

            int need = mid * 2;

            long leftCnt = left.getOrDefault(need, 0);
            long rightCnt = right.getOrDefault(need, 0);

            ans = (ans+leftCnt * rightCnt)%MOD;

            left.put(mid, left.getOrDefault(mid, 0) + 1);
        }

        return (int)ans;
    }
}
