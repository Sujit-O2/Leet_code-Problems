class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> aa=new HashMap();
        for(int n:nums){
            aa.put(n,aa.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(int n:aa.keySet()){
            if(aa.get(n)%k==0){
                sum+=n*aa.get(n);
            }
        }
        return sum;
    }
}