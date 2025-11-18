class Solution {
    public int differenceOfSum(int[] nums) {
        int tsum=0;
        int dsum=0;
        for(int i:nums){
            tsum+=i;
            int n=i;
            while(n!=0){
            dsum+=n%10;
            n=n/10;
            }


        }
        return Math.abs(tsum-dsum);
        
    }
}