class Solution {
    public long removeZeros(long n) {
        long n1=0;
        while(n!=0){
         long a=n%10;
         if(a!=0)n1=n1*10+a;
         n/=10;

        }
        n=0;
        while(n1!=0){
            long a=n1%10;
            n=n*10+a;
            n1/=10;

        }
        return n;
        
    }
}