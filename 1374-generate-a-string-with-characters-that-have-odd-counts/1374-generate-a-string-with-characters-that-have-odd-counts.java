class Solution {
    public String generateTheString(int n) {
        StringBuffer bb=new StringBuffer();
        if(n%2==0){
            for(int i=0;i<n-1;i++){
                bb.append("a");
            }
            bb.append("b");
        }
        else{
            for(int i=0;i<n;i++){
                bb.append("a");
            }

        }
        return bb.toString();
        
    }
}