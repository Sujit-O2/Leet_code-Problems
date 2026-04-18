class Solution {
    public int mirrorDistance(int n) {
        int a=0;
        int b=n;
        while(n!=0){
            a*=10;
            a+=n%10;
            n/=10;
        }
        return Math.abs(b-a);
        
    }
}