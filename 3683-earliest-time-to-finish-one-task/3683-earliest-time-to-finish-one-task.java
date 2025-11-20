class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        for (int[] task : tasks) {
            int finish = task[0] + task[1];
            ans = Math.min(ans, finish);
        }
        return ans;
    }
}
