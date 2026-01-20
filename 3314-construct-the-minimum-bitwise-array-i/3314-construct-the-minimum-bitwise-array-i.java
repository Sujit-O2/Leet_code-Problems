class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int a[]=new int[nums.size()];
        int j=0;
        for(int i: nums){
            for(int k=-1;k<i;k++){
                if(i==2){
                    a[j]=-1;
                    break;
                }
                if((k|(k+1))==i){
                    a[j]=k;
                    break;
                }
                else{
                    a[j]=k;
                }
                
                
            }
            j++;


        }
        return a;
        
    }
}