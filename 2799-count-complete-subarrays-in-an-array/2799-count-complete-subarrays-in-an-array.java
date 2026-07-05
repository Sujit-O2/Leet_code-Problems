class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> aa=new HashSet();
        for(int i:  nums){
            aa.add(i);
        }
        int totald=aa.size();
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>aa1=new HashSet();
            for(int j=i;j<nums.length;j++ ){
                aa1.add(nums[j]);if(totald==aa1.size()) cnt++;
            } 
            
        }
        return cnt;

    }
}