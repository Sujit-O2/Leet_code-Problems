class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int a[]=new int[n];
        for(List<Integer>i: edges){
            a[i.get(1)]++;

        }
        List<Integer> ii=new ArrayList();
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                ii.add(i);
            }
        }
        return ii;
        
    }
}