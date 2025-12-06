class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>dds =new ArrayList();
        dds.add(new ArrayList());
        for(int a:nums){
            int n=dds.size();
            for(int i=0;i<n;i++){
                List<Integer> aa=new ArrayList(dds.get(i));
                aa.add(a);
                dds.add(aa);

            }
        }
        return dds;
        
    }
}