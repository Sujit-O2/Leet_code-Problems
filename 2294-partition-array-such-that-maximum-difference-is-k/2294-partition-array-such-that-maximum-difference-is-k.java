class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(!(nums[i]-nums[a]<=k)){
                cnt++;
                a=i;
            }
        }
        return cnt+1;
    }
}