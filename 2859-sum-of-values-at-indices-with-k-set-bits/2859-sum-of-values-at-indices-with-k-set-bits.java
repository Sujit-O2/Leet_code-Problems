class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int i=0;
        int sum=0;
        for(int a:nums){
            if(Integer.bitCount(i)==k){
                sum+=a;

            }
            i++;

        }
        return sum;
        
    }
}