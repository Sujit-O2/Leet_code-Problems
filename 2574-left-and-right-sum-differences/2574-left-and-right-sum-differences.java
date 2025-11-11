class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sumleft=0;
            int sumrigth=0;
            for(int j=i-1;j>=0;j--){
                sumleft+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                sumrigth+=nums[j];
            }
            a[i]=Math.abs(sumleft-sumrigth);

        }
        return a;
        
    }
}