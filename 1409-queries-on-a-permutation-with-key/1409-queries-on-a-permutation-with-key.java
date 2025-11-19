class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 1; i <= m; i++) {
            arr.add(i);
        }

        int n = queries.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int q = queries[i];

            int idx = arr.indexOf(q);
            result[i] = idx;
            arr.remove(idx);
            arr.add(0, q);
        }

        return result;
    }
}
