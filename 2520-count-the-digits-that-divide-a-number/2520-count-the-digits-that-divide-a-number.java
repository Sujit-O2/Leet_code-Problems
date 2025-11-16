class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int nu1=num;
        while(num!=0){
            if(nu1%(num%10)==0){
                cnt++;
            }
            num/=10;
        }
       
        return cnt;
        
    }
}