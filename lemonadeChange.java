public class lemonadeChange {
    
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fr=0;
        int tr=0;
        for(int a:bills){
            if(a==5){
                fr++;
            }
            else if(a==10&&fr>0){
                tr++;
                fr--;
            }
            else if(a==20&&fr>=3||(fr>0&&tr>0)){
                if(fr>0&&tr>0){
                    fr--;
                    tr--;
                }
                else{
                    fr-=3;
                }


            }
            else  return false;
                
                }
                return true;
            }
        
        
    }
