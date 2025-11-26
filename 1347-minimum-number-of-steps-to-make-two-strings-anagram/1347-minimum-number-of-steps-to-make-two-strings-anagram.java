class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> aa=new HashMap();
        Map<Character,Integer> a1=new HashMap();
        int cnt=0;
        for(char c: s.toCharArray()){
            aa.put(c,aa.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            a1.put(c,a1.getOrDefault(c,0)+1);
        }
        for(char c: aa.keySet()){
            if(aa.get(c)>a1.getOrDefault(c,0)){
                cnt+=aa.get(c)-a1.getOrDefault(c,0);

            }
        }
        return cnt;
        
    }
}