class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int a[]=new int[k];
        for(int i=0;i<k;i++){
            a[k-1-i]=nums[nums.length-1-i];  
        }
        for(int i=nums.length-1;i>k-1;i--){
            nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i]=a[i];
        }
        
        
    }
}