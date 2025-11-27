class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer,Set<Integer>> aa=new HashMap();

        for(int i=0;i<logs.length;i++){
            aa.putIfAbsent(logs[i][0],new HashSet());
            aa.get(logs[i][0]).add(logs[i][1]);
        }
        int a[]=new int[k];
        for(int ab:aa.keySet()){
            int am=aa.get(ab).size();
            a[am-1]++;
        }
        return a;
    }
}