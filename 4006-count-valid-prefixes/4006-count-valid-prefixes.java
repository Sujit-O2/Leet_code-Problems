class Solution {
    public int countValidPrefixes(String s) {
        int valid=0;
        int zos=0;
        int ons=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                ons++;
            }
            else zos++;
            if(ons==zos || Math.abs(ons-zos)==1){
                valid++;
            }
        }
        return valid;
        
    }
}