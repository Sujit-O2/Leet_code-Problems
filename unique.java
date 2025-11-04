import java.util.HashSet;
import java.util.Set;

class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> ss=new HashSet();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0 )continue;
            for(int j=0;j<digits.length;j++){
                if(i==j) continue;
                for(int k=0;k<digits.length;k++){
                if(i==k||k==j) continue;
                 int sum = digits[i] * 100 + digits[j] * 10 + digits[k];
                if(sum%2==0)
                ss.add(sum);

            }

            }
            
        }
        return ss.size();
        
    }
}