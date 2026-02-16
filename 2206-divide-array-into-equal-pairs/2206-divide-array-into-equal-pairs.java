class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> as=new HashMap();
        for(int i: nums){
            as.put(i,as.getOrDefault(i,0)+1);
        }
        for(int i: as.keySet()){
            if(as.get(i)%2!=0)return false;
        }
        return true;
        
    }
}