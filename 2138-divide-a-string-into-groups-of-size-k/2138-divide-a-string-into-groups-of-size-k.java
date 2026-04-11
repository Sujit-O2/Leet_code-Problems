class Solution {
    public String[] divideString(String s, int k, char fill) {
        int a= s.length()/k;
        int b= s.length()%k;
        if( b>0){
            a++;
        }
        String s1[]=new String[a];
        int a1=0;


        for(int i=0;i<s.length();i+=k){
        int end = Math.min(i + k, s.length());

            s1[a1]=s.substring(i,end);
            a1++;

        }
        if(b>0){
            StringBuffer bb= new StringBuffer(s1[s1.length-1]);
            for(a=0;a<k-b;a++){
                bb.append(fill+"");

                
            }
            s1[s1.length-1]= bb.toString();
        }
        return s1;
        
    }
}