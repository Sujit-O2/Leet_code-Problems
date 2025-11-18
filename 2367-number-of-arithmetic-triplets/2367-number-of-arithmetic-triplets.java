class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int a=0;

        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(Math.abs(nums[i]-nums[j])==diff){
                    cnt++;
                }

            }
            if(cnt>=2){
                a++;
            }
        }
        return a;
        
    }
}