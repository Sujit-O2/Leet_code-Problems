class Solution {
    public List<String> validStrings(int n) {
        List<String>ll=new ArrayList();
        bact(n,"",ll);
        return ll;


        }
        public void bact(int n,String crr, List<String>Res){
            if(crr.length()==n){
                Res.add(crr);
                return;

            }
            bact(n,crr+"1",Res);
            if(crr.isEmpty()||crr.charAt(crr.length()-1)!='0'){
                bact(n,crr+"0",Res);
            }

        }
    
}