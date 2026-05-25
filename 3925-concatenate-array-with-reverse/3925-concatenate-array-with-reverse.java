class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n[]= new int[nums.length*2];
        int a=0;
        for(int i=0;i<nums.length;i++){
            n[a]=nums[i];
            a++;
        }
        for(int i=nums.length-1;i>-1;i--){
            n[a]=nums[i];
            a++;
        }
        return n;
        
    }
}