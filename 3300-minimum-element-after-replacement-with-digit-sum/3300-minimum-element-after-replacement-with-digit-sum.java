class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int x : nums) {
            int s = digitSum(x);
            min = Math.min(min, s);
        }
        return min;
    }

    private int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
