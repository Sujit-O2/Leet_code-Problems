class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ii=new ArrayList();
        for(int i=0;i<nums.length;i+=2){
            int frq=nums[i];
            int val=nums[i+1];
            for(int j=frq;j>0;j--){
                ii.add(val);
            }
            

        }
        int a[]=new int[ii.size()];
        int aaa=0;
        for(int i: ii){
            a[aaa++]=i;

        }
        return a;
        
    }
}