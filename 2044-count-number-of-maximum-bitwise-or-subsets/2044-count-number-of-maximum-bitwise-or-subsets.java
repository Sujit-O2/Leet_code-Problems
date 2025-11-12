class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int target = 0;
        for (int v : nums) target |= v;
        return dfs(nums, 0, 0, target);
    }

    private int dfs(int[] nums, int idx, int curOr, int target) {
        if (idx == nums.length) {
            return curOr == target ? 1 : 0;
        }
        int count = dfs(nums, idx + 1, curOr, target);
        count += dfs(nums, idx + 1, curOr | nums[idx], target);
        return count;
    }
}
