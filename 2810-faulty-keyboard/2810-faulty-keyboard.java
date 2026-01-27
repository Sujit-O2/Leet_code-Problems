class Solution {
    public String finalString(String s) {
        StringBuffer bb=new StringBuffer();
        for(char c: s.toCharArray()){
            if(c=='i'){
                bb.reverse();
            }
            else{
                bb.append(c);
            }
        }
        return bb.toString();
        
    }
}