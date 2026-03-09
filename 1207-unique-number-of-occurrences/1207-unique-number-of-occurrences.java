class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> aa=new HashMap();
        for(int i:arr){
            aa.put(i,aa.getOrDefault(i,0)+1);
        }
        HashSet<Integer> aa1=new HashSet();
        for(int i: aa.keySet()){
            if(aa1.contains(aa.get(i))){
                return false;
            }
            aa1.add(aa.get(i));


        }
        return true;

    }
}