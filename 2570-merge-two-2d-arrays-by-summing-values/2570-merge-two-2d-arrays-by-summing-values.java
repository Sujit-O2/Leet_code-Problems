class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] x : nums1) {
            map.put(x[0], x[1]);
        }

        for (int[] x : nums2) {
            map.put(x[0], map.getOrDefault(x[0], 0) + x[1]);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int[][] result = new int[keys.size()][2];
        int idx = 0;

        for (int k : keys) {
            result[idx][0] = k;
            result[idx][1] = map.get(k);
            idx++;
        }

        return result;
    }
}
