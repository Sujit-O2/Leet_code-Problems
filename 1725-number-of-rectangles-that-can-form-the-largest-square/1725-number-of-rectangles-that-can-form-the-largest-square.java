class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int a[] =new int[ rectangles.length];
        int i=0;
        for(int i1[]: rectangles){
            a[i]=Math.min(i1[0],i1[1]);
            i++;
        }
        Arrays.sort(a);
        int cnt=0;
        int val=a[a.length-1];
        for(int i2=a.length-1;i2>=0;i2--){
            if(a[i2]<val){
                break;
            }
            cnt++;
        }
       
        return cnt;

        
    }
}