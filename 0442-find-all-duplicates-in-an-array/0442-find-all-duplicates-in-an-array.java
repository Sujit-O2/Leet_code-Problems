class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> aa=new HashMap();
        for(int i:nums){
            aa.put(i,aa.getOrDefault(i,0)+1);
        }
        List<Integer>  aa1=new ArrayList();
        for(int a :aa.keySet()){
            if(aa.get(a)>1){
                aa1.add(a);
            }
        }
        return aa1;
        
    }
}