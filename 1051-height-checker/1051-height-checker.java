class Solution {
    public int heightChecker(int[] heights) {
        int cnt=0;
        int a[]=heights.clone();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]!=heights[i]){
                cnt++;
            }
        }

        return cnt;
    }
}