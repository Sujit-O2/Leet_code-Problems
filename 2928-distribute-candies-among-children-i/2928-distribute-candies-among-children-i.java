class Solution {
    public int distributeCandies(int n, int limit) {
        int cnt=0;
         for(int i=0;i<=limit;i++){
            int rem=n-i;
            if(rem<0)break;
            int min=Math.max(0,rem-limit);
            int max=Math.min(limit,rem);
            if(min<=max)cnt+=max-min+1;
         }
         return cnt;
        
    }
}