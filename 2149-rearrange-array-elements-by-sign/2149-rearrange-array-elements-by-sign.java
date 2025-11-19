class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer>even=new ArrayList();
        List<Integer>odd=new ArrayList();
        for(int i:nums){
            if(i>=0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
       int i=0;
        while(i<nums.length){
            nums[i++]=even.get(0);
            nums[i++]=odd.get(0);
            even.remove(0);
            odd.remove(0);

        }
        return nums;

        
    }
}