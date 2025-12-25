class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int b=0;
        while(a!=0){
            b=b*10+a%10;
            System.out.println(b);
            a/=10;
            
        }
        return Math.abs(b-n);
        
    }
}