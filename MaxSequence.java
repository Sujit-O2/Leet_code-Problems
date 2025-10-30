import java.util.HashMap;
import java.util.Map;

public class MaxSequence {
    
}
class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen=0;
        int left=0;
        int maxfrq=0;
        Map<Character,Integer>a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i), 0)+1);
            maxfrq=Math.max(maxfrq,a.get(s.charAt(i)));
            while(i-left+1-maxfrq>k){
                  char leftChar = s.charAt(left);
                a.put(leftChar,a.get(leftChar)-1);
                left++;
            }
            maxlen=Math.max(maxlen,i-left+1);

        }
        return maxlen;
        
        
    }
}