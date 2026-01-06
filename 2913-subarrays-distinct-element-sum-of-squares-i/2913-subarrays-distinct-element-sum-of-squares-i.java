class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int j=i;
            Set<Integer> ii=new HashSet();
            while(j<nums.size()){
                ii.add(nums.get(j));
                int cnt=ii.size();
                sum+=cnt*cnt;
                j++;
            }
        }
        return sum;
    }
}