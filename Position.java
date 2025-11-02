import java.util.ArrayList;
import java.util.List;

public class Position {
    
}
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int len=1;
        char prev=s.charAt(0);
        List<List<Integer>> l1=new ArrayList<>(); 
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==prev){
                len++;
            }
            else{
                if(len>=3){
                    List<Integer> ii=new ArrayList<>();
                    ii.add(i-len);
                    ii.add(i-1);
                   l1.add(ii);
                    
                }
                prev=s.charAt(i);
                 len=1;
                    
            }


        }
        if (len >= 3) {
            List<Integer> group = new ArrayList<>();
            group.add(s.length() - len);
            group.add(s.length() - 1);
            l1.add(group);
        }
        return l1;
        
    }
}