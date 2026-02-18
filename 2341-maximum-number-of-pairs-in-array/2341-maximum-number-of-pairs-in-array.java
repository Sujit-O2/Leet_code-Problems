class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> aa= new HashMap();
        for(int i: nums){
            aa.put(i,aa.getOrDefault(i,0)+1);

        }
        int val=0;
        int w=0;
        for(int i:aa.keySet()){
            val+=aa.get(i)/2;
            w+=aa.get(i)%2;
            
        }
        int a[]=new int[]{val,w};
        return a;

        
    }
}