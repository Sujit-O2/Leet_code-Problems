class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];

            int count = 0;

            for (int[] p : points) {
                int qx = p[0];
                int qy = p[1];

                int dx = qx - x;
                int dy = qy - y;

                if (dx * dx + dy * dy <= r * r) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
