class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer>aa= new HashMap();
        for(int i=0;i<nums.length;i++){
            aa.put(nums[i],aa.getOrDefault(nums[i],0)+1);

        }
        int cnt =0;
        for(int i:aa.keySet()){
            if(aa.get(i)==2){
                cnt ^=i;
                
            }
        }
        return cnt;
    }
}