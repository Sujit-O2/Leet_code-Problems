class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]>aa=new ArrayList();
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<intervals.length;i++){
           if(aa.isEmpty()||aa.get(aa.size()-1)[1]<intervals[i][0]){
            aa.add(new int[]{intervals[i][0],intervals[i][1]});
           }
           else{
            aa.get(aa.size()-1)[1]=Math.max(intervals[i][1],aa.get(aa.size()-1)[1]);
            
           }

        }
        for(int i=0;i< aa.size();i++){
                    System.out.println(aa.get(i)[0]);

        }
        return aa.toArray(new int [aa.size()][]);

        
        
    }
}