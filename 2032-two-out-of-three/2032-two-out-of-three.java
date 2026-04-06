class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set <Integer> ii=new HashSet();
        HashMap <Integer,Integer> aa= new HashMap();
        for(int i: nums1){
            ii.add(i);
        }
            for (int val : ii) {
            aa.put(val, aa.getOrDefault(val,0)+1); 
        }
        ii.clear();
        for(int i: nums2){
            ii.add(i);
        }
            for (int val : ii) {
            aa.put(val, aa.getOrDefault(val,0)+1); 
        }
        ii.clear();
        for(int i: nums3){
            ii.add(i);
        }
            for (int val : ii) {
            aa.put(val, aa.getOrDefault(val,0)+1); 
        }
        ii.clear();
        List<Integer>as= new ArrayList();
        for(int a:aa.keySet()){
            if(aa.get(a)>=2){
                as.add(a);
            }
        }
        return as;
    }
}