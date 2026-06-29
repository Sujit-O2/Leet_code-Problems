class Solution {
        List<Integer> aa=new ArrayList();

    public List<Integer> lexicalOrder(int n) {
        int a=1;
        for(int i=1;i<=9;i++){
            dfs(i,n);
        }
        return aa;
        
    }
    void dfs(int i,int n){
        if(i>n) return;
        aa.add(i);

        for(int j=0;j<=9;j++){
            dfs(i*10+j,n);

        }
    }
}