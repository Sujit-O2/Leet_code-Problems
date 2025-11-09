class Solution {
    public int minimumOperations(int[] nums) {
        int o1=0;
        for(int i:nums){
            if(i%3!=0){
                o1++;
            }
        }
        return o1;
        
    }
}