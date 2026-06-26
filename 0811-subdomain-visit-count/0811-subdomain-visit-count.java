class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String ,Integer> aa=new HashMap();
        for(String s:cpdomains ){
            String a[]=s.split(" ");
            int ab=Integer.parseInt(a[0]);
            String as[]=a[1].split("\\.");
            String s1="";
            for(int i=as.length-1;i>-1;i--){
                if(s1.isEmpty()){
                    s1=as[i];
                }
                else{
                    s1=as[i]+"."+s1;
                }
                aa.put(s1,aa.getOrDefault(s1,0)+ab);
            }

        }
        List<String> ans = new ArrayList<>();

        for (String key : aa.keySet()) {
            ans.add(aa.get(key) + " " + key);
        }

        return ans;

    }
}