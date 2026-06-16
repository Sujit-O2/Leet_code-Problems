class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> aa=new HashMap();
        while(n!=0){
           int a=n%10;
            n=n/10;
            aa.put(a , aa.getOrDefault(a,0)+1);
        }
        int c=0;
        for(int b: aa.keySet()){
            c+=b*aa.get(b);
        }
        return c;
        
    }
}