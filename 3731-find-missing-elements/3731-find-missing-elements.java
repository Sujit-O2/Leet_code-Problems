class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        List<Integer> ii=new ArrayList();
        int a1=1;
        for(int i=a+1;i<b;i++){
            if(nums[a1]!=i){
                ii.add(i);
            }
            else{
                a1++;
            }
        }
        return ii;
        
    }
}