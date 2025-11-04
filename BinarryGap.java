public class BinarryGap {
    
}
class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int i=0;
        int maxdis=0;
        while (i<s.length()) {
            if(s.charAt(i)=='1'){
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        maxdis=Math.max(maxdis,j-i+1);
                        break;

                    }
                }
            }
            i++;
            
        }
        return maxdis;
        
    }
}