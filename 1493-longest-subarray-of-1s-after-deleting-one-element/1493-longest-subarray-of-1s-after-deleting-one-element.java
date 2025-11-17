class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zcnt=0;
        int maxCnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zcnt++;
            }
            
                while(zcnt>1){
                    if(nums[left]==0){
                        zcnt--;                    
                    }
                    left++;
                }
            
            maxCnt=Math.max(maxCnt,i-left);


        }
        return maxCnt;
        
    }
}