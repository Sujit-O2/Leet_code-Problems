class Solution {
    public int countCommas(int n) {
        int cnt =0;
        int a=n;

        while (n!=0){
            cnt++;
            n/=10;
        }
        if(cnt<=3)return 0;
        return a-1000+1;

        
    }
}