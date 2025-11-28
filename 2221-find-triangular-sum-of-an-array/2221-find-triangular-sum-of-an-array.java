class Solution {
    public int triangularSum(int[] nums) {
        List <Integer> aa=new ArrayList();
        for(int i=0;i<nums.length;i++){
        aa.add(nums[i]);
        }
        while(aa.size()!=1){
         List <Integer> a1=new ArrayList();

            
        for(int i=1;i<aa.size();i++)
        {
            a1.add((aa.get(i)+aa.get(i-1))%10);
         }
         aa=a1;
        
    }
    return aa.get(0);

}
}