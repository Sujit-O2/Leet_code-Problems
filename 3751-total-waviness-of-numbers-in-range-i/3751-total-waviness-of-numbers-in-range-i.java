class Solution {
    public int totalWaviness(int num1, int num2) {
        int peek=0,valley=0;
        for(int i=num1;i<=num2;i++){
            String ss=i+"";
            char s[]=ss.toCharArray();

            for(int j=1;j<s.length-1;j++){
                if(s[j]>s[j+1]&&s[j]>s[j-1]){
                    peek++;
                }
                else if(s[j]<s[j+1]&&s[j]<s[j-1]){
                    valley++;

                }


            }
        }
        System.out.println(peek+" "+valley);
        return peek+valley;
        
    }
}