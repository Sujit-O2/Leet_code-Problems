class Solution {
    public int subarraySum(int[] nums) {
        int sum=nums[0];
        int start=0;
        for(int i=1;i<nums.length;i++){
            start=Math.max(0,i-nums[i]);
            int sun=0;
            for(int j=start;j<=i;j++){
                sum+=nums[j];
                

            }
            sum+=sun;

        }
        return sum;

        
    }
}