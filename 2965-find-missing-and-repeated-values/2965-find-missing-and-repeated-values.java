import java.util.HashMap;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }

        int repeated = -1;
        int missing = -1;
        for (int i = 1; i <= total; i++) {
            int freq = map.getOrDefault(i, 0);

            if (freq == 2) repeated = i;
            if (freq == 0) missing = i;
        }

        return new int[] { repeated, missing };
    }
}
