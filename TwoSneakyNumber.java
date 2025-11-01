import java.util.HashMap;
import java.util.Map;

public class TwoSneakyNumber {
    
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> aa=new HashMap<>();
        int a[]=new int[2];
        int i=0;
        for(int num: nums){
            aa.put(num,aa.getOrDefault(num,0)+1);
            if(aa.get(num)==2){
                a[i]=num;
                i++;
            }

        }
        return a;
        
    }
}