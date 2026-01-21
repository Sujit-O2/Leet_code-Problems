class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> aa=new HashMap();
        for(int i:nums){
            aa.put(i,aa.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(int a: aa.keySet()){
            if(aa.get(a)==1){
                sum+=a;
            }

        }
        return sum;
        
    }
}