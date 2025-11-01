import java.util.HashMap;
import java.util.Map;

public class NextGreaterNumerically {
    
}
class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;;i++){
            if(isvalid(i))return i;
        }
        
    }

    private boolean isvalid(int n) {
        Map<Integer,Integer>ii=new HashMap<>();
    while(n>0){
        int a=n%10;
        if(a==0)return false;
        ii.put(a,ii.getOrDefault(a,0)+1);
        n/=10;



    }   
    for(int a:ii.keySet()){
        if(a!=ii.get(a)){
            return false;
        }
    }
    return true;
    
    }
}