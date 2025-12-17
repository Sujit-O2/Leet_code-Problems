class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int s=0;
        for(int a:nums){
            if(a%2==0){
                s|=a;

            }
        }
        return s;
        
    }
}