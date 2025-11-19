class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int arr[]=new int[nums.length];
        int k=0;
        int xor=0;
        for(int i:nums){
            xor^=i;
            
        }
        int j=0;
        int maxval=(1<<maximumBit)-1; //for 3 011 << 110 4+2=6 6-1 5
        //2^3 
        for(int i=nums.length-1;i>=0;i--){
            
            arr[j]=xor^maxval;
            xor^=nums[i];
            j++;

        }
        return arr;
        
    }
}