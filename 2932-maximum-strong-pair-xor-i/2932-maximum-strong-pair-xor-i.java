class Solution {
    public int maximumStrongPairXor(int[] nums) {
        Set<Map.Entry<Integer, Integer>> set = new HashSet<>();
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])) set.add(Map.entry(nums[i],nums[j]));
            }
            for(var a:set){
                max=Math.max(max,a.getKey()^a.getValue());
            }
        }
        return max;
        
    }
}