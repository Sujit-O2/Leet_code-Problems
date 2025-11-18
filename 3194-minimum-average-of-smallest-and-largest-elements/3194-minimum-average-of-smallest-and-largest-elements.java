class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        double minAvg = Double.MAX_VALUE;
        
        int left = 0, right = n - 1;
        
        while (left < right) {
            double avg = (nums[left] + nums[right]) / 2.0;
            minAvg = Math.min(minAvg, avg);
            left++;
            right--;
        }
        
        return minAvg;
    }
}
