class Solution {
    public int minMoves(int[] nums) {
        int a=0;
        for(int i:nums){
            a=Math.max(a,i);
        }
        int b=0;
        for(int i:nums){
            b+= a-i;

        }
        return b;
        
    }
}