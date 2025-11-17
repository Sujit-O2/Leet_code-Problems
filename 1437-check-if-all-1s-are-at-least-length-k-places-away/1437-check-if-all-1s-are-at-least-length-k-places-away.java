
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (temp != -1 && i - temp - 1 < k) {
                    return false;
                }
                temp = i;
            }
        }
        return true;
    }
}

