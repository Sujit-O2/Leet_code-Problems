class Solution {
    int MOD = 1_000_000_007;

    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        // dp[i][j][mod] = ways
        Integer[][][] dp = new Integer[n][m][k];

        return solve(dp, grid, k, 0, 0, 0);
    }

    private int solve(Integer[][][] dp, int[][] grid, int k, int i, int j, int mod) {
        int n = grid.length, m = grid[0].length;

        // Out of bounds
        if (i >= n || j >= m) return 0;

        int newMod = (mod + grid[i][j]) % k;

        // If at last cell
        if (i == n - 1 && j == m - 1) {
            return newMod == 0 ? 1 : 0;
        }

        // Memo
        if (dp[i][j][newMod] != null) return dp[i][j][newMod];

        long ways = 0;

        // Move down
        ways += solve(dp, grid, k, i + 1, j, newMod);
        // Move right
        ways += solve(dp, grid, k, i, j + 1, newMod);

        dp[i][j][newMod] = (int)(ways % MOD);
        return dp[i][j][newMod];
    }
}
