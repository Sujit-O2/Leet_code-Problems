public class BuddyString {
    
}
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return s.chars().distinct().count()<s.length();

        }
        int i1=-1,j=-1;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(cnt>2) return false;
                if(i1>=0){
                    j=i;
                }
                else{
                    i1=i;
                }
                cnt++;
            }

        }
        return s.charAt(i1)==goal.charAt(j)&&s.charAt(j)==goal.charAt(i1);
        
    }
}