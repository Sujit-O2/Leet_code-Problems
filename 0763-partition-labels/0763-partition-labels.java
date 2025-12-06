class Solution {
    public List<Integer> partitionLabels(String s) {
         List<Integer> ll=new ArrayList();
         int maxdis=0;
         int start=0;
         for(int i=0;i<s.length();i++){
            maxdis=Math.max(maxdis,s.lastIndexOf(s.charAt(i)));

        
            if(i==maxdis){
                ll.add(maxdis-start+1);
                start=i+1;
        }

         }
         return ll;
        
    }
}