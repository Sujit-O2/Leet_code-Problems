public class subarrayKdiff {
    
}
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count =0;
 
                for(int j=0;j<=nums.length-1;j++){
                int unk=0;
                for(int k1=j;k1<nums.length;k1++){
                    
                    if(nums[k1]!=nums[j]){
                        unk++;
                    }
                    if(unk==k){
                        count++;
                    }
                    if(unk>k)break;
                    
                }
                }
        return count;
        
    }
}