public class grumpy {
    
}
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int hap=0;
        int l=0;
        int xt=0;
        int c1=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                hap+=customers[i];
            }
            if(grumpy[i]==1){
                    xt+=customers[i];
                }
                if(i-l+1>minutes){
                    if(grumpy[l]==1){
                        xt-=customers[l];
                    }
                    l++;
                }
                c1=Math.max(c1,xt);
            }
           
            return hap+c1;

            
        }
        
    }