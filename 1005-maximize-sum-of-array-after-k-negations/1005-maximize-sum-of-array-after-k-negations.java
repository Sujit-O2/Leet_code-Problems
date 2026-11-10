class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
          Arrays.sort(nums);
          int min=0;
int i=0;
while(i<nums.length&&k!=0){
    if(nums[i]<0){
        nums[i]=0-nums[i];
        k--;

    }
    if(nums[min]>nums[i]) min=i;
i++;    
    
}
if(k%2!=0){
        nums[min]=0-nums[min];
    }
    min=0;
    for(i=0;i<nums.length;i++){
        min+=nums[i];
    }
    return min;
        
    }
}