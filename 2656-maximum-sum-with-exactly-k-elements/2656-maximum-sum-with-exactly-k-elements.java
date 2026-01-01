class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int val=nums[nums.length-1];
        int sum=0;
        while(i<k){
            sum += val;
            val++;
            i++;
        }
        return sum;
        
    }
}