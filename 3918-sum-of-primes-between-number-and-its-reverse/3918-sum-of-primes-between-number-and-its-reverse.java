class Solution {
    public int sumOfPrimesInRange(int n) {
        int a=n;
        int b=0;
        while(n!=0){
            b=b*10+n%10;
            n/=10;

        }
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        int sum=0;
        for(int i=min;i<=max;i++){
            boolean t=true;
            if(i<2) continue;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    t=false;
                    break;
                }   

            }
            if(t) sum+=i;

        }
        return sum;
    }
}