class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList <String>aa=new ArrayList();
        BackTrack(aa,new StringBuilder(""),0,0,n);
        return aa;

        
    }
    void BackTrack(ArrayList<String> aa,StringBuilder s,int opn,int clos,int n){
        if(s.length()==2*n){
            aa.add(s.toString());
        }
        if(opn<n){
            s.append("(");
            BackTrack(aa,s,opn+1,clos,n);
            s.deleteCharAt(s.length()-1);
        }
        if(clos<opn){
            s.append(")");
             BackTrack(aa,s,opn,clos+1,n);
            s.deleteCharAt(s.length()-1);

        }
    }
}