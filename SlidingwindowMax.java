public class SlidingwindowMax {
    
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int as[]=new int[nums.length-k+1];
        if(k==1) return nums;


        for(int i=k;i<nums.length;i++){
            int left=i-k;
            int max=nums[i];
            while(left<i){
                max=Math.max(max,nums[left]);
                left++;

            }
            
        }
        return as;
    }
}