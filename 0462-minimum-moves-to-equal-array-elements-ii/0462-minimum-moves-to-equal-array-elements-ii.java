class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int a =nums.length/2;
        int val= nums[a];
        int sum=0;
        for(int i:nums){
            sum+=(Math.abs(i-val));
        }
        return sum;
        
    }

}