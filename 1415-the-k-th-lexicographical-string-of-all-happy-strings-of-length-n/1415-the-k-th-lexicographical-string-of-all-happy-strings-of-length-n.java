class Solution {
    public String getHappyString(int n, int k) {
        int total= 3*(int)Math.pow(2,n-1);
        if(total<k) return "";
        char c1='1';
        StringBuffer bb=new StringBuffer();
        for(int i=0;i<n;i++){
            for(char c: new char[]{'a','b','c'}){
                if(c1==c) continue;
                int rem =n-i-1;
                int cnt =(int)Math.pow(2,rem);
                if(k>cnt){
                    k-=cnt;

                }
                else{
                    bb.append(c);
                    c1=c;
                    break;
                }

            }
        }
        return bb.toString();
        
    }
}