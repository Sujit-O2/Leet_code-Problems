class Solution {
    public int repeatedNTimes(int[] nums) {
        int n= nums.length/2;
        Map<Integer,Integer> aa=new HashMap();
        for(int i: nums){
            aa.put(i,aa.getOrDefault(i,0)+1);
        }
        for(int i: aa.keySet()){
            if(aa.get(i)==n){
                return i;
            }
        }

        return 0;
    }
}