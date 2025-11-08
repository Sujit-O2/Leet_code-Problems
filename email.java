import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> s=new HashSet();
        for(String ss: emails){
            int  did=ss.indexOf("@");
            
            StringBuilder bb=new StringBuilder();
            int pls=ss.indexOf("+");
           if (pls == -1 || pls > did) {
                pls = did;
            }

            String s1=ss.substring(0,pls);
           s1= s1.replace(".","");
            
            bb.append(s1+ss.substring(did,ss.length()));
            s.add(bb.toString());
            



            

        }
        return s.size();
        
    }
}